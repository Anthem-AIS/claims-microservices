package com.anthem.ais.pmb.claims.microservices.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the HCID_SEQUENCE_NUMBER_2_UUID database table.
 * 
 */
@Entity
@Table(name="HCID_SEQUENCE_NUMBER_2_UUID", schema = "AIS")
public class HcidSequenceNumber2Uuid implements Serializable {
	private static final long serialVersionUID = 1L;
	private String hcid;
	private String uuid;
	private List<ClaimsPayment> claimsPayments;

	public HcidSequenceNumber2Uuid() {
	}


	@Id
	public String getHcid() {
		return this.hcid;
	}

	public void setHcid(String hcid) {
		this.hcid = hcid;
	}


	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	//bi-directional many-to-one association to ClaimsPayment
	@OneToMany(mappedBy="hcidSequenceNumber2Uuid")
	public List<ClaimsPayment> getClaimsPayments() {
		return this.claimsPayments;
	}

	public void setClaimsPayments(List<ClaimsPayment> claimsPayments) {
		this.claimsPayments = claimsPayments;
	}

	public ClaimsPayment addClaimsPayment(ClaimsPayment claimsPayment) {
		getClaimsPayments().add(claimsPayment);
		claimsPayment.setHcidSequenceNumber2Uuid(this);

		return claimsPayment;
	}

	public ClaimsPayment removeClaimsPayment(ClaimsPayment claimsPayment) {
		getClaimsPayments().remove(claimsPayment);
		claimsPayment.setHcidSequenceNumber2Uuid(null);

		return claimsPayment;
	}

}