
package com.anthem.ais.pmb.claims.microservices.common.generated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
	"metadata",
    "page",
    "claims"
})

public class ClaimsSummary {

	
	@JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("page")
    private Page page;
    @JsonProperty("claims")
    private List<Claim> claims = new ArrayList<Claim>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    /**
     * 
     * @return
     *     The page
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param page
     *     The page
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
    
    /**
     * 
     * @return
     *     The page
     */
    @JsonProperty("page")
    public Page getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    @JsonProperty("page")
    public void setPage(Page page) {
        this.page = page;
    }

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
