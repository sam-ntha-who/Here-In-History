package org.localHx.hereinhistory.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("HistoricalData")
public class HistoricalData {
	@Id
	private String id;
	private String dataText;
	private String month;
	private String day;
	private String year;
	private String latitude;
	private String longitude;
	private String zipCode;
	
	

}
