package com.metafour.dtdc.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PricingResponseDetail {

	/**
	 * Rate currency in ISO 4217 3-Letter code.
	 */
	private String currencyCode;

	/**
	 * Service type code.
	 */
	@JsonProperty("ProductCode")
	private String productCode;

	/**
	 * Base charge amount.
	 */
	@JsonProperty("BasicAmount")
	private BigDecimal basicAmount;

	/**
	 * Tax value.
	 */
	@JsonProperty("TaxAmount")
	private BigDecimal taxAmount;

	/**
	 * Fuel-surcharge value.
	 */
	@JsonProperty("FSAmount")
	private BigDecimal fSAmount;

	/**
	 * Total value.
	 */
	@JsonProperty("TotalAmount")
	private BigDecimal totalAmount;

	/**
	 * Error message (if any) returned from the rate request.
	 */
	@JsonProperty("ErorMessage")
	private String erorMessage;

	/**
	 * List of {@link Other} other charges.
	 */
	@JsonProperty("Others")
	private List<Other> others = null;
}
