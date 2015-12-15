
package com.anthem.ais.pmb.claims.microservices.response;

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
    "claimAmount",
    "facilityDetails",
    "providerName",
    "dateOfService"
})
public class ClaimSummary {

    @JsonProperty("claimId")
    private String claimId;
    @JsonProperty("claimAmount")
    private String claimAmount;
    @JsonProperty("facilityDetails")
    private FacilityDetails facilityDetails;
    @JsonProperty("providerName")
    private String providerName;
    @JsonProperty("dateOfService")
    private String dateOfService;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The claimId
     */
    @JsonProperty("claimId")
    public String getClaimId() {
        return claimId;
    }

    /**
     * 
     * @param claimId
     *     The claimId
     */
    @JsonProperty("claimId")
    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    /**
     * 
     * @return
     *     The claimAmount
     */
    @JsonProperty("claimAmount")
    public String getClaimAmount() {
        return claimAmount;
    }

    /**
     * 
     * @param claimAmount
     *     The claimAmount
     */
    @JsonProperty("claimAmount")
    public void setClaimAmount(String claimAmount) {
        this.claimAmount = claimAmount;
    }

    /**
     * 
     * @return
     *     The facilityDetails
     */
    @JsonProperty("facilityDetails")
    public FacilityDetails getFacilityDetails() {
        return facilityDetails;
    }

    /**
     * 
     * @param facilityDetails
     *     The facilityDetails
     */
    @JsonProperty("facilityDetails")
    public void setFacilityDetails(FacilityDetails facilityDetails) {
        this.facilityDetails = facilityDetails;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
