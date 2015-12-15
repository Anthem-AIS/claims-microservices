
package com.anthem.ais.pmb.claims.microservices.rest.model.resp;

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
    "name",
    "providerName",
    "dateOfService",
    "address"
})
public class FacilityDetails {

    @JsonProperty("name")
    private String name;
    @JsonProperty("providerName")
    private String providerName;
    @JsonProperty("dateOfService")
    private String dateOfService;
    @JsonProperty("address")
    private Address address;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The providerName
     */
    @JsonProperty("providerName")
    public String getProviderName() {
        return providerName;
    }

    /**
     * 
     * @param providerName
     *     The providerName
     */
    @JsonProperty("providerName")
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * 
     * @return
     *     The dateOfService
     */
    @JsonProperty("dateOfService")
    public String getDateOfService() {
        return dateOfService;
    }

    /**
     * 
     * @param dateOfService
     *     The dateOfService
     */
    @JsonProperty("dateOfService")
    public void setDateOfService(String dateOfService) {
        this.dateOfService = dateOfService;
    }

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
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
