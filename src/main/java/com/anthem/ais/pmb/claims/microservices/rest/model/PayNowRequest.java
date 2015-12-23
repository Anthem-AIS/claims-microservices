package com.anthem.ais.pmb.claims.microservices.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PayNowRequest {

	@JsonProperty("claimId")
	private String claimId;
	@JsonProperty("amountPaid")
	private String amountPaid;
	@JsonProperty("userToken")
	private String userToken;
	@JsonProperty("hcId")
	private String hcId;
	@JsonProperty("userEmailId")
	private String userEmailId;
	
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public String getHcId() {
		return hcId;
	}
	public void setHcId(String hcId) {
		this.hcId = hcId;
	}
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(String amountPaid) {
		this.amountPaid = amountPaid;
	}
	public String getUserToken() {
		return userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
}
