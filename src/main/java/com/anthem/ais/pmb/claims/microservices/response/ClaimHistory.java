
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
    "amountPaid",
    "claimType",
    "paymentDate",
    "facilityDetails",
    "providerName",
    "dateOfService"
})
public class ClaimHistory {

    @JsonProperty("claimId")
    private String claimId;
    @JsonProperty("isOffline")
    private boolean offline;
    @JsonProperty("amountPaid")
    private String amountPaid;
    @JsonProperty("claimType")
    private String claimType;
    @JsonProperty("paymentDate")
    private String paymentDate;
    @JsonProperty("facilityDetails")
    private FacilityDetails facilityDetails;
    @JsonProperty("providerName")
    private String providerName;
    @JsonProperty("dateOfService")
    private String dateOfService;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getDateOfService() {
		return dateOfService;
	}

	public void setDateOfService(String dateOfService) {
		this.dateOfService = dateOfService;
	}

	public boolean isOffline() {
		return offline;
	}

	public void setOffline(boolean offline) {
		this.offline = offline;
	}

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
     *     The amountPaid
     */
    @JsonProperty("amountPaid")
    public String getAmountPaid() {
        return amountPaid;
    }

    /**
     * 
     * @param amountPaid
     *     The amountPaid
     */
    @JsonProperty("amountPaid")
    public void setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }

    /**
     * 
     * @return
     *     The claimType
     */
    @JsonProperty("claimType")
    public String getClaimType() {
        return claimType;
    }

    /**
     * 
     * @param claimType
     *     The claimType
     */
    @JsonProperty("claimType")
    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    /**
     * 
     * @return
     *     The paymentDate
     */
    @JsonProperty("paymentDate")
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * 
     * @param paymentDate
     *     The paymentDate
     */
    @JsonProperty("paymentDate")
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
