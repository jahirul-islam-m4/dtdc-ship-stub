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
public class PackageDetails {

	/**
	 * Goods description.
	 */
	@JsonProperty("GoodDescription")
	private String goodDescription;

	/**
	 * Customs value.
	 */
	@JsonProperty("CustomValue")
	private BigDecimal customValue;

	/**
	 * Customs currency in ISO 4217 3-Letter code.
	 */
	@JsonProperty("CustomCurrencyCode")
	private String customCurrencyCode;

	/**
	 * Insurance value.
	 */
	@JsonProperty("InsuranceValue")
	private BigDecimal insuranceValue;

	/**
	 * Insurance currency in ISO 4217 3-Letter code.
	 */
	@JsonProperty("InsuranceCurrencyCode")
	private String insuranceCurrencyCode;

	/**
	 * Shipment terms. DDU,DDP
	 */
	@JsonProperty("ShipmentTerm")
	private String shipmentTerm;

	/**
	 * Goods origin country in ISO Alpha-3 code.
	 */
	@JsonProperty("GoodsOriginCountryCode")
	private String goodsOriginCountryCode;

	/**
	 * Delivery instructions.
	 */
	@JsonProperty("DeliveryInstructions")
	private String deliveryInstructions;

	/**
	 * Charged weight value.
	 */
	@JsonProperty("Weight")
	private BigDecimal weight;

	/**
	 * Weight units. KG,LBS
	 */
	@JsonProperty("WeightMeasurement")
	private String weightMeasurement;

	/**
	 * Number of items. Default: 1
	 */
	@JsonProperty("NoOfItems")
	private Integer noOfItems;

	/**
	 * Cubic length value.
	 */
	@JsonProperty("CubicL")
	private BigDecimal cubicL;

	/**
	 * Cubic width value.
	 */
	@JsonProperty("CubicW")
	private BigDecimal cubicW;

	/**
	 * Cubic height value.
	 */
	@JsonProperty("CubicH")
	private BigDecimal cubicH;

	/**
	 * Cubic weight value.
	 */
	@JsonProperty("CubicWeight")
	private BigDecimal cubicWeight;

	/**
	 * Cubic weight units. KG,LBS
	 */
	@JsonProperty("CubicWeightMeasurement")
	private String cubicWeightMeasurement;

	/**
	 * Service type code.
	 */
	@JsonProperty("ServiceTypeName")
	private String serviceTypeName;

	/**
	 * Book a pickup. true,false
	 */
	@JsonProperty("BookPickUP")
	private Boolean bookPickUP;

	/**
	 * Alternate reference number.
	 */
	@JsonProperty("AlternateRef")
	private String alternateRef;

	/**
	 * Sender reference number 1.
	 */
	@JsonProperty("SenderRef1")
	private String senderRef1;

	/**
	 * Sender reference number 2.
	 */
	@JsonProperty("SenderRef2")
	private String senderRef2;

	/**
	 * Sender reference number 3.
	 */
	@JsonProperty("SenderRef3")
	private String senderRef3;

	/**
	 * A list {@link ShipmentResponseItem} shipment items.
	 */
	@JsonProperty("ShipmentResponseItem")
	private List<ShipmentResponseItem> shipmentResponseItem = null;

	/**
	 * COD value.
	 */
	@JsonProperty("CODAmount")
	private BigDecimal cODAmount;

	/**
	 * COD currency in ISO 4217 3-Letter code.
	 */
	@JsonProperty("CODCurrencyCode")
	private String cODCurrencyCode;

	/**
	 * Number of bag. Default: 0
	 */
	@JsonProperty("Bag")
	private Integer bag;

	/**
	 * Shipment notes.
	 */
	@JsonProperty("Notes")
	private String notes;

	/**
	 * Origin location in International Air Transport Association (IATA) code.
	 */
	@JsonProperty("OriginLocCode")
	private String originLocCode;

	/**
	 * Bag reference number in which shipment is placed.
	 */
	@JsonProperty("BagNumber")
	private String bagNumber;

	/**
	 * Actual weight value.
	 */
	@JsonProperty("DeadWeight")
	private BigDecimal deadWeight;

	/**
	 * Reason for export.
	 */
	@JsonProperty("ReasonExport")
	private String reasonExport;

	/**
	 * Destination tax value.
	 */
	@JsonProperty("DestTaxes")
	private BigDecimal destTaxes;

	/**
	 * Security value.
	 */
	@JsonProperty("Security")
	private BigDecimal security;

	/**
	 * Surcharge value.
	 */
	@JsonProperty("Surcharge")
	private BigDecimal surcharge;

	/**
	 * Receiver tax ID.
	 */
	@JsonProperty("ReceiverTaxID")
	private String receiverTaxID;

	/**
	 * N/A
	 */
	@JsonProperty("OrderNumber")
	private String orderNumber;

	/**
	 * Package incoterms. CIF,CFR,FOB
	 */
	@JsonProperty("Incoterms")
	private String incoterms;

	/**
	 * Import Export Code.
	 */
	@JsonProperty("ClearanceReference")
	private String clearanceReference;
}
