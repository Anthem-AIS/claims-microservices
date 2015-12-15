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
"clmId",
"clmClassCd",
"clmTypeCd",
"clmStatusCd",
"clmSensitiveInd",
"clmStartDt",
"clmEndDt",
"patient",
"amount",
"servicingProvider"
})
public class Claim {

@JsonProperty("clmId")
private String clmId;
@JsonProperty("clmClassCd")
private ClmClassCd clmClassCd;
@JsonProperty("clmTypeCd")
private ClmTypeCd clmTypeCd;
@JsonProperty("clmStatusCd")
private ClmStatusCd clmStatusCd;
@JsonProperty("clmSensitiveInd")
private String clmSensitiveInd;
@JsonProperty("clmStartDt")
private String clmStartDt;
@JsonProperty("clmEndDt")
private String clmEndDt;
@JsonProperty("patient")
private Patient patient;
@JsonProperty("amount")
private Amount amount;
@JsonProperty("servicingProvider")
private ServicingProvider servicingProvider;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The clmId
*/
@JsonProperty("clmId")
public String getClmId() {
return clmId;
}

/**
* 
* @param clmId
* The clmId
*/
@JsonProperty("clmId")
public void setClmId(String clmId) {
this.clmId = clmId;
}

/**
* 
* @return
* The clmClassCd
*/
@JsonProperty("clmClassCd")
public ClmClassCd getClmClassCd() {
return clmClassCd;
}

/**
* 
* @param clmClassCd
* The clmClassCd
*/
@JsonProperty("clmClassCd")
public void setClmClassCd(ClmClassCd clmClassCd) {
this.clmClassCd = clmClassCd;
}

/**
* 
* @return
* The clmTypeCd
*/
@JsonProperty("clmTypeCd")
public ClmTypeCd getClmTypeCd() {
return clmTypeCd;
}

/**
* 
* @param clmTypeCd
* The clmTypeCd
*/
@JsonProperty("clmTypeCd")
public void setClmTypeCd(ClmTypeCd clmTypeCd) {
this.clmTypeCd = clmTypeCd;
}

/**
* 
* @return
* The clmStatusCd
*/
@JsonProperty("clmStatusCd")
public ClmStatusCd getClmStatusCd() {
return clmStatusCd;
}

/**
* 
* @param clmStatusCd
* The clmStatusCd
*/
@JsonProperty("clmStatusCd")
public void setClmStatusCd(ClmStatusCd clmStatusCd) {
this.clmStatusCd = clmStatusCd;
}

/**
* 
* @return
* The clmSensitiveInd
*/
@JsonProperty("clmSensitiveInd")
public String getClmSensitiveInd() {
return clmSensitiveInd;
}

/**
* 
* @param clmSensitiveInd
* The clmSensitiveInd
*/
@JsonProperty("clmSensitiveInd")
public void setClmSensitiveInd(String clmSensitiveInd) {
this.clmSensitiveInd = clmSensitiveInd;
}

/**
* 
* @return
* The clmStartDt
*/
@JsonProperty("clmStartDt")
public String getClmStartDt() {
return clmStartDt;
}

/**
* 
* @param clmStartDt
* The clmStartDt
*/
@JsonProperty("clmStartDt")
public void setClmStartDt(String clmStartDt) {
this.clmStartDt = clmStartDt;
}

/**
* 
* @return
* The clmEndDt
*/
@JsonProperty("clmEndDt")
public String getClmEndDt() {
return clmEndDt;
}

/**
* 
* @param clmEndDt
* The clmEndDt
*/
@JsonProperty("clmEndDt")
public void setClmEndDt(String clmEndDt) {
this.clmEndDt = clmEndDt;
}

/**
* 
* @return
* The patient
*/
@JsonProperty("patient")
public Patient getPatient() {
return patient;
}

/**
* 
* @param patient
* The patient
*/
@JsonProperty("patient")
public void setPatient(Patient patient) {
this.patient = patient;
}

/**
* 
* @return
* The amount
*/
@JsonProperty("amount")
public Amount getAmount() {
return amount;
}

/**
* 
* @param amount
* The amount
*/
@JsonProperty("amount")
public void setAmount(Amount amount) {
this.amount = amount;
}

/**
* 
* @return
* The servicingProvider
*/
@JsonProperty("servicingProvider")
public ServicingProvider getServicingProvider() {
return servicingProvider;
}

/**
* 
* @param servicingProvider
* The servicingProvider
*/
@JsonProperty("servicingProvider")
public void setServicingProvider(ServicingProvider servicingProvider) {
this.servicingProvider = servicingProvider;
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
