package com.anthem.ais.pmb.claims.microservices.rest.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MembrIndcModel implements Serializable{

	private static final long serialVersionUID = -3858379196463550353L;
	
	@JsonProperty("ClaimId")
	private String claimId;
	@JsonProperty("HcId")
	private String hcId;
	@JsonProperty("PaymentTransactionId")
	private String paymentTransactionId;
	@JsonProperty("SequenceNumber")
	private String sequenceNumber;
	@JsonProperty("AmountPaid")
	private String amountPaid;
	@JsonProperty("TransactionDateTime")
	private String transactionDateTime;
	@JsonProperty("Notes")
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
	public String getPaymentTransactionId() {
		return paymentTransactionId;
	}
	public void setPaymentTransactionId(String paymentTransactionId) {
		this.paymentTransactionId = paymentTransactionId;
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
	public String getTransactionDateTime() {
		return transactionDateTime;
	}
	public void setTransactionDateTime(String transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}
	
	
}
