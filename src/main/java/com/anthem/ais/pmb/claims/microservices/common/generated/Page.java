
package com.anthem.ais.pmb.claims.microservices.common.generated;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "size",
    "totalElements",
    "totalPages",
    "number",
    "nextPageKey"
})
public class Page {

    @JsonProperty("size")
    private Integer size;
    @JsonProperty("totalElements")
    private Integer totalElements;
    @JsonProperty("totalPages")
    private Integer totalPages;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("nextPageKey")
    private String nextPageKey;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The size
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The totalElements
     */
    @JsonProperty("totalElements")
    public Integer getTotalElements() {
        return totalElements;
    }

    /**
     * 
     * @param totalElements
     *     The totalElements
     */
    @JsonProperty("totalElements")
    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    /**
     * 
     * @return
     *     The totalPages
     */
    @JsonProperty("totalPages")
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * 
     * @param totalPages
     *     The totalPages
     */
    @JsonProperty("totalPages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * 
     * @return
     *     The number
     */
    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    /**
     * 
     * @param number
     *     The number
     */
    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 
     * @return
     *     The nextPageKey
     */
    @JsonProperty("nextPageKey")
    public String getNextPageKey() {
        return nextPageKey;
    }

    /**
     * 
     * @param nextPageKey
     *     The nextPageKey
     */
    @JsonProperty("nextPageKey")
    public void setNextPageKey(String nextPageKey) {
        this.nextPageKey = nextPageKey;
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
