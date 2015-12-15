package com.pay.my.bills.microservices;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GetAccountSummaryDetailsRequest  {
  
  private RequestHeader requestHeader = null;
  public enum SourceSystemEnumEnum {
     ACES,  WGS,  FACETS,  QCARE,  CS_90,  NASCO,  STAR,  SEAMISYS,  SECORPMEMB,  ESI,  SR_FACETS,  MWMEDSYS,  GBDFACETS, 
  };
  private SourceSystemEnumEnum sourceSystemEnum = null;
  private String hcid = null;
  private String summaryNumber = null;
  private String linkRelationship = null;

  
  /**
   **/
  @JsonProperty("requestHeader")
  public RequestHeader getRequestHeader() {
    return requestHeader;
  }
  public void setRequestHeader(RequestHeader requestHeader) {
    this.requestHeader = requestHeader;
  }

  
  /**
   **/
  @JsonProperty("sourceSystemEnum")
  public SourceSystemEnumEnum getSourceSystemEnum() {
    return sourceSystemEnum;
  }
  public void setSourceSystemEnum(SourceSystemEnumEnum sourceSystemEnum) {
    this.sourceSystemEnum = sourceSystemEnum;
  }

  
  /**
   **/
  @JsonProperty("hcid")
  public String getHcid() {
    return hcid;
  }
  public void setHcid(String hcid) {
    this.hcid = hcid;
  }

  
  /**
   **/
  @JsonProperty("summaryNumber")
  public String getSummaryNumber() {
    return summaryNumber;
  }
  public void setSummaryNumber(String summaryNumber) {
    this.summaryNumber = summaryNumber;
  }

  
  /**
   **/
  @JsonProperty("linkRelationship")
  public String getLinkRelationship() {
    return linkRelationship;
  }
  public void setLinkRelationship(String linkRelationship) {
    this.linkRelationship = linkRelationship;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountSummaryDetailsRequest {\n");
    
    sb.append("  requestHeader: ").append(requestHeader).append("\n");
    sb.append("  sourceSystemEnum: ").append(sourceSystemEnum).append("\n");
    sb.append("  hcid: ").append(hcid).append("\n");
    sb.append("  summaryNumber: ").append(summaryNumber).append("\n");
    sb.append("  linkRelationship: ").append(linkRelationship).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
