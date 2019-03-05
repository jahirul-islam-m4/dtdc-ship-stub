package com.metafour.dtdc.serializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.metafour.dtdc.serializer.LocalDateTimeDeserializer;

/**
 * @author Jahirul Islam
 * @since Mar 5, 2019
 */

public class LocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {

	@Override
	public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeString(DateTimeFormatter.ofPattern(LocalDateTimeDeserializer.DTF).format(value));
	}
}
