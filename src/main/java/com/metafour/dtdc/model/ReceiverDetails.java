package com.metafour.dtdc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReceiverDetails {

	/**
	 * Receiver name.
	 */
	@JsonProperty("ReceiverName")
	private String receiverName;

	/**
	 * Receiver company name.
	 */
	@JsonProperty("ReceiverCompanyName")
	private String receiverCompanyName;

	/**
	 * Receiver country in ISO Alpha-3 code.
	 */
	@JsonProperty("ReceiverCountryCode")
	private String receiverCountryCode;

	/**
	 * Receiver address line 1.
	 */
	@JsonProperty("ReceiverAdd1")
	private String receiverAdd1;

	/**
	 * Receiver address line 2.
	 */
	@JsonProperty("ReceiverAdd2")
	private String receiverAdd2;

	/**
	 * Receiver address line 3.
	 */
	@JsonProperty("ReceiverAdd3")
	private String receiverAdd3;

	/**
	 * Receiver city.
	 */
	@JsonProperty("ReceiverAddCity")
	private String receiverAddCity;

	/**
	 * Receiver state.
	 */
	@JsonProperty("ReceiverAddState")
	private String receiverAddState;

	/**
	 * Receiver postcode.
	 */
	@JsonProperty("ReceiverAddPostcode")
	private String receiverAddPostcode;

	/**
	 * Receiver mobile number.
	 */
	@JsonProperty("ReceiverMobile")
	private String receiverMobile;

	/**
	 * Receiver phone number.
	 */
	@JsonProperty("ReceiverPhone")
	private String receiverPhone;

	/**
	 * Receiver email address.
	 */
	@JsonProperty("ReceiverEmail")
	private String receiverEmail;

	/**
	 * Receiver residential. N - No, Y - Yes
	 */
	@JsonProperty("ReceiverAddResidential")
	private String receiverAddResidential;

	/**
	 * Receiver fax number.
	 */
	@JsonProperty("ReceiverFax")
	private String receiverFax;

	/**
	 * Receiver KYC document type. eg. Passport
	 */
	@JsonProperty("ReceiverKycType")
	private String receiverKycType;

	/**
	 * Receiver KYC document number.
	 */
	@JsonProperty("ReceiverKycNumber")
	private String receiverKycNumber;
}
