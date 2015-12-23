
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
    "claimHistory"
})
public class ClaimHistoryResponse {

    @JsonProperty("claimHistory")
    private List<ClaimHistory> claimHistory = new ArrayList<ClaimHistory>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The claimHistory
     */
    @JsonProperty("claimHistory")
    public List<ClaimHistory> getClaimHistory() {
        return claimHistory;
    }

    /**
     * 
     * @param claimHistory
     *     The claimHistory
     */
    @JsonProperty("claimHistory")
    public void setClaimHistory(List<ClaimHistory> claimHistory) {
        this.claimHistory = claimHistory;
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
