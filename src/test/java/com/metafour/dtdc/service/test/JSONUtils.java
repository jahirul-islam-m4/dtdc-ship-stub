package com.metafour.dtdc.service.test;

import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Jahirul Islam
 * @since Mar 4, 2019
 */

@Slf4j
public class JSONUtils {

	public static String prettyPrintJSON(String json) {
		ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("JavaScript");
		scriptEngine.put("jsonString", json);
		try {
			scriptEngine.eval("result = JSON.stringify(JSON.parse(jsonString), null, 2)");
		} catch (ScriptException e) {
			log.error(e.getMessage(), e);
		}
		return (String) scriptEngine.get("result");
	}

	public static String object2JsonInString(Object ob) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.writeValueAsString(ob);
		} catch (JsonProcessingException e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

	public static <T> Object jsonInString2Object(String json, Class<T> value) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(json, value);
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public static <T> Object jsonInString2Object(String json, TypeReference value) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(json, value);
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

	public static <T> Object loadJson(String path, Class<T> value) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			Object response = objectMapper
					.readValue(Thread.currentThread().getContextClassLoader().getResourceAsStream(path), value);
			return response;
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}
}
