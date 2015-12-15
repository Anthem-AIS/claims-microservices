package com.anthem.ais.pmb.claims.microservices.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClaimsModel {
	@JsonProperty("UserToken")
	private String userToken = null;

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	
}
