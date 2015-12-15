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
"billingTIN",
"facilityAddress",
"remittanceAddress",
"phoneNumber"
})
public class Provider {

@JsonProperty("billingTIN")
private String billingTIN;
@JsonProperty("facilityAddress")
private FacilityAddress facilityAddress;
@JsonProperty("remittanceAddress")
private RemittanceAddress remittanceAddress;
@JsonProperty("phoneNumber")
private String phoneNumber;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The billingTIN
*/
@JsonProperty("billingTIN")
public String getBillingTIN() {
return billingTIN;
}

/**
* 
* @param billingTIN
* The billingTIN
*/
@JsonProperty("billingTIN")
public void setBillingTIN(String billingTIN) {
this.billingTIN = billingTIN;
}

/**
* 
* @return
* The facilityAddress
*/
@JsonProperty("facilityAddress")
public FacilityAddress getFacilityAddress() {
return facilityAddress;
}

/**
* 
* @param facilityAddress
* The facilityAddress
*/
@JsonProperty("facilityAddress")
public void setFacilityAddress(FacilityAddress facilityAddress) {
this.facilityAddress = facilityAddress;
}

/**
* 
* @return
* The remittanceAddress
*/
@JsonProperty("remittanceAddress")
public RemittanceAddress getRemittanceAddress() {
return remittanceAddress;
}

/**
* 
* @param remittanceAddress
* The remittanceAddress
*/
@JsonProperty("remittanceAddress")
public void setRemittanceAddress(RemittanceAddress remittanceAddress) {
this.remittanceAddress = remittanceAddress;
}

/**
* 
* @return
* The phoneNumber
*/
@JsonProperty("phoneNumber")
public String getPhoneNumber() {
return phoneNumber;
}

/**
* 
* @param phoneNumber
* The phoneNumber
*/
@JsonProperty("phoneNumber")
public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
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
