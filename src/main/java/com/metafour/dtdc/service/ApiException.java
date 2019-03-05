package com.metafour.dtdc.service;

import feign.FeignException;

/**
 * @author Jahirul Islam
 * @since Mar 4, 2019
 */

public class ApiException extends FeignException {
	private static final long serialVersionUID = 4378917955940226517L;

	public ApiException(int status, String message) {
		super(status, message);
	}
}