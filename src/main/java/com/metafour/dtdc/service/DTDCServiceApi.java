package com.metafour.dtdc.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metafour.dtdc.model.CalculateRates;
import com.metafour.dtdc.model.CalculateRatesResponse;
import com.metafour.dtdc.model.Shipment;
import com.metafour.dtdc.model.ShipmentResponse;
import com.metafour.dtdc.model.TracksResponse;

import feign.Feign;
import feign.Logger;
import feign.Param;
import feign.RequestLine;
import feign.Response;
import feign.codec.ErrorDecoder;
import feign.httpclient.ApacheHttpClient;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;

/**
 * DTDC json service http client API
 * 
 * @author Jahirul Islam
 * @since Mar 4, 2019
 * @version 1.0.0
 */

public interface DTDCServiceApi {

	/**
	 * Calculate Rates
	 * 
	 * @param calculateRates {@link CalculateRates}
	 * @return {@link CalculateRatesResponse}
	 */
	@RequestLine("POST /rates")
	CalculateRatesResponse calculateRates(CalculateRates calculateRates);

	/**
	 * Shipment
	 * 
	 * @param shipments A list of {@link Shipment}
	 * @return A list of {@link ShipmentResponse}
	 */
	@RequestLine("POST /shipments")
	List<ShipmentResponse> shipments(List<Shipment> shipments);

	/**
	 * Calculate Rates
	 * 
	 * @param referenceNumber Tracking number.
	 * @return {@link TracksResponse}
	 */
	@RequestLine("GET /tracks?ReferenceNumber={referenceNumber}")
	TracksResponse tracks(@Param("referenceNumber") String referenceNumber);

	/**
	 * Initialize DTDC http client json service 
	 * 
	 * @param baseUri DTDC base url (e.g. https://api.postshipping.com/api2)
	 * @param token Valid token to connect DTDC Service 
	 * @param fileName Logger file name where to logging requests and responses
	 * @return {@link DTDCServiceApi}
	 */
	static DTDCServiceApi connect(final String baseUri, String token, String fileName) {

		ObjectMapper mapper = new ObjectMapper()
				.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
				.enable(DeserializationFeature. ACCEPT_SINGLE_VALUE_AS_ARRAY);
		return Feign.builder().client(new ApacheHttpClient(newHttpClient(fileName)))
				.encoder(new JacksonEncoder(mapper))
				.decoder(new JacksonDecoder(mapper))
				.errorDecoder(new Status400Decoder(mapper))
				.logger(new Slf4jLogger())
				.logLevel(Logger.Level.FULL)
				.requestInterceptors(Arrays.asList(new ApiRequestInterceptor(token), new LoggingRequestInterceptor(fileName)))
				.target(DTDCServiceApi.class, baseUri);
	}

	static HttpClient newHttpClient(String logFile) {
		return	HttpClientBuilder.create().addInterceptorFirst(new LoggingResponseInterceptor(logFile)).build();
	}

	static class Status400Decoder implements ErrorDecoder {
		ObjectMapper mapper;

		protected Status400Decoder(ObjectMapper mapper) {
			super();
			this.mapper = mapper;
		}

		@Override
		public Exception decode(String methodKey, Response response) {
			if (response.status() != 200) {
				ApiError body = null;
				if (response.body() != null) {
					try {
						body = mapper.readValue(response.body().asInputStream(), ApiError.class);
					} catch (IOException ignored) {
						// Do nothing
					}
				}
				throw new ApiException(response.status(), body == null ? "" : body.getError());
			}
			return new ErrorDecoder.Default().decode(methodKey, response);
		}
	}
}
