package com.anthem.ais.pmb.claims.microservices.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatusModel {
	
	@JsonProperty("statusCode")
	private String statusCode;	
	@JsonProperty("statusMessage")
	private String statusMessage;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

}
