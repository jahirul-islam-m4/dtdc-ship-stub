package com.metafour.dtdc.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalculateRates {

	/**
	 * Sender country in ISO 3166-1 alpha-2.
	 */
	@JsonProperty("DepartureCountryCode")
	private String departureCountryCode;

	/**
	 * Sender postcode.
	 */
	@JsonProperty("DeparturePostcode")
	private String departurePostcode;

	/**
	 * Sender location in International Air Transport Association (IATA) code.
	 */
	@JsonProperty("DepartureLocation")
	private String departureLocation;

	/**
	 * Receiver country in ISO 3166-1 alpha-2.
	 */
	@JsonProperty("ArrivalCountryCode")
	private String arrivalCountryCode;

	/**
	 * Receiver postcode.
	 */
	@JsonProperty("ArrivalPostcode")
	private String arrivalPostcode;

	/**
	 * Receiver location in International Air Transport Association (IATA) code.
	 */
	@JsonProperty("ArrivalLocation")
	private String arrivalLocation;

	/**
	 * Rate currency in ISO 4217 3-Letter code.
	 */
	@JsonProperty("PaymentCurrencyCode")
	private String paymentCurrencyCode;

	/**
	 * Weight unit. KG,LBS
	 */
	@JsonProperty("WeightMeasure")
	private String weightMeasure;

	@JsonProperty("Weight")
	private BigDecimal weight;

	/**
	 * Number of items in parcel. Default:1
	 */
	@JsonProperty("NumofItem")
	public Integer numofItem;

	@JsonProperty("ServiceType")
	public String serviceType;

	/**
	 * Dimension unit. CM,INCH
	 */
	@JsonProperty("DimensionUnit")
	public String dimensionUnit;

	/**
	 * Customs currency in ISO 4217 3-Letter code.
	 */
	@JsonProperty("CustomCurrencyCode")
	public String customCurrencyCode;

	/**
	 * Customs value.
	 */
	@JsonProperty("CustomAmount")
	public BigDecimal customAmount;
}
