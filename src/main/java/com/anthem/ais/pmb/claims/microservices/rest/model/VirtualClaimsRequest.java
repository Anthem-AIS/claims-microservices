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
"claimId",
"amountOwed",
"memberSequenceNumber",
"provider"
})
public class VirtualClaimsRequest {

@JsonProperty("claimId")
private String claimId;
@JsonProperty("amountOwed")
private Double amountOwed;
@JsonProperty("memberSequenceNumber")
private Integer memberSequenceNumber;
@JsonProperty("provider")
private Provider provider;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The claimId
*/
@JsonProperty("claimId")
public String getClaimId() {
return claimId;
}

/**
* 
* @param claimId
* The claimId
*/
@JsonProperty("claimId")
public void setClaimId(String claimId) {
this.claimId = claimId;
}

/**
* 
* @return
* The amountOwed
*/
@JsonProperty("amountOwed")
public Double getAmountOwed() {
return amountOwed;
}

/**
* 
* @param amountOwed
* The amountOwed
*/
@JsonProperty("amountOwed")
public void setAmountOwed(Double amountOwed) {
this.amountOwed = amountOwed;
}

/**
* 
* @return
* The memberSequenceNumber
*/
@JsonProperty("memberSequenceNumber")
public Integer getMemberSequenceNumber() {
return memberSequenceNumber;
}

/**
* 
* @param memberSequenceNumber
* The memberSequenceNumber
*/
@JsonProperty("memberSequenceNumber")
public void setMemberSequenceNumber(Integer memberSequenceNumber) {
this.memberSequenceNumber = memberSequenceNumber;
}

/**
* 
* @return
* The provider
*/
@JsonProperty("provider")
public Provider getProvider() {
return provider;
}

/**
* 
* @param provider
* The provider
*/
@JsonProperty("provider")
public void setProvider(Provider provider) {
this.provider = provider;
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

