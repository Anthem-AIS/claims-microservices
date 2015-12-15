
package com.anthem.ais.pmb.claims.microservices.common.generated;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "clmId",
    "clmClassCd",
    "clmTypeCd",
    "clmStatusCd",
    "clmSensitiveInd",
    "clmStartDt",
    "clmEndDt",
    "patient",
    "amount",
    "servicingProvider",
    "eob",
    "serviceLines"
})
 
public class Claim {

    @JsonProperty("clmId")
    private String clmId;
    @JsonProperty("clmClassCd")
    private ClmClassCd clmClassCd;
    @JsonProperty("clmTypeCd")
    private ClmTypeCd clmTypeCd;
    @JsonProperty("clmStatusCd")
    private ClmStatusCd clmStatusCd;
    @JsonProperty("clmStartDt")
    private String clmStartDt;
    @JsonProperty("clmEndDt")
    private String clmEndDt;
    @JsonProperty("patient")
    private Patient patient;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("servicingProvider")
    private ServicingProvider servicingProvider;
    @JsonProperty("clmSensitiveInd")
    private String sensitiveClaim;
    @JsonProperty("eob")
    private Eob eob;
    
    @JsonProperty("serviceLines")
    private List<ServiceLines> serviceLines;
    
    @JsonProperty("networkId")
    private String networkId;
    
    @JsonProperty("eob")
	public Eob getEob() {
		return eob;
	}

	 @JsonProperty("eob")
	public void setEob(Eob eob) {
		this.eob = eob;
	}

	@JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The clmId
     */
    @JsonProperty("clmId")
    public String getClmId() {
        return clmId;
    }

    /**
     * 
     * @param clmId
     *     The clmId
     */
    @JsonProperty("clmId")
    public void setClmId(String clmId) {
        this.clmId = clmId;
    }

    /**
     * 
     * @return
     *     The clmClassCd
     */
    @JsonProperty("clmClassCd")
    public ClmClassCd getClmClassCd() {
        return clmClassCd;
    }

    /**
     * 
     * @param clmClassCd
     *     The clmClassCd
     */
    @JsonProperty("clmClassCd")
    public void setClmClassCd(ClmClassCd clmClassCd) {
        this.clmClassCd = clmClassCd;
    }

    /**
     * 
     * @return
     *     The clmTypeCd
     */
    @JsonProperty("clmTypeCd")
    public ClmTypeCd getClmTypeCd() {
        return clmTypeCd;
    }

    /**
     * 
     * @param clmTypeCd
     *     The clmTypeCd
     */
    @JsonProperty("clmTypeCd")
    public void setClmTypeCd(ClmTypeCd clmTypeCd) {
        this.clmTypeCd = clmTypeCd;
    }

    /**
     * 
     * @return
     *     The clmStatusCd
     */
    @JsonProperty("clmStatusCd")
    public ClmStatusCd getClmStatusCd() {
        return clmStatusCd;
    }

    /**
     * 
     * @param clmStatusCd
     *     The clmStatusCd
     */
    @JsonProperty("clmStatusCd")
    public void setClmStatusCd(ClmStatusCd clmStatusCd) {
        this.clmStatusCd = clmStatusCd;
    }

    /**
     * 
     * @return
     *     The clmStartDt
     */
    @JsonProperty("clmStartDt")
    public String getClmStartDt() {
        return clmStartDt;
    }

    /**
     * 
     * @param clmStartDt
     *     The clmStartDt
     */
    @JsonProperty("clmStartDt")
    public void setClmStartDt(String clmStartDt) {
        this.clmStartDt = clmStartDt;
    }

    /**
     * 
     * @return
     *     The clmEndDt
     */
    @JsonProperty("clmEndDt")
    public String getClmEndDt() {
        return clmEndDt;
    }

    /**
     * 
     * @param clmEndDt
     *     The clmEndDt
     */
    @JsonProperty("clmEndDt")
    public void setClmEndDt(String clmEndDt) {
        this.clmEndDt = clmEndDt;
    }

    /**
     * 
     * @return
     *     The patient
     */
    @JsonProperty("patient")
    public Patient getPatient() {
        return patient;
    }

    /**
     * 
     * @param patient
     *     The patient
     */
    @JsonProperty("patient")
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * 
     * @return
     *     The amount
     */
    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The amount
     */
    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    /**
     * 
     * @return
     *     The servicingProvider
     */
    @JsonProperty("servicingProvider")
    public ServicingProvider getServicingProvider() {
        return servicingProvider;
    }

    /**
     * 
     * @param servicingProvider
     *     The servicingProvider
     */
    @JsonProperty("servicingProvider")
    public void setServicingProvider(ServicingProvider servicingProvider) {
        this.servicingProvider = servicingProvider;
    }
    /**
     * 
     * @return
     *     The sensitiveClaim
     */
    @JsonProperty("clmSensitiveInd")
    public String getSensitiveClaim() {
		return sensitiveClaim;
	}
    
    /**
     * 
     * @param sensitiveClaim
     *     The sensitiveClaim
     */
    @JsonProperty("clmSensitiveInd")
	public void setSensitiveClaim(String sensitiveClaim) {
		this.sensitiveClaim = sensitiveClaim;
	}

    /**
	 * @return the serviceLines
	 */
    @JsonProperty("serviceLines")
	public List<ServiceLines> getServiceLines() {
		return serviceLines;
	}

	/**
	 * @param serviceLines the serviceLines to set
	 */
    @JsonProperty("serviceLines")
	public void setServiceLines(List<ServiceLines> serviceLines) {
		this.serviceLines = serviceLines;
	}

    
	/**
	 * @return the networkId
	 */
    @JsonProperty("networkId")
	public String getNetworkId() {
		return networkId;
	}

	/**
	 * @param networkId the networkId to set
	 */
    @JsonProperty("networkId")
	public void setNetworkId(String networkId) {
		this.networkId = networkId;
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
