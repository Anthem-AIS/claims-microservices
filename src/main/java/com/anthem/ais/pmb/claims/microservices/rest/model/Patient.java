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
"hcId",
"firstNm",
"lastNm",
"dob"
})
public class Patient {

@JsonProperty("hcId")
private String hcId;
@JsonProperty("firstNm")
private String firstNm;
@JsonProperty("lastNm")
private String lastNm;
@JsonProperty("dob")
private String dob;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The hcId
*/
@JsonProperty("hcId")
public String getHcId() {
return hcId;
}

/**
* 
* @param hcId
* The hcId
*/
@JsonProperty("hcId")
public void setHcId(String hcId) {
this.hcId = hcId;
}

/**
* 
* @return
* The firstNm
*/
@JsonProperty("firstNm")
public String getFirstNm() {
return firstNm;
}

/**
* 
* @param firstNm
* The firstNm
*/
@JsonProperty("firstNm")
public void setFirstNm(String firstNm) {
this.firstNm = firstNm;
}

/**
* 
* @return
* The lastNm
*/
@JsonProperty("lastNm")
public String getLastNm() {
return lastNm;
}

/**
* 
* @param lastNm
* The lastNm
*/
@JsonProperty("lastNm")
public void setLastNm(String lastNm) {
this.lastNm = lastNm;
}

/**
* 
* @return
* The dob
*/
@JsonProperty("dob")
public String getDob() {
return dob;
}

/**
* 
* @param dob
* The dob
*/
@JsonProperty("dob")
public void setDob(String dob) {
this.dob = dob;
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
