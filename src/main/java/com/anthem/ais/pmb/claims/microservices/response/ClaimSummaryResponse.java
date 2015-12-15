
package com.anthem.ais.pmb.claims.microservices.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "claimSummary"
})
public class ClaimSummaryResponse {

    @JsonProperty("claimSummary")
    private List<ClaimSummary> claimSummary = new ArrayList<ClaimSummary>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The claimSummary
     */
    @JsonProperty("claimSummary")
    public List<ClaimSummary> getClaimSummary() {
        return claimSummary;
    }

    /**
     * 
     * @param claimSummary
     *     The claimSummary
     */
    @JsonProperty("claimSummary")
    public void setClaimSummary(List<ClaimSummary> claimSummary) {
        this.claimSummary = claimSummary;
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
