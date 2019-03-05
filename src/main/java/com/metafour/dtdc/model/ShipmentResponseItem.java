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
public class ShipmentResponseItem {

	/**
	 * Alternate reference.
	 */
	@JsonProperty("ItemAlt")
	private String itemAlt;

	/**
	 * Number of piece. Default: 1
	 */
	@JsonProperty("ItemNoOfPcs")
	private Integer itemNoOfPcs;

	/**
	 * Cubic length value in cm.
	 */
	@JsonProperty("ItemCubicL")
	private BigDecimal itemCubicL;

	/**
	 * Cubic width value in cm.
	 */
	@JsonProperty("ItemCubicW")
	private BigDecimal itemCubicW;

	/**
	 * Cubic height value in cm.
	 */
	@JsonProperty("ItemCubicH")
	private BigDecimal itemCubicH;

	/**
	 * Weight value.
	 */
	@JsonProperty("ItemWeight")
	private BigDecimal itemWeight;

	/**
	 * Cubic weight value.
	 */
	@JsonProperty("ItemCubicWeight")
	private BigDecimal itemCubicWeight;

	/**
	 * Cubic weight units. KG,G,LBS
	 */
	@JsonProperty("ItemCubicWeightMeasurement")
	private String itemCubicWeightMeasurement;

	/**
	 * Description.
	 */
	@JsonProperty("ItemDescription")
	private String itemDescription;

	/**
	 * Customs value.
	 */
	@JsonProperty("ItemCustomValue")
	private BigDecimal itemCustomValue;

	/**
	 * Customs currency in ISO 4217 3-Letter code.
	 */
	@JsonProperty("ItemCustomCurrencyCode")
	private String itemCustomCurrencyCode;

	/**
	 * Item notes.
	 */
	@JsonProperty("Notes")
	private String notes;

	/**
	 * A list {@link Piece} pieces.
	 */
	@JsonProperty("Pieces")
	private List<Piece> pieces = null;
}
