
package com.anthem.ais.pmb.claims.microservices.rest.model.resp;

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
    "claims"
})
public class ClaimHistoryResponse {

    @JsonProperty("claims")
    private List<Claim> claims = new ArrayList<Claim>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The claims
     */
    @JsonProperty("claims")
    public List<Claim> getClaims() {
        return claims;
    }

    /**
     * 
     * @param claims
     *     The claims
     */
    @JsonProperty("claims")
    public void setClaims(List<Claim> claims) {
        this.claims = claims;
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
