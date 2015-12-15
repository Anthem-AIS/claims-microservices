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
"streetAddress1",
"streetAddress2",
"city",
"state",
"zip"
})
public class RemittanceAddress {

@JsonProperty("streetAddress1")
private String streetAddress1;
@JsonProperty("streetAddress2")
private String streetAddress2;
@JsonProperty("city")
private String city;
@JsonProperty("state")
private String state;
@JsonProperty("zip")
private String zip;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The streetAddress1
*/
@JsonProperty("streetAddress1")
public String getStreetAddress1() {
return streetAddress1;
}

/**
* 
* @param streetAddress1
* The streetAddress1
*/
@JsonProperty("streetAddress1")
public void setStreetAddress1(String streetAddress1) {
this.streetAddress1 = streetAddress1;
}

/**
* 
* @return
* The streetAddress2
*/
@JsonProperty("streetAddress2")
public String getStreetAddress2() {
return streetAddress2;
}

/**
* 
* @param streetAddress2
* The streetAddress2
*/
@JsonProperty("streetAddress2")
public void setStreetAddress2(String streetAddress2) {
this.streetAddress2 = streetAddress2;
}

/**
* 
* @return
* The city
*/
@JsonProperty("city")
public String getCity() {
return city;
}

/**
* 
* @param city
* The city
*/
@JsonProperty("city")
public void setCity(String city) {
this.city = city;
}

/**
* 
* @return
* The state
*/
@JsonProperty("state")
public String getState() {
return state;
}

/**
* 
* @param state
* The state
*/
@JsonProperty("state")
public void setState(String state) {
this.state = state;
}

/**
* 
* @return
* The zip
*/
@JsonProperty("zip")
public String getZip() {
return zip;
}

/**
* 
* @param zip
* The zip
*/
@JsonProperty("zip")
public void setZip(String zip) {
this.zip = zip;
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
