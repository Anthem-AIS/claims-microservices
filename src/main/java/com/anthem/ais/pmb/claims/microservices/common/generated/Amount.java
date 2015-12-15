
package com.anthem.ais.pmb.claims.microservices.common.generated;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
	"allowedAmt",
	"coinsuranceAmt",
	"copayAmt",
	"deductibleAmt",
	"mbrResponsibilityAmt",
	"paidAmt",
    "totalChargeAmt"
  
})
public class Amount {

    @JsonProperty("allowedAmt")
    @JsonSerialize(using = AmountTransformer.class)
    private BigDecimal allowedAmt;
    @JsonProperty("coinsuranceAmt")
    @JsonSerialize(using = AmountTransformer.class)
    private BigDecimal coinsuranceAmt;
    @JsonProperty("copayAmt")
    @JsonSerialize(using = AmountTransformer.class)
    private BigDecimal copayAmt;
    @JsonProperty("deductibleAmt")
    @JsonSerialize(using = AmountTransformer.class)
    private BigDecimal deductibleAmt;
    @JsonProperty("mbrResponsibilityAmt")
    @JsonSerialize(using = AmountTransformer.class)
    private BigDecimal mbrResponsibilityAmt;
    @JsonProperty("paidAmt")
    @JsonSerialize(using = AmountTransformer.class)
    private BigDecimal paidAmt;
    @JsonProperty("totalChargeAmt")
    @JsonSerialize(using = AmountTransformer.class)
    private BigDecimal totalChargeAmt;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    /**
	 * @return the allowedAmt
	 */
    @JsonProperty("allowedAmt")
    @JsonSerialize(using = AmountTransformer.class)
	public BigDecimal getAllowedAmt() {
		return allowedAmt;
	}

	/**
	 * @param allowedAmt the allowedAmt to set
	 */
    @JsonProperty("allowedAmt")
    @JsonSerialize(using = AmountTransformer.class)
	public void setAllowedAmt(BigDecimal allowedAmt) {
		this.allowedAmt = allowedAmt;
	}

	/**
	 * @return the coinsuranceAmt
	 */
    @JsonProperty("coinsuranceAmt")
    @JsonSerialize(using = AmountTransformer.class)
	public BigDecimal getCoinsuranceAmt() {
		return coinsuranceAmt;
	}

	/**
	 * @param coinsuranceAmt the coinsuranceAmt to set
	 */
    @JsonProperty("coinsuranceAmt")
    @JsonSerialize(using = AmountTransformer.class)
	public void setCoinsuranceAmt(BigDecimal coinsuranceAmt) {
		this.coinsuranceAmt = coinsuranceAmt;
	}

	/**
	 * @return the copayAmt
	 */
    @JsonProperty("copayAmt")
    @JsonSerialize(using = AmountTransformer.class)
	public BigDecimal getCopayAmt() {
		return copayAmt;
	}

	/**
	 * @param copayAmt the copayAmt to set
	 */
    @JsonProperty("copayAmt")
    @JsonSerialize(using = AmountTransformer.class)
	public void setCopayAmt(BigDecimal copayAmt) {
		this.copayAmt = copayAmt;
	}

	/**
	 * @return the deductibleAmt
	 */
    @JsonProperty("deductibleAmt")
    @JsonSerialize(using = AmountTransformer.class)
	public BigDecimal getDeductibleAmt() {
		return deductibleAmt;
	}

	/**
	 * @param deductibleAmt the deductibleAmt to set
	 */
    @JsonProperty("deductibleAmt")
    @JsonSerialize(using = AmountTransformer.class)
	public void setDeductibleAmt(BigDecimal deductibleAmt) {
		this.deductibleAmt = deductibleAmt;
	}

	/**
	 * @return the paidAmt
	 */
    @JsonProperty("paidAmt")
    @JsonSerialize(using = AmountTransformer.class)
	public BigDecimal getPaidAmt() {
		return paidAmt;
	}

	/**
	 * @param paidAmt the paidAmt to set
	 */
    @JsonProperty("paidAmt")
    @JsonSerialize(using = AmountTransformer.class)
	public void setPaidAmt(BigDecimal paidAmt) {
		this.paidAmt = paidAmt;
	}

	/**
     * 
     * @return
     *     The totalChargeAmt
     */
    @JsonProperty("totalChargeAmt")
    @JsonSerialize(using = AmountTransformer.class)
    public BigDecimal getTotalChargeAmt() {
        return totalChargeAmt;
    }

    /**
     * 
     * @param totalChargeAmt
     *     The totalChargeAmt
     */
    @JsonProperty("totalChargeAmt")
    @JsonSerialize(using = AmountTransformer.class)
    public void setTotalChargeAmt(BigDecimal totalChargeAmt) {
        this.totalChargeAmt = totalChargeAmt;
    }

    /**
     * 
     * @return
     *     The mbrResponsibilityAmt
     */
    @JsonProperty("mbrResponsibilityAmt")
    @JsonSerialize(using = AmountTransformer.class)
    public BigDecimal getMbrResponsibilityAmt() {
        return mbrResponsibilityAmt;
    }

    /**
     * 
     * @param mbrResponsibilityAmt
     *     The mbrResponsibilityAmt
     */
    @JsonProperty("mbrResponsibilityAmt")
    @JsonSerialize(using = AmountTransformer.class)
    public void setMbrResponsibilityAmt(BigDecimal mbrResponsibilityAmt) {
        this.mbrResponsibilityAmt = mbrResponsibilityAmt;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    
 

}
