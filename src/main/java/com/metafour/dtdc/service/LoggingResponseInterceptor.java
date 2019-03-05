package com.metafour.dtdc.service;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jahirul Islam
 * @since Mar 4, 2019
 */

public class LoggingResponseInterceptor implements HttpResponseInterceptor {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	private String fileNameWithPath;

	public LoggingResponseInterceptor(String fileNameWithPath) {
		this.fileNameWithPath = fileNameWithPath;
	}

	@Override
	public void process(HttpResponse response, HttpContext context)	throws HttpException, IOException {
		HttpRequest rq = (HttpRequest) context.getAttribute(HttpClientContext.HTTP_REQUEST);
		logger.info("APC response for " + rq.getRequestLine().getUri());
		String method = rq.getRequestLine().getMethod();
		String filename = "";

		if (method.equals("POST")) {
			filename = fileNameWithPath + "-shipment-rs.json";
		} else if(method.equals("GET")) {
			filename = fileNameWithPath + "-label-rs.json";
		}

		HttpEntity entity = response.getEntity();
		if (entity == null) {
			logger.debug("No response body");
			return;
		}
		byte[] entityAsBytes = EntityUtils.toByteArray(entity);
		logger.debug("Saving message to {}", filename);
		try (FileOutputStream fos = new FileOutputStream(filename)) {
			fos.write(entityAsBytes);
		} catch (IOException e) {
			logger.warn("Unable to save message to {}", filename, e);
		}
		EntityUtils.updateEntity(response, new ByteArrayEntity(entityAsBytes));
	}
}
