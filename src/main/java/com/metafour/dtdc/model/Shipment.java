package com.metafour.dtdc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shipment {

	/**
	 * Optional. 3rdparty account token.
	 */
	@JsonProperty("ThirdPartyToken")
	private String thirdPartyToken;

	/**
	 * Sender {@link SenderDetails} information.
	 */
	@JsonProperty("SenderDetails")
	private SenderDetails senderDetails;

	/**
	 * Receiver {@link ReceiverDetails} information.
	 */
	@JsonProperty("ReceiverDetails")
	private ReceiverDetails receiverDetails;

	/**
	 * Package {@link PackageDetails} information.
	 */
	@JsonProperty("PackageDetails")
	private PackageDetails packageDetails;
}
