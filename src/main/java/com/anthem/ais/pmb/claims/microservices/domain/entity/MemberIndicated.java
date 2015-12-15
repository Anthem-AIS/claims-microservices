package com.anthem.ais.pmb.claims.microservices.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the MEMBER_INDICATED database table.
 * 
 */
@Entity
@Table(name="MEMBER_INDICATED", schema = "AIS")
public class MemberIndicated implements Serializable {
	private static final long serialVersionUID = 1L;
	private MemberIndicatedPK id;
	private double amountPaid;
	private String hcid;
	private String notes;
	private long sequenceNumber;
	private Timestamp transactionDateTime;

	public MemberIndicated() {
	}


	@EmbeddedId
	public MemberIndicatedPK getId() {
		return this.id;
	}

	public void setId(MemberIndicatedPK id) {
		this.id = id;
	}


	@Column(name="AMOUNT_PAID")
	public double getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}


	public String getHcid() {
		return this.hcid;
	}

	public void setHcid(String hcid) {
		this.hcid = hcid;
	}


	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}


	@Column(name="SEQUENCE_NUMBER")
	public long getSequenceNumber() {
		return this.sequenceNumber;
	}

	public void setSequenceNumber(long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}


	@Column(name="TRANSACTION_DATE_TIME")
	public Timestamp getTransactionDateTime() {
		return this.transactionDateTime;
	}

	public void setTransactionDateTime(Timestamp transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

}