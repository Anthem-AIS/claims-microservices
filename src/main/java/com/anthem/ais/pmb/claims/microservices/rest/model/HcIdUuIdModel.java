package com.anthem.ais.pmb.claims.microservices.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HcIdUuIdModel {

	@JsonProperty("HcId")
	private String hcId = null;
	@JsonProperty("UuId")
	private String uuId;
	
	public String getHcId() {
		return hcId;
	}
	public void setHcId(String hcId) {
		this.hcId = hcId;
	}
	public String getUuId() {
		return uuId;
	}
	public void setUuId(String uuId) {
		this.uuId = uuId;
	}
}
