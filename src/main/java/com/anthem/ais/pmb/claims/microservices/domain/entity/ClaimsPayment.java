package com.anthem.ais.pmb.claims.microservices.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CLAIMS_PAYMENT database table.
 * 
 */
@Entity
@Table(name="CLAIMS_PAYMENT", schema = "AIS")
public class ClaimsPayment implements Serializable {
	private static final long serialVersionUID = 1L;
	private ClaimsPaymentPK id;
	private Long amountPaid;
	private int businessDate;
	private String claimReferenceNumber;
	private String disbursementType;
	private String eeId;
	private String empGroupNumber;
	private String empSequenceNumber;
	private long sequenceNumber;
	private String statusCode;
	private String templateId;
	private String transactionAction;
	private Timestamp transactionDateTime;
	private HcidSequenceNumber2Uuid hcidSequenceNumber2Uuid;

	public ClaimsPayment() {
	}


	@EmbeddedId
	public ClaimsPaymentPK getId() {
		return this.id;
	}

	public void setId(ClaimsPaymentPK id) {
		this.id = id;
	}


	@Column(name="AMOUNT_PAID")
	public Long getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountPaid(Long amountPaid) {
		this.amountPaid = amountPaid;
	}


	@Column(name="BUSINESS_DATE")
	public int getBusinessDate() {
		return this.businessDate;
	}

	public void setBusinessDate(int businessDate) {
		this.businessDate = businessDate;
	}


	@Column(name="CLAIM_REFERENCE_NUMBER")
	public String getClaimReferenceNumber() {
		return this.claimReferenceNumber;
	}

	public void setClaimReferenceNumber(String claimReferenceNumber) {
		this.claimReferenceNumber = claimReferenceNumber;
	}


	@Column(name="DISBURSEMENT_TYPE")
	public String getDisbursementType() {
		return this.disbursementType;
	}

	public void setDisbursementType(String disbursementType) {
		this.disbursementType = disbursementType;
	}


	@Column(name="EE_ID")
	public String getEeId() {
		return this.eeId;
	}

	public void setEeId(String eeId) {
		this.eeId = eeId;
	}


	@Column(name="EMP_GROUP_NUMBER")
	public String getEmpGroupNumber() {
		return this.empGroupNumber;
	}

	public void setEmpGroupNumber(String empGroupNumber) {
		this.empGroupNumber = empGroupNumber;
	}


	@Column(name="EMP_SEQUENCE_NUMBER")
	public String getEmpSequenceNumber() {
		return this.empSequenceNumber;
	}

	public void setEmpSequenceNumber(String empSequenceNumber) {
		this.empSequenceNumber = empSequenceNumber;
	}


	@Column(name="SEQUENCE_NUMBER")
	public long getSequenceNumber() {
		return this.sequenceNumber;
	}

	public void setSequenceNumber(long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}


	@Column(name="STATUS_CODE")
	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}


	@Column(name="TEMPLATE_ID")
	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}


	@Column(name="TRANSACTION_ACTION")
	public String getTransactionAction() {
		return this.transactionAction;
	}

	public void setTransactionAction(String transactionAction) {
		this.transactionAction = transactionAction;
	}


	@Column(name="TRANSACTION_DATE_TIME")
	public Timestamp getTransactionDateTime() {
		return this.transactionDateTime;
	}

	public void setTransactionDateTime(Timestamp transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}


	//bi-directional many-to-one association to HcidSequenceNumber2Uuid
	@ManyToOne
	@JoinColumn(name="HCID")
	public HcidSequenceNumber2Uuid getHcidSequenceNumber2Uuid() {
		return this.hcidSequenceNumber2Uuid;
	}

	public void setHcidSequenceNumber2Uuid(HcidSequenceNumber2Uuid hcidSequenceNumber2Uuid) {
		this.hcidSequenceNumber2Uuid = hcidSequenceNumber2Uuid;
	}

}