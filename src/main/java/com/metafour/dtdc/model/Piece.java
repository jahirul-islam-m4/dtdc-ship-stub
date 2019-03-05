package com.metafour.dtdc.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Piece {

	/**
	 * Harmonised code.
	 */
	@JsonProperty("HarmonisedCode")
	private String harmonisedCode;

	/**
	 * Description.
	 */
	@JsonProperty("GoodsDescription")
	private String goodsDescription;

	/**
	 * Content of the item.
	 */
	@JsonProperty("Content")
	private String content;

	/**
	 * Item notes.
	 */
	@JsonProperty("Notes")
	private String notes;

	/**
	 * Reference number.
	 */
	@JsonProperty("SenderRef1")
	private String senderRef1;

	/**
	 * Number of piece. Default: 1
	 */
	@JsonProperty("Quantity")
	private Integer quantity;

	/**
	 * Cubic weight value.
	 */
	@JsonProperty("Weight")
	private BigDecimal weight;

	/**
	 * Manufacture country code in ISO Alpha-3 code.
	 */
	@JsonProperty("ManufactureCountryCode")
	private String manufactureCountryCode;

	/**
	 * Origin country code in ISO Alpha-3 code.
	 */
	@JsonProperty("OriginCountryCode")
	private String originCountryCode;

	/**
	 * Customs currency in ISO 4217 3-Letter code.
	 */
	@JsonProperty("CurrencyCode")
	private String currencyCode;

	/**
	 * Customs value.
	 */
	@JsonProperty("CustomsValue")
	private BigDecimal customsValue;
}
