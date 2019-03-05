package com.metafour.dtdc.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrackingDetail {

	/**
	 * Tracking date in UTC. Format: yyyy/MM/dd HH:mm:ss tt
	 */
	@JsonProperty("TrackingUTCDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd hh:mm:ss a")
	@JsonDeserialize(using = com.metafour.dtdc.serializer.LocalDateTimeDeserializer.class)
	@JsonSerialize(using = com.metafour.dtdc.serializer.LocalDateTimeSerializer.class)
	private LocalDateTime trackingUTCDate;

	/**
	 * Error message.
	 */
	@JsonProperty("TrackingError")
	private String trackingError;

	/**
	 * Tracking country in ISO Alpha-3 code.
	 */
	@JsonProperty("TrackingCountry")
	private String trackingCountry;

	/**
	 * Event code.
	 */
	@JsonProperty("TrackingEventCode")
	private String trackingEventCode;

	/**
	 * Tracking location name.
	 */
	@JsonProperty("TrackingLocation")
	private String trackingLocation;

	/**
	 * Tracking date in country local time zone. Format: yyyy/MM/dd HH:mm:ss tt
	 */
	@JsonProperty("TrackingDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd hh:mm:ss a")
	@JsonDeserialize(using = com.metafour.dtdc.serializer.LocalDateTimeDeserializer.class)
	@JsonSerialize(using = com.metafour.dtdc.serializer.LocalDateTimeSerializer.class)
	private LocalDateTime trackingDate;

	/**
	 * Event name.
	 */
	@JsonProperty("TrackingEventName")
	private String trackingEventName;

	/**
	 * Event notes.
	 */
	@JsonProperty("TrackingNotes")
	private String trackingNotes;

	/**
	 * Tracking number.
	 */
	@JsonProperty("TrackingNumber")
	private String trackingNumber;

}
