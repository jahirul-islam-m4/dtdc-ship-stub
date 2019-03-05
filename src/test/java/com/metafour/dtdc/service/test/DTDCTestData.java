package com.metafour.dtdc.service.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.metafour.dtdc.model.CalculateRates;
import com.metafour.dtdc.model.PackageDetails;
import com.metafour.dtdc.model.Piece;
import com.metafour.dtdc.model.ReceiverDetails;
import com.metafour.dtdc.model.SenderDetails;
import com.metafour.dtdc.model.Shipment;
import com.metafour.dtdc.model.ShipmentResponseItem;

/**
 * @author Jahirul Islam
 * @since Mar 4, 2019
 */

public class DTDCTestData {

	public static final String DTDC_URL = "https://api.postshipping.com/api2";
	public static final String DTDC_TOKEN = "E40C6B0AF7C89C586A86E3442338A4A7";
	public static final String CACHE_PATH_TOKEN = "target/";
	public static final String REF_NUM = "100000003740";

	protected CalculateRates getCalculateRates() {
		CalculateRates calculateRates = new CalculateRates();
		calculateRates.setDepartureCountryCode("SG");
		calculateRates.setDeparturePostcode("208573");
		calculateRates.setDepartureLocation("SINGAPORE");
		calculateRates.setArrivalCountryCode("MY");
		calculateRates.setArrivalPostcode("53300");
		calculateRates.setArrivalLocation("KUALA LUMPUR");
		calculateRates.setPaymentCurrencyCode("SGD");
		calculateRates.setWeightMeasure("KG");
		calculateRates.setWeight(new BigDecimal("3.5"));
		calculateRates.setNumofItem(1);
		calculateRates.setServiceType("ED");
		calculateRates.setDimensionUnit("CM");
		calculateRates.setCustomCurrencyCode("SGD");
		calculateRates.setCustomAmount(new BigDecimal("50.00"));

		return calculateRates;
	}

	protected List<Shipment> getShipments() {
		List<Shipment> shipments = new ArrayList<>();
		shipments.add(getShipment());

		return shipments;
	}

	protected Shipment getShipment() {
		Shipment shipment = new Shipment();
		shipment.setSenderDetails(getSenderDetails());
		shipment.setReceiverDetails(getReceiverDetails());
		shipment.setPackageDetails(getPackageDetails());

		return shipment;
	}

	protected SenderDetails getSenderDetails() {
		SenderDetails sender = new SenderDetails();
		sender.setSenderName("John");
		sender.setSenderCompanyName("ABC Pte Ltd");
		sender.setSenderCountryCode("SG");
		sender.setSenderAdd1("338D King George's Avenue");
		sender.setSenderAdd2("King George Building");
		sender.setSenderAdd3("");
		sender.setSenderAddCity("");
		sender.setSenderAddState("");
		sender.setSenderAddPostcode("208573");
		sender.setSenderPhone("99999999");
		sender.setSenderEmail("abc@abc.com");
		sender.setSenderFax("");
		sender.setSenderKycType("Passport");
		sender.setSenderKycNumber("P00001");
		sender.setSenderReceivingCountryTaxID("");

		return sender;
	}

	protected ReceiverDetails getReceiverDetails() {
		ReceiverDetails receiver = new ReceiverDetails();
		receiver.setReceiverName("May");
		receiver.setReceiverCompanyName("ABC Pte Ltd");
		receiver.setReceiverCountryCode("MY");
		receiver.setReceiverAdd1("Avenue Business Centre");
		receiver.setReceiverAdd2("Suite 6.1");
		receiver.setReceiverAdd3("");
		receiver.setReceiverAddCity("Puchong");
		receiver.setReceiverAddState("Selangor");
		receiver.setReceiverAddPostcode("123456");
		receiver.setReceiverMobile("01699999999");
		receiver.setReceiverPhone("0399999999");
		receiver.setReceiverEmail("abc@abc.com");
		receiver.setReceiverAddResidential("N");
		receiver.setReceiverFax("");
		receiver.setReceiverKycType("Passport");
		receiver.setReceiverKycNumber("P00005");

		return receiver;
	}

	protected PackageDetails getPackageDetails() {
		PackageDetails pack = new PackageDetails();
		pack.setGoodDescription("a box of shirts");
		pack.setCustomValue(new BigDecimal(3.00));
		pack.setCustomCurrencyCode("SGD");
		pack.setInsuranceValue(new BigDecimal(0.00));
		pack.setInsuranceCurrencyCode("SGD");
		pack.setShipmentTerm("");
		pack.setGoodsOriginCountryCode("SG");
		pack.setDeliveryInstructions("fragile shipment. please take care.");
		pack.setWeight(new BigDecimal(3));
		pack.setWeightMeasurement("KG");
		pack.setNoOfItems(1);
		pack.setCubicL(new BigDecimal(3));
		pack.setCubicW(new BigDecimal(3));
		pack.setCubicH(new BigDecimal(3));
		pack.setCubicWeight(new BigDecimal(0.0));
		pack.setCubicWeightMeasurement("KG");
		pack.setServiceTypeName("EN");
		pack.setBookPickUP(true);
		pack.setAlternateRef("");
		pack.setSenderRef1("test shipment");
		pack.setSenderRef2("");
		pack.setSenderRef3("");
		pack.setShipmentResponseItem(Arrays.asList(getShipmentResponseItem()));
		pack.setCODAmount(new BigDecimal(0.0));
		pack.setCODCurrencyCode("SGD");
		pack.setBag(0);
		pack.setNotes("this is sample notes");
		pack.setOriginLocCode("");
		pack.setBagNumber("0");
		pack.setDeadWeight(new BigDecimal(3));
		pack.setReasonExport("");
		pack.setDestTaxes(new BigDecimal(0.0));
		pack.setSecurity(new BigDecimal(0.0));
		pack.setSurcharge(new BigDecimal(0.0));
		pack.setReceiverTaxID("");
		pack.setOrderNumber("");
		pack.setIncoterms("CIF");
		pack.setClearanceReference("");

		return pack;
	}

	protected ShipmentResponseItem getShipmentResponseItem() {
		ShipmentResponseItem item = new ShipmentResponseItem();
		item.setItemAlt("");
		item.setItemNoOfPcs(1);
		item.setItemCubicL(new BigDecimal(3));
		item.setItemCubicW(new BigDecimal(3));
		item.setItemCubicH(new BigDecimal(3));
		item.setItemWeight(new BigDecimal(3));
		item.setItemCubicWeight(new BigDecimal(0));
		item.setItemCubicWeightMeasurement("KG");
		item.setItemDescription("document");
		item.setItemCustomValue(new BigDecimal(3.00));
		item.setItemCustomCurrencyCode("SGD");
		item.setNotes("item notes");
		item.setPieces(Arrays.asList(getPiece()));

		return item;
	}

	protected Piece getPiece() {
		Piece piece = new Piece();
		piece.setHarmonisedCode("hs001");
		piece.setGoodsDescription("shirts");
		piece.setContent("cotton");
		piece.setNotes("shirts");
		piece.setSenderRef1("ref #001");
		piece.setQuantity(3);
		piece.setWeight(new BigDecimal(3));
		piece.setManufactureCountryCode("SG");
		piece.setOriginCountryCode("SG");
		piece.setCurrencyCode("SGD");
		piece.setCustomsValue(new BigDecimal(3.00));

		return piece;
	}
}
