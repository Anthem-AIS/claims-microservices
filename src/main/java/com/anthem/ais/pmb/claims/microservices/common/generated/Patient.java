
package com.anthem.ais.pmb.claims.microservices.common.generated;

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

@JsonPropertyOrder({
    "mbrUid",
    "hcId",
    "firstNm",
    "lastNm",
    "dob"
})
public class Patient {

    @JsonProperty("mbrUid")
    private String mbrUid;
    @JsonProperty("hcId")
    private String hcId;
    @JsonProperty("firstNm")
    private String firstNm;
    @JsonProperty("lastNm")
    private String lastNm;
    @JsonProperty("dob")
    private String birthDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The mbrUid
     */
    @JsonProperty("mbrUid")
    public String getMbrUid() {
        return mbrUid;
    }

    /**
     * 
     * @param mbrUid
     *     The mbrUid
     */
    @JsonProperty("mbrUid")
    public void setMbrUid(String mbrUid) {
        this.mbrUid = mbrUid;
    }

    /**
     * 
     * @return
     *     The hcId
     */
    @JsonProperty("hcId")
    public String getHcId() {
        return hcId;
    }

    /**
     * 
     * @param hcId
     *     The hcId
     */
    @JsonProperty("hcId")
    public void setHcId(String hcId) {
        this.hcId = hcId;
    }

    /**
     * 
     * @return
     *     The firstNm
     */
    @JsonProperty("firstNm")
    public String getFirstNm() {
        return firstNm;
    }

    /**
     * 
     * @param firstNm
     *     The firstNm
     */
    @JsonProperty("firstNm")
    public void setFirstNm(String firstNm) {
        this.firstNm = firstNm;
    }

    /**
     * 
     * @return
     *     The lastNm
     */
    @JsonProperty("lastNm")
    public String getLastNm() {
        return lastNm;
    }

    /**
     * 
     * @param lastNm
     *     The lastNm
     */
    @JsonProperty("lastNm")
    public void setLastNm(String lastNm) {
        this.lastNm = lastNm;
    }

    /**
     * 
     * @return
     *     The birthDate
     */
    @JsonProperty("dob")
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * 
     * @param birthDate
     *     The birthDate
     */
    @JsonProperty("dob")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
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
