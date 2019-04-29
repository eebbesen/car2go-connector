package org.mule.modules.car2go.bo;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({ "countryCode", "defaultLanguage", "locationId",
		"locationName", "timezone" })
public class City {
	@JsonProperty("countryCode")
	private String countryCode;

	@JsonProperty("defaultLanguage")
	private String defaultLanguage;

	@JsonProperty("locationId")
	private String locationId;

	@JsonProperty("locationName")
	private String locationName;

	@JsonProperty("timezone")
	private String timezone;

	@JsonProperty("countryCode")
	public String getCountryCode() {
		return countryCode;
	}

	@JsonProperty("countryCode")
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@JsonProperty("defaultLanguage")
	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	@JsonProperty("defaultLanguage")
	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

	@JsonProperty("locationId")
	public String getLocationId() {
		return locationId;
	}

	@JsonProperty("locationId")
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	@JsonProperty("locationName")
	public String getLocationName() {
		return locationName;
	}

	@JsonProperty("locationName")
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@JsonProperty("timezone")
	public String getTimezone() {
		return timezone;
	}

	@JsonProperty("timezone")
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

}

// * {"countryCode":"US", "defaultLanguage":"en", "locationId":2,
// * "locationName":"Austin", "mapSection":{
// * "center":{"latitude":30.2794,"longitude":-97.7434},
// * "lowerRight":{"latitude":30.160647,"longitude":-97.604331},
// * "upperLeft":{"latitude":30.42769,"longitude":-97.918696}},
// * "timezone":"America/Chicago"}

