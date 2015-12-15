package com.anthem.ais.pmb.claims.microservices.common.generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "serviceStartDt",
    "serviceEndDt",
    "allowedAmt",
    "chargeAmt",
    "procedureCd",
    "diagnoses"
})

public class ServiceLines {
	@JsonProperty("serviceStartDt")
    private String serviceStartDt;
	@JsonProperty("serviceEndDt")
    private String serviceEndDt;
	@JsonProperty("allowedAmt")
    @JsonSerialize(using = AmountTransformer.class)
    private BigDecimal allowedAmt;
	@JsonProperty("chargeAmt")
	@JsonSerialize(using = AmountTransformer.class)
	private BigDecimal chargeAmt;
	@JsonProperty("procedureCd")
    private ProcedureCd procedureCd;
	@JsonProperty("diagnoses")
	private List<Diagnoses> diagnoses = new ArrayList<Diagnoses>();
	/**
	 * @return the serviceStartDt
	 */
	public String getServiceStartDt() {
		return serviceStartDt;
	}
	/**
	 * @param serviceStartDt the serviceStartDt to set
	 */
	public void setServiceStartDt(String serviceStartDt) {
		this.serviceStartDt = serviceStartDt;
	}
	/**
	 * @return the serviceEndDt
	 */
	public String getServiceEndDt() {
		return serviceEndDt;
	}
	/**
	 * @param serviceEndDt the serviceEndDt to set
	 */
	public void setServiceEndDt(String serviceEndDt) {
		this.serviceEndDt = serviceEndDt;
	}
	/**
     * 
     * @return
     *     The allowedAmt
     */
    @JsonProperty("allowedAmt")
    @JsonSerialize(using = AmountTransformer.class)
    public BigDecimal getAllowedAmt() {
        return allowedAmt;
    }

    /**
     * 
     * @param allowedAmt
     *     The allowedAmt
     */
    @JsonProperty("allowedAmt")
    @JsonSerialize(using = AmountTransformer.class)
    public void setAllowedAmt(BigDecimal allowedAmt) {
        this.allowedAmt = allowedAmt;
    }
	/**
     * 
     * @return
     *     The chargeAmt
     */
    @JsonProperty("chargeAmt")
    @JsonSerialize(using = AmountTransformer.class)
    public BigDecimal getChargeAmt() {
        return chargeAmt;
    }

    /**
     * 
     * @param chargeAmt
     *     The chargeAmt
     */
    @JsonProperty("chargeAmt")
    @JsonSerialize(using = AmountTransformer.class)
    public void setChargeAmt(BigDecimal chargeAmt) {
        this.chargeAmt = chargeAmt;
    }
    
	/**
	 * @return the procedureCd
	 */
	public ProcedureCd getProcedureCd() {
		return procedureCd;
	}
	/**
	 * @param procedureCd the procedureCd to set
	 */
	public void setProcedureCd(ProcedureCd procedureCd) {
		this.procedureCd = procedureCd;
	}
	/**
	 * @return the diagnoses
	 */
	public List<Diagnoses> getDiagnoses() {
		return diagnoses;
	}
	/**
	 * @param diagnoses the diagnoses to set
	 */
	public void setDiagnoses(List<Diagnoses> diagnoses) {
		this.diagnoses = diagnoses;
	}
	
	
}
