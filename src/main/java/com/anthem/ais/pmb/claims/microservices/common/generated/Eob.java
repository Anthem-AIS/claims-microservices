package com.anthem.ais.pmb.claims.microservices.common.generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "eobUid",
    "sorCd",
    "eobMbrId",
    "eobDt",
    "eobSequenceNbr",
    "checkNbr",
    "checkDt",
    "clmId",
    "serviceStartDt",
    "serviceEndDt",
    "clmProcessDt",
    "subscriberNm",
    "patientNm",
    "legacyId",
    "underwritingStateCd"
    
})
public class Eob {
	
	 	@JsonProperty("eobUid")
	    private String eobUid;
	 	
	 	@JsonProperty("sorCd")
	    private String sorCd;
	 	
	 	@JsonProperty("eobMbrId")
	    private String eobMbrId;
	 	
	 	@JsonProperty("eobDt")
	    private String eobDt;
	 	
		@JsonProperty("eobSequenceNbr")
	    private String eobSequenceNbr;
		
		@JsonProperty("checkNbr")
	    private String checkNbr;
		
		@JsonProperty("checkDt")
	    private String checkDt;
		
		@JsonProperty("clmId")
	    private String clmId;
		
		@JsonProperty("serviceStartDt")
	    private String serviceStartDt;
		
		@JsonProperty("serviceEndDt")
	    private String serviceEndDt;
		
		@JsonProperty("clmProcessDt")
	    private String clmProcessDt;
		
		@JsonProperty("subscriberNm")
	    private String subscriberNm;
		
		@JsonProperty("patientNm")
	    private String patientNm;
		
		@JsonProperty("legacyId")
	    private String legacyId;
		
		@JsonProperty("underwritingStateCd")
	    private String underwritingStateCd;

		@JsonProperty("eobUid")
		public String getEobUid() {
			return eobUid;
		}

		@JsonProperty("eobUid")
		public void setEobUid(String eobUid) {
			this.eobUid = eobUid;
		}
		
	 	/**
		 * @return the sorCd
		 */
		@JsonProperty("sorCd")
		public String getSorCd() {
			return sorCd;
		}

		/**
		 * @param sorCd the sorCd to set
		 */
		@JsonProperty("sorCd")
		public void setSorCd(String sorCd) {
			this.sorCd = sorCd;
		}

		/**
		 * @return the eobMbrId
		 */
		@JsonProperty("eobMbrId")
		public String getEobMbrId() {
			return eobMbrId;
		}

		/**
		 * @param eobMbrId the eobMbrId to set
		 */
		@JsonProperty("eobMbrId")
		public void setEobMbrId(String eobMbrId) {
			this.eobMbrId = eobMbrId;
		}

		/**
		 * @return the eobDt
		 */
		@JsonProperty("eobDt")
		public String getEobDt() {
			return eobDt;
		}

		/**
		 * @param eobDt the eobDt to set
		 */
		@JsonProperty("eobDt")
		public void setEobDt(String eobDt) {
			this.eobDt = eobDt;
		}

		/**
		 * @return the eobSequenceNbr
		 */
		@JsonProperty("eobSequenceNbr")
		public String getEobSequenceNbr() {
			return eobSequenceNbr;
		}

		/**
		 * @param eobSequenceNbr the eobSequenceNbr to set
		 */
		@JsonProperty("eobSequenceNbr")
		public void setEobSequenceNbr(String eobSequenceNbr) {
			this.eobSequenceNbr = eobSequenceNbr;
		}

		/**
		 * @return the checkNbr
		 */
		@JsonProperty("checkNbr")
		public String getCheckNbr() {
			return checkNbr;
		}

		/**
		 * @param checkNbr the checkNbr to set
		 */
		@JsonProperty("checkNbr")
		public void setCheckNbr(String checkNbr) {
			this.checkNbr = checkNbr;
		}

		/**
		 * @return the checkDt
		 */
		@JsonProperty("checkDt")
		public String getCheckDt() {
			return checkDt;
		}

		/**
		 * @param checkDt the checkDt to set
		 */
		@JsonProperty("checkDt")
		public void setCheckDt(String checkDt) {
			this.checkDt = checkDt;
		}

		/**
		 * @return the clmId
		 */
		@JsonProperty("clmId")
		public String getClmId() {
			return clmId;
		}

		/**
		 * @param clmId the clmId to set
		 */
		@JsonProperty("clmId")
		public void setClmId(String clmId) {
			this.clmId = clmId;
		}

		/**
		 * @return the serviceStartDt
		 */
		@JsonProperty("serviceStartDt")
		public String getServiceStartDt() {
			return serviceStartDt;
		}

		/**
		 * @param serviceStartDt the serviceStartDt to set
		 */
		@JsonProperty("serviceStartDt")
		public void setServiceStartDt(String serviceStartDt) {
			this.serviceStartDt = serviceStartDt;
		}

		/**
		 * @return the serviceEndDt
		 */
		@JsonProperty("serviceEndDt")
		public String getServiceEndDt() {
			return serviceEndDt;
		}

		/**
		 * @param serviceEndDt the serviceEndDt to set
		 */
		@JsonProperty("serviceEndDt")
		public void setServiceEndDt(String serviceEndDt) {
			this.serviceEndDt = serviceEndDt;
		}

		/**
		 * @return the clmProcessDt
		 */
		@JsonProperty("clmProcessDt")
		public String getClmProcessDt() {
			return clmProcessDt;
		}

		/**
		 * @param clmProcessDt the clmProcessDt to set
		 */
		@JsonProperty("clmProcessDt")
		public void setClmProcessDt(String clmProcessDt) {
			this.clmProcessDt = clmProcessDt;
		}

		/**
		 * @return the subscriberNm
		 */
		@JsonProperty("subscriberNm")
		public String getSubscriberNm() {
			return subscriberNm;
		}

		/**
		 * @param subscriberNm the subscriberNm to set
		 */
		@JsonProperty("subscriberNm")
		public void setSubscriberNm(String subscriberNm) {
			this.subscriberNm = subscriberNm;
		}

		/**
		 * @return the patientNm
		 */
		@JsonProperty("patientNm")
		public String getPatientNm() {
			return patientNm;
		}

		/**
		 * @param patientNm the patientNm to set
		 */
		@JsonProperty("patientNm")
		public void setPatientNm(String patientNm) {
			this.patientNm = patientNm;
		}

		/**
		 * @return the legacyId
		 */
		@JsonProperty("legacyId")
		public String getLegacyId() {
			return legacyId;
		}

		/**
		 * @param legacyId the legacyId to set
		 */
		@JsonProperty("legacyId")
		public void setLegacyId(String legacyId) {
			this.legacyId = legacyId;
		}

		/**
		 * @return the underwritingStateCd
		 */
		@JsonProperty("underwritingStateCd")
		public String getUnderwritingStateCd() {
			return underwritingStateCd;
		}

		/**
		 * @param underwritingStateCd the underwritingStateCd to set
		 */
		@JsonProperty("underwritingStateCd")
		public void setUnderwritingStateCd(String underwritingStateCd) {
			this.underwritingStateCd = underwritingStateCd;
		}

	
		
		
		

}
