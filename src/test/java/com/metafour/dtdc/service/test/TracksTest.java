package com.metafour.dtdc.service.test;

import static com.jayway.restassured.RestAssured.given;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.response.Response;
import com.metafour.dtdc.service.test.JSONUtils;

import lombok.extern.slf4j.Slf4j;

import com.metafour.dtdc.model.TracksResponse;
import com.metafour.dtdc.service.DTDCServiceApi;

/**
 * @author Jahirul Islam
 * @since Mar 4, 2019
 */

@Slf4j
public class TracksTest extends DTDCTestData {

	private static DTDCServiceApi api;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		api = DTDCServiceApi.connect(DTDC_URL, DTDC_TOKEN, CACHE_PATH_TOKEN + "dtdc");
	}

	@Test
	public void test01Tracks() {
		Response response = given().when().header("Token", DTDC_TOKEN).header("ContentType", "application/json").log()
				.body(true).when().queryParam("ReferenceNumber", REF_NUM).expect().statusCode(200)
				.get(DTDC_URL + "/tracks").then().extract().response();
		assertNotNull(response);
		log.info(response.asString());
		TracksResponse res = (TracksResponse) JSONUtils.jsonInString2Object(response.asString(), TracksResponse.class);
		assertNotNull(res);
		log.info(res.toString());
	}

	@Test
	public void test02Tracks() {
		TracksResponse response = api.tracks(REF_NUM);
		assertNotNull(response);
		log.info(response.toString());
		log.info(response.getTrackingDetail().get(0).getTrackingUTCDate().toString());
	}
}
