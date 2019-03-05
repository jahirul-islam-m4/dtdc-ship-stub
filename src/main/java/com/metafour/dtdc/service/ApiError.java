package com.metafour.dtdc.service;

/**
 * @author Jahirul Islam
 * @since Mar 4, 2019
 */

public class ApiError {

	private String error;

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}

	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ApiError [error=" + error + "]";
	}
	
	
}
