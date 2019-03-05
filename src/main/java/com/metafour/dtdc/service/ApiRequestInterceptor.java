package com.metafour.dtdc.service;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @author Jahirul Islam
 * @since Mar 4, 2019
 */

public class ApiRequestInterceptor implements RequestInterceptor {

	private final String token;

	public ApiRequestInterceptor(String token) {
		super();
		this.token = token;
	}

	@Override
	public void apply(RequestTemplate template) {
		template.header("Token", token);
		template.header("Accept-Encoding", "identity");
		template.header("Accept", "application/json");
		template.header("Content-Type", "application/json");
	}
}
