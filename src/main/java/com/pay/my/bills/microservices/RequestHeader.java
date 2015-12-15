package com.pay.my.bills.microservices;



import com.fasterxml.jackson.annotation.JsonProperty;


public class RequestHeader  {
  
  private String userName = null;
  private String password = null;

  
  /**
   **/
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHeader {\n");
    
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
