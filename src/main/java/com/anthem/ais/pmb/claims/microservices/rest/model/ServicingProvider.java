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
"professionalNm",
"organizationNm"
})
public class ServicingProvider {

@JsonProperty("professionalNm")
private String professionalNm;
@JsonProperty("organizationNm")
private String organizationNm;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The professionalNm
*/
@JsonProperty("professionalNm")
public String getProfessionalNm() {
return professionalNm;
}

/**
* 
* @param professionalNm
* The professionalNm
*/
@JsonProperty("professionalNm")
public void setProfessionalNm(String professionalNm) {
this.professionalNm = professionalNm;
}

/**
* 
* @return
* The organizationNm
*/
@JsonProperty("organizationNm")
public String getOrganizationNm() {
return organizationNm;
}

/**
* 
* @param organizationNm
* The organizationNm
*/
@JsonProperty("organizationNm")
public void setOrganizationNm(String organizationNm) {
this.organizationNm = organizationNm;
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
