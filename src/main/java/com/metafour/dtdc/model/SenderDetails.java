package com.metafour.dtdc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SenderDetails {

	/**
	 * Sender name.
	 */
	@JsonProperty("SenderName")
	private String senderName;

	/**
	 * Sender company name.
	 */
	@JsonProperty("SenderCompanyName")
	private String senderCompanyName;

	/**
	 * Sender country in ISO Alpha-3 code.
	 */
	@JsonProperty("SenderCountryCode")
	private String senderCountryCode;

	/**
	 * Sender address line 1.
	 */
	@JsonProperty("SenderAdd1")
	private String senderAdd1;

	/**
	 * Sender address line 2.
	 */
	@JsonProperty("SenderAdd2")
	private String senderAdd2;

	/**
	 * Sender address line 3.
	 */
	@JsonProperty("SenderAdd3")
	private String senderAdd3;

	/**
	 * Sender city.
	 */
	@JsonProperty("SenderAddCity")
	private String senderAddCity;

	/**
	 * Sender state.
	 */
	@JsonProperty("SenderAddState")
	private String senderAddState;

	/**
	 * Sender postcode.
	 */
	@JsonProperty("SenderAddPostcode")
	private String senderAddPostcode;

	/**
	 * Sender phone number.
	 */
	@JsonProperty("SenderPhone")
	private String senderPhone;

	/**
	 * Sender email address.
	 */
	@JsonProperty("SenderEmail")
	private String senderEmail;

	/**
	 * Sender fax number.
	 */
	@JsonProperty("SenderFax")
	private String senderFax;

	/**
	 * Sender KYC document type. eg. Passport
	 */
	@JsonProperty("SenderKycType")
	private String senderKycType;

	/**
	 * Sender KYC document number.
	 */
	@JsonProperty("SenderKycNumber")
	private String senderKycNumber;

	/**
	 * Sender Receiving Country Tax ID
	 */
	@JsonProperty("SenderReceivingCountryTaxID")
	private String senderReceivingCountryTaxID;
}
