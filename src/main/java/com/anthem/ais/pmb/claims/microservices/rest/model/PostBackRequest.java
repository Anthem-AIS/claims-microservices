package com.anthem.ais.pmb.claims.microservices.rest.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostBackRequest implements Serializable {
	
	private static final long serialVersionUID = -4446232229902806895L;
	@JsonProperty("Amount")
	private String amount;
	@JsonProperty("TransactionDateTime")
	private String transactionDateTime;
	@JsonProperty("StatusCode")
	private String statusCode;
	@JsonProperty("PaymentTransactionID")
	private String paymentTransactionID;
	@JsonProperty("TransactionAction")
	private String transactionAction;
	@JsonProperty("ClaimNumber")
	private String claimNumber;
	@JsonProperty("EmpGroupNumber")
	private String empGroupNumber;
	@JsonProperty("EEID")
	private String eEID;
	@JsonProperty("EmpSequenceNumber")
	private String empSequenceNumber;
	@JsonProperty("DisbursementType")
	private String disbursementType;
	@JsonProperty("ClaimReferenceNumber")
	private String claimReferenceNumber;
	
	
	
	@Override
	public String toString() {
		return "PostBackRequest [amount=" + amount + ", transactionDateTime="
				+ transactionDateTime + ", statusCode=" + statusCode
				+ ", paymentTransactionID=" + paymentTransactionID
				+ ", transactionAction=" + transactionAction + ", claimNumber="
				+ claimNumber + ", empGroupNumber=" + empGroupNumber
				+ ", eEID=" + eEID + ", empSequenceNumber=" + empSequenceNumber
				+ ", disbursementType=" + disbursementType
				+ ", claimReferenceNumber=" + claimReferenceNumber + "]";
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTransactionDateTime() {
		return transactionDateTime;
	}
	public void setTransactionDateTime(String transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getPaymentTransactionID() {
		return paymentTransactionID;
	}
	public void setPaymentTransactionID(String paymentTransactionID) {
		this.paymentTransactionID = paymentTransactionID;
	}
	public String getTransactionAction() {
		return transactionAction;
	}
	public void setTransactionAction(String transactionAction) {
		this.transactionAction = transactionAction;
	}
	public String getClaimNumber() {
		return claimNumber;
	}
	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}
	public String getEmpGroupNumber() {
		return empGroupNumber;
	}
	public void setEmpGroupNumber(String empGroupNumber) {
		this.empGroupNumber = empGroupNumber;
	}
	public String geteEID() {
		return eEID;
	}
	public void seteEID(String eEID) {
		this.eEID = eEID;
	}
	public String getEmpSequenceNumber() {
		return empSequenceNumber;
	}
	public void setEmpSequenceNumber(String empSequenceNumber) {
		this.empSequenceNumber = empSequenceNumber;
	}
	public String getDisbursementType() {
		return disbursementType;
	}
	public void setDisbursementType(String disbursementType) {
		this.disbursementType = disbursementType;
	}
	public String getClaimReferenceNumber() {
		return claimReferenceNumber;
	}
	public void setClaimReferenceNumber(String claimReferenceNumber) {
		this.claimReferenceNumber = claimReferenceNumber;
	}
	
	
}
