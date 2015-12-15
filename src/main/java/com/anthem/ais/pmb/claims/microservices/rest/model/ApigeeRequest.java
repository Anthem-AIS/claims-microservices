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
"userToken",
"HCID"
})
public class ApigeeRequest {

@JsonProperty("userToken")
private String userToken;
@JsonProperty("HCID")
private String HCID;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The userToken
*/
@JsonProperty("userToken")
public String getUserToken() {
return userToken;
}

/**
* 
* @param userToken
* The userToken
*/
@JsonProperty("userToken")
public void setUserToken(String userToken) {
this.userToken = userToken;
}

/**
* 
* @return
* The HCID
*/
@JsonProperty("HCID")
public String getHCID() {
return HCID;
}

/**
* 
* @param HCID
* The HCID
*/
@JsonProperty("HCID")
public void setHCID(String HCID) {
this.HCID = HCID;
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