package com.anthem.ais.pmb.claims.microservices.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CLAIMS_PAYMENT database table.
 * 
 */
@Embeddable
public class ClaimsPaymentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private String claimId;
	private String paymentTransactionid;

	public ClaimsPaymentPK() {
	}

	@Column(name="CLAIM_ID")
	public String getClaimId() {
		return this.claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}

	@Column(name="PAYMENT_TRANSACTIONID")
	public String getPaymentTransactionid() {
		return this.paymentTransactionid;
	}
	public void setPaymentTransactionid(String paymentTransactionid) {
		this.paymentTransactionid = paymentTransactionid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ClaimsPaymentPK)) {
			return false;
		}
		ClaimsPaymentPK castOther = (ClaimsPaymentPK)other;
		return 
			this.claimId.equals(castOther.claimId)
			&& this.paymentTransactionid.equals(castOther.paymentTransactionid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.claimId.hashCode();
		hash = hash * prime + this.paymentTransactionid.hashCode();
		
		return hash;
	}
}