package com.metafour.dtdc.service;

import java.io.FileOutputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @author Jahirul Islam
 * @since Mar 4, 2019
 */

public class LoggingRequestInterceptor implements RequestInterceptor {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	private String fileNameWithPath;

	public LoggingRequestInterceptor(String fileNameWithPath) {
		this.fileNameWithPath = fileNameWithPath;
	}

	@Override
	public void apply(RequestTemplate template) {
		if (template == null) return;
		String method = template.method();
		String filename = ""; 
		if (method.equals("POST")) {
			filename = fileNameWithPath + "-shipment-rq.json";
		} else if(method.equals("GET")) {
			filename = fileNameWithPath + "-label-rq.txt";
		}

		try (FileOutputStream fos = new FileOutputStream(filename)) {
			if (template.request() != null && (template.request().body() != null)) {
				logger.debug("Saving message to {}", filename);
				fos.write(template.request().body());
			} else {
				logger.debug("No request body");
			}
			if(method.equals("GET")) {
				fos.write(template.request().url().getBytes());
			}
		} catch (IOException e) {
			logger.warn("Unable to save message to {}", filename, e);
		}
	}
}
