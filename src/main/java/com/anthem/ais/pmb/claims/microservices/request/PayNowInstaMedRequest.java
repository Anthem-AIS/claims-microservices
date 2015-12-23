
package com.anthem.ais.pmb.claims.microservices.request;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "claimNumber",
    "claimReferenceNumber",
    "serviceStartDate",
    "serviceEndDate",
    "amountDue",
    "userID",
    "userEmail",
    "patientFirstName",
    "patientLastName",
    "patientID",
    "providerBillingTIN",
    "facilityName",
    "facilityAddress1",
    "facilityAddress2",
    "facilityAddressCity",
    "facilityAddressState",
    "facilityAddressZip",
    "paytoproviderAddress1",
    "paytoproviderAddress2",
    "paytoproviderCity",
    "paytoproviderState",
    "paytoproviderZip",
    "renderingProviderName",
    "payToProviderName",
    "providerPhoneNumber",
    "accountID",
    "securityKey",
    "ssoAlias",
    "templateID"
})
public class PayNowInstaMedRequest {

    @JsonProperty("claimNumber")
    private String claimNumber;
    @JsonProperty("claimReferenceNumber")
    private String claimReferenceNumber;
    @JsonProperty("serviceStartDate")
    private String serviceStartDate;
    @JsonProperty("serviceEndDate")
    private String serviceEndDate;
    @JsonProperty("amountDue")
    private String amountDue;
    @JsonProperty("userID")
    private String userID;
    @JsonProperty("userEmail")
    private String userEmail;
    @JsonProperty("patientFirstName")
    private String patientFirstName;
    @JsonProperty("patientLastName")
    private String patientLastName;
    @JsonProperty("patientID")
    private String patientID;
    @JsonProperty("providerBillingTIN")
    private String providerBillingTIN;
    @JsonProperty("facilityName")
    private String facilityName;
    @JsonProperty("facilityAddress1")
    private String facilityAddress1;
    @JsonProperty("facilityAddress2")
    private String facilityAddress2;
    @JsonProperty("facilityAddressCity")
    private String facilityAddressCity;
    @JsonProperty("facilityAddressState")
    private String facilityAddressState;
    @JsonProperty("facilityAddressZip")
    private String facilityAddressZip;
    @JsonProperty("paytoproviderAddress1")
    private String paytoproviderAddress1;
    @JsonProperty("paytoproviderAddress2")
    private String paytoproviderAddress2;
    @JsonProperty("paytoproviderCity")
    private String paytoproviderCity;
    @JsonProperty("paytoproviderState")
    private String paytoproviderState;
    @JsonProperty("paytoproviderZip")
    private String paytoproviderZip;
    @JsonProperty("renderingProviderName")
    private String renderingProviderName;
    @JsonProperty("payToProviderName")
    private String payToProviderName;
    @JsonProperty("providerPhoneNumber")
    private String providerPhoneNumber;
    @JsonProperty("accountID")
    private String accountID;
    @JsonProperty("securityKey")
    private String securityKey;
    @JsonProperty("ssoAlias")
    private String ssoAlias;
    @JsonProperty("templateID")
    private String templateID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The claimNumber
     */
    @JsonProperty("claimNumber")
    public String getClaimNumber() {
        return claimNumber;
    }

    /**
     * 
     * @param claimNumber
     *     The claimNumber
     */
    @JsonProperty("claimNumber")
    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    /**
     * 
     * @return
     *     The claimReferenceNumber
     */
    @JsonProperty("claimReferenceNumber")
    public String getClaimReferenceNumber() {
        return claimReferenceNumber;
    }

    /**
     * 
     * @param claimReferenceNumber
     *     The claimReferenceNumber
     */
    @JsonProperty("claimReferenceNumber")
    public void setClaimReferenceNumber(String claimReferenceNumber) {
        this.claimReferenceNumber = claimReferenceNumber;
    }

    /**
     * 
     * @return
     *     The serviceStartDate
     */
    @JsonProperty("serviceStartDate")
    public String getServiceStartDate() {
        return serviceStartDate;
    }

    /**
     * 
     * @param serviceStartDate
     *     The serviceStartDate
     */
    @JsonProperty("serviceStartDate")
    public void setServiceStartDate(String serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    /**
     * 
     * @return
     *     The serviceEndDate
     */
    @JsonProperty("serviceEndDate")
    public String getServiceEndDate() {
        return serviceEndDate;
    }

    /**
     * 
     * @param serviceEndDate
     *     The serviceEndDate
     */
    @JsonProperty("serviceEndDate")
    public void setServiceEndDate(String serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }

    /**
     * 
     * @return
     *     The amountDue
     */
    @JsonProperty("amountDue")
    public String getAmountDue() {
        return amountDue;
    }

    /**
     * 
     * @param amountDue
     *     The amountDue
     */
    @JsonProperty("amountDue")
    public void setAmountDue(String amountDue) {
        this.amountDue = amountDue;
    }

    /**
     * 
     * @return
     *     The userID
     */
    @JsonProperty("userID")
    public String getUserID() {
        return userID;
    }

    /**
     * 
     * @param userID
     *     The userID
     */
    @JsonProperty("userID")
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * 
     * @return
     *     The userEmail
     */
    @JsonProperty("userEmail")
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 
     * @param userEmail
     *     The userEmail
     */
    @JsonProperty("userEmail")
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 
     * @return
     *     The patientFirstName
     */
    @JsonProperty("patientFirstName")
    public String getPatientFirstName() {
        return patientFirstName;
    }

    /**
     * 
     * @param patientFirstName
     *     The patientFirstName
     */
    @JsonProperty("patientFirstName")
    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    /**
     * 
     * @return
     *     The patientLastName
     */
    @JsonProperty("patientLastName")
    public String getPatientLastName() {
        return patientLastName;
    }

    /**
     * 
     * @param patientLastName
     *     The patientLastName
     */
    @JsonProperty("patientLastName")
    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    /**
     * 
     * @return
     *     The patientID
     */
    @JsonProperty("patientID")
    public String getPatientID() {
        return patientID;
    }

    /**
     * 
     * @param patientID
     *     The patientID
     */
    @JsonProperty("patientID")
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    /**
     * 
     * @return
     *     The providerBillingTIN
     */
    @JsonProperty("providerBillingTIN")
    public String getProviderBillingTIN() {
        return providerBillingTIN;
    }

    /**
     * 
     * @param providerBillingTIN
     *     The providerBillingTIN
     */
    @JsonProperty("providerBillingTIN")
    public void setProviderBillingTIN(String providerBillingTIN) {
        this.providerBillingTIN = providerBillingTIN;
    }

    /**
     * 
     * @return
     *     The facilityName
     */
    @JsonProperty("facilityName")
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * 
     * @param facilityName
     *     The facilityName
     */
    @JsonProperty("facilityName")
    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    /**
     * 
     * @return
     *     The facilityAddress1
     */
    @JsonProperty("facilityAddress1")
    public String getFacilityAddress1() {
        return facilityAddress1;
    }

    /**
     * 
     * @param facilityAddress1
     *     The facilityAddress1
     */
    @JsonProperty("facilityAddress1")
    public void setFacilityAddress1(String facilityAddress1) {
        this.facilityAddress1 = facilityAddress1;
    }

    /**
     * 
     * @return
     *     The facilityAddress2
     */
    @JsonProperty("facilityAddress2")
    public String getFacilityAddress2() {
        return facilityAddress2;
    }

    /**
     * 
     * @param facilityAddress2
     *     The facilityAddress2
     */
    @JsonProperty("facilityAddress2")
    public void setFacilityAddress2(String facilityAddress2) {
        this.facilityAddress2 = facilityAddress2;
    }

    /**
     * 
     * @return
     *     The facilityAddressCity
     */
    @JsonProperty("facilityAddressCity")
    public String getFacilityAddressCity() {
        return facilityAddressCity;
    }

    /**
     * 
     * @param facilityAddressCity
     *     The facilityAddressCity
     */
    @JsonProperty("facilityAddressCity")
    public void setFacilityAddressCity(String facilityAddressCity) {
        this.facilityAddressCity = facilityAddressCity;
    }

    /**
     * 
     * @return
     *     The facilityAddressState
     */
    @JsonProperty("facilityAddressState")
    public String getFacilityAddressState() {
        return facilityAddressState;
    }

    /**
     * 
     * @param facilityAddressState
     *     The facilityAddressState
     */
    @JsonProperty("facilityAddressState")
    public void setFacilityAddressState(String facilityAddressState) {
        this.facilityAddressState = facilityAddressState;
    }

    /**
     * 
     * @return
     *     The facilityAddressZip
     */
    @JsonProperty("facilityAddressZip")
    public String getFacilityAddressZip() {
        return facilityAddressZip;
    }

    /**
     * 
     * @param facilityAddressZip
     *     The facilityAddressZip
     */
    @JsonProperty("facilityAddressZip")
    public void setFacilityAddressZip(String facilityAddressZip) {
        this.facilityAddressZip = facilityAddressZip;
    }

    /**
     * 
     * @return
     *     The paytoproviderAddress1
     */
    @JsonProperty("paytoproviderAddress1")
    public String getPaytoproviderAddress1() {
        return paytoproviderAddress1;
    }

    /**
     * 
     * @param paytoproviderAddress1
     *     The paytoproviderAddress1
     */
    @JsonProperty("paytoproviderAddress1")
    public void setPaytoproviderAddress1(String paytoproviderAddress1) {
        this.paytoproviderAddress1 = paytoproviderAddress1;
    }

    /**
     * 
     * @return
     *     The paytoproviderAddress2
     */
    @JsonProperty("paytoproviderAddress2")
    public String getPaytoproviderAddress2() {
        return paytoproviderAddress2;
    }

    /**
     * 
     * @param paytoproviderAddress2
     *     The paytoproviderAddress2
     */
    @JsonProperty("paytoproviderAddress2")
    public void setPaytoproviderAddress2(String paytoproviderAddress2) {
        this.paytoproviderAddress2 = paytoproviderAddress2;
    }

    /**
     * 
     * @return
     *     The paytoproviderCity
     */
    @JsonProperty("paytoproviderCity")
    public String getPaytoproviderCity() {
        return paytoproviderCity;
    }

    /**
     * 
     * @param paytoproviderCity
     *     The paytoproviderCity
     */
    @JsonProperty("paytoproviderCity")
    public void setPaytoproviderCity(String paytoproviderCity) {
        this.paytoproviderCity = paytoproviderCity;
    }

    /**
     * 
     * @return
     *     The paytoproviderState
     */
    @JsonProperty("paytoproviderState")
    public String getPaytoproviderState() {
        return paytoproviderState;
    }

    /**
     * 
     * @param paytoproviderState
     *     The paytoproviderState
     */
    @JsonProperty("paytoproviderState")
    public void setPaytoproviderState(String paytoproviderState) {
        this.paytoproviderState = paytoproviderState;
    }

    /**
     * 
     * @return
     *     The paytoproviderZip
     */
    @JsonProperty("paytoproviderZip")
    public String getPaytoproviderZip() {
        return paytoproviderZip;
    }

    /**
     * 
     * @param paytoproviderZip
     *     The paytoproviderZip
     */
    @JsonProperty("paytoproviderZip")
    public void setPaytoproviderZip(String paytoproviderZip) {
        this.paytoproviderZip = paytoproviderZip;
    }

    /**
     * 
     * @return
     *     The renderingProviderName
     */
    @JsonProperty("renderingProviderName")
    public String getRenderingProviderName() {
        return renderingProviderName;
    }

    /**
     * 
     * @param renderingProviderName
     *     The renderingProviderName
     */
    @JsonProperty("renderingProviderName")
    public void setRenderingProviderName(String renderingProviderName) {
        this.renderingProviderName = renderingProviderName;
    }

    /**
     * 
     * @return
     *     The payToProviderName
     */
    @JsonProperty("payToProviderName")
    public String getPayToProviderName() {
        return payToProviderName;
    }

    /**
     * 
     * @param payToProviderName
     *     The payToProviderName
     */
    @JsonProperty("payToProviderName")
    public void setPayToProviderName(String payToProviderName) {
        this.payToProviderName = payToProviderName;
    }

    /**
     * 
     * @return
     *     The providerPhoneNumber
     */
    @JsonProperty("providerPhoneNumber")
    public String getProviderPhoneNumber() {
        return providerPhoneNumber;
    }

    /**
     * 
     * @param providerPhoneNumber
     *     The providerPhoneNumber
     */
    @JsonProperty("providerPhoneNumber")
    public void setProviderPhoneNumber(String providerPhoneNumber) {
        this.providerPhoneNumber = providerPhoneNumber;
    }

    /**
     * 
     * @return
     *     The accountID
     */
    @JsonProperty("accountID")
    public String getAccountID() {
        return accountID;
    }

    /**
     * 
     * @param accountID
     *     The accountID
     */
    @JsonProperty("accountID")
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    /**
     * 
     * @return
     *     The securityKey
     */
    @JsonProperty("securityKey")
    public String getSecurityKey() {
        return securityKey;
    }

    /**
     * 
     * @param securityKey
     *     The securityKey
     */
    @JsonProperty("securityKey")
    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }

    /**
     * 
     * @return
     *     The ssoAlias
     */
    @JsonProperty("ssoAlias")
    public String getSsoAlias() {
        return ssoAlias;
    }

    /**
     * 
     * @param ssoAlias
     *     The ssoAlias
     */
    @JsonProperty("ssoAlias")
    public void setSsoAlias(String ssoAlias) {
        this.ssoAlias = ssoAlias;
    }

    /**
     * 
     * @return
     *     The templateID
     */
    @JsonProperty("templateID")
    public String getTemplateID() {
        return templateID;
    }

    /**
     * 
     * @param templateID
     *     The templateID
     */
    @JsonProperty("templateID")
    public void setTemplateID(String templateID) {
        this.templateID = templateID;
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
