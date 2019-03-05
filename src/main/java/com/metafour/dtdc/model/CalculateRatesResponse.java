package com.metafour.dtdc.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalculateRatesResponse {

	/**
	 * A list of {@link PricingResponseDetail} pricing results.
	 */
	@JsonProperty("PricingResponseDetails")
	private List<PricingResponseDetail> pricingResponseDetails = null;
}
