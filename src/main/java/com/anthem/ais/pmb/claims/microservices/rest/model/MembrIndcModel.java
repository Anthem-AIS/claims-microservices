package com.anthem.ais.pmb.claims.microservices.rest.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MembrIndcModel implements Serializable{

	private static final long serialVersionUID = -3858379196463550353L;
	
	@JsonProperty("claimId")
	private String claimId;
	@JsonProperty("hcid")
	private String hcId;
	@JsonProperty("sequenceNumber")
	private String sequenceNumber;
	@JsonProperty("amountPaid")
	private String amountPaid;
	@JsonProperty("notes")
	private String notes;
	
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getHcId() {
		return hcId;
	}
	public void setHcId(String hcId) {
		this.hcId = hcId;
	}
	
	public String getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public String getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(String amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	
}
