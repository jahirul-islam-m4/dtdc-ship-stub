package com.metafour.dtdc.service.test;

import static com.jayway.restassured.RestAssured.given;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.jayway.restassured.response.Response;
import com.metafour.dtdc.service.test.JSONUtils;

import lombok.extern.slf4j.Slf4j;

import com.metafour.dtdc.model.ShipmentResponse;
import com.metafour.dtdc.service.DTDCServiceApi;

/**
 * @author Jahirul Islam
 * @since Mar 5, 2019
 */

@Slf4j
public class ShipmentTest extends DTDCTestData {

	private static DTDCServiceApi api;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		api = DTDCServiceApi.connect(DTDC_URL, DTDC_TOKEN, CACHE_PATH_TOKEN + "dtdc");
	}

	@Test
	public void test01Shipments() {
		Response response = given().when().header("Token", DTDC_TOKEN).header("ContentType", "application/json").log()
				.body(true).when().body(getShipments()).expect().statusCode(200).post(DTDC_URL + "/shipments").then()
				.extract().response();
		assertNotNull(response);
		log.info(response.asString());
		@SuppressWarnings("unchecked")
		List<ShipmentResponse> res = (List<ShipmentResponse>) JSONUtils.jsonInString2Object(response.asString(),
				new TypeReference<List<ShipmentResponse>>() {
				});
		assertNotNull(res);
		log.info(res.toString());
	}

	@Test
	public void test02Shipments() {
		List<ShipmentResponse> response = api.shipments(getShipments());
		assertNotNull(response);
		log.info(response.toString());
		log.info(response.get(0).getErrMessage());
	}
}
