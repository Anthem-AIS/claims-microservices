package com.anthem.ais.pmb.claims.microservices.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClaimsModel {
	@JsonProperty("userToken")
	private String userToken = null;
	@JsonProperty("hcid")
	private String hcid = null;

	public String getHcid() {
		return hcid;
	}

	public void setHcid(String hcid) {
		this.hcid = hcid;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	
}
