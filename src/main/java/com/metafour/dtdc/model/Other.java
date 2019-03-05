package com.metafour.dtdc.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Other {

	/**
	 * Unique ID of the charges.
	 */
	@JsonProperty("ItemID")
	private String itemID;

	/**
	 * Charge name.
	 */
	@JsonProperty("ItemName")
	private String itemName;

	/**
	 * Charge type. $, %
	 */
	@JsonProperty("ItemValueType")
	private String itemValueType;

	/**
	 * Charge reference.
	 */
	@JsonProperty("ItemRefCode")
	private String itemRefCode;

	/**
	 * N/A
	 */
	@JsonProperty("ItemType")
	private String itemType;

	/**
	 * Charge value.
	 */
	@JsonProperty("ItemValue")
	private BigDecimal itemValue;

	/**
	 * Charge operator. +,-
	 */
	@JsonProperty("ItemOperator")
	private String itemOperator;
}
