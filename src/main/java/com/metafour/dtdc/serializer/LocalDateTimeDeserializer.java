package com.metafour.dtdc.serializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * @author Jahirul Islam
 * @since Mar 5, 2019
 */

public class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {

	public static final String DTF = "yyyy/MM/dd hh:mm:ss a";

	@Override
	public LocalDateTime deserialize(JsonParser p, DeserializationContext arg1) throws IOException {
		try {
			return LocalDateTime.parse(p.getText(), DateTimeFormatter.ofPattern(DTF));
		} catch (DateTimeParseException ex) {
			return null;
		}
	}
}
