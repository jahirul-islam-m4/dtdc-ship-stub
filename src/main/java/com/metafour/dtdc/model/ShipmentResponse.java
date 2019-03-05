package com.metafour.dtdc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShipmentResponse {

	/**
	 * Shipment Number.
	 */
	@JsonProperty("ShipmentNumber")
	private String shipmentNumber;

	/**
	 * Sender reference number.
	 */
	@JsonProperty("SenderRef")
	private String senderRef;

	/**
	 * Job reference number. Applicable if BookPickup set to true
	 */
	@JsonProperty("JobRef")
	private String jobRef;

	/**
	 * N/A
	 */
	@JsonProperty("AccessID")
	private String accessID;

	/**
	 * Account code.
	 */
	@JsonProperty("AcccountCode")
	private String acccountCode;

	/**
	 * Label URL.
	 */
	@JsonProperty("LabelURL")
	private String labelURL;

	/**
	 * Error message.
	 */
	@JsonProperty("ErrMessage")
	private String errMessage;
}
