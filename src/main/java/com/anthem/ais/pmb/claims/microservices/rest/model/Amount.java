package com.anthem.ais.pmb.claims.microservices.rest.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
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
private String allowedAmt;
@JsonProperty("coinsuranceAmt")
private String coinsuranceAmt;
@JsonProperty("copayAmt")
private String copayAmt;
@JsonProperty("deductibleAmt")
private String deductibleAmt;
@JsonProperty("mbrResponsibilityAmt")
private String mbrResponsibilityAmt;
@JsonProperty("paidAmt")
private String paidAmt;
@JsonProperty("totalChargeAmt")
private String totalChargeAmt;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The allowedAmt
*/
@JsonProperty("allowedAmt")
public String getAllowedAmt() {
return allowedAmt;
}

/**
* 
* @param allowedAmt
* The allowedAmt
*/
@JsonProperty("allowedAmt")
public void setAllowedAmt(String allowedAmt) {
this.allowedAmt = allowedAmt;
}

/**
* 
* @return
* The coinsuranceAmt
*/
@JsonProperty("coinsuranceAmt")
public String getCoinsuranceAmt() {
return coinsuranceAmt;
}

/**
* 
* @param coinsuranceAmt
* The coinsuranceAmt
*/
@JsonProperty("coinsuranceAmt")
public void setCoinsuranceAmt(String coinsuranceAmt) {
this.coinsuranceAmt = coinsuranceAmt;
}

/**
* 
* @return
* The copayAmt
*/
@JsonProperty("copayAmt")
public String getCopayAmt() {
return copayAmt;
}

/**
* 
* @param copayAmt
* The copayAmt
*/
@JsonProperty("copayAmt")
public void setCopayAmt(String copayAmt) {
this.copayAmt = copayAmt;
}

/**
* 
* @return
* The deductibleAmt
*/
@JsonProperty("deductibleAmt")
public String getDeductibleAmt() {
return deductibleAmt;
}

/**
* 
* @param deductibleAmt
* The deductibleAmt
*/
@JsonProperty("deductibleAmt")
public void setDeductibleAmt(String deductibleAmt) {
this.deductibleAmt = deductibleAmt;
}

/**
* 
* @return
* The mbrResponsibilityAmt
*/
@JsonProperty("mbrResponsibilityAmt")
public String getMbrResponsibilityAmt() {
return mbrResponsibilityAmt;
}

/**
* 
* @param mbrResponsibilityAmt
* The mbrResponsibilityAmt
*/
@JsonProperty("mbrResponsibilityAmt")
public void setMbrResponsibilityAmt(String mbrResponsibilityAmt) {
this.mbrResponsibilityAmt = mbrResponsibilityAmt;
}

/**
* 
* @return
* The paidAmt
*/
@JsonProperty("paidAmt")
public String getPaidAmt() {
return paidAmt;
}

/**
* 
* @param paidAmt
* The paidAmt
*/
@JsonProperty("paidAmt")
public void setPaidAmt(String paidAmt) {
this.paidAmt = paidAmt;
}

/**
* 
* @return
* The totalChargeAmt
*/
@JsonProperty("totalChargeAmt")
public String getTotalChargeAmt() {
return totalChargeAmt;
}

/**
* 
* @param totalChargeAmt
* The totalChargeAmt
*/
@JsonProperty("totalChargeAmt")
public void setTotalChargeAmt(String totalChargeAmt) {
this.totalChargeAmt = totalChargeAmt;
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
