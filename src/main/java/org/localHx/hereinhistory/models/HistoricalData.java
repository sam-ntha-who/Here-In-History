package org.localHx.hereinhistory.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("HistoricalData")
public class HistoricalData {
	@Id
	private String id;
	private String dataText;
	private int month;
	private int day;
	private int year;
	private String latitude;
	private String longitude;
	private String zipCode;
	
	public HistoricalData() {
		
	}
	// test data
	public HistoricalData(String dataText, String zipCode, int year) {
		this.dataText = dataText;
		this.zipCode = zipCode;
		this.year = year;
	}
	
	
	// by geoLoc data (lat/long)
	public HistoricalData(String dataText, int month, int day, int year, String latitude, String longitude) {
		this.dataText = dataText;
		this.month = month;
		this.day = day;
		this.year = year;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	// zipcode only
	public HistoricalData(String dataText, int month, int day, int year, String zipCode) {
		this.dataText = dataText;
		this.month = month;
		this.day = day;
		this.year = year;
		this.zipCode = zipCode;

	}
	
	public HistoricalData(String dataText, int month, int day, int year, String latitude, String longitude,
			String zipCode) {
		this.dataText = dataText;
		this.month = month;
		this.day = day;
		this.year = year;
		this.latitude = latitude;
		this.longitude = longitude;
		this.zipCode = zipCode;
	}
	
	public String getId() {
		return id;
	}

	public String getDataText() {
		return dataText;
	}
	public void setDataText(String dataText) {
		this.dataText = dataText;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	

}
