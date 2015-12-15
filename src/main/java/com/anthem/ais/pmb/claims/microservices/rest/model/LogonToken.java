package com.anthem.ais.pmb.claims.microservices.rest.model;

import java.io.Serializable;

public class LogonToken implements Serializable{

	private static final long serialVersionUID = -3858379196463550353L;
	
	private String LogonToken = null;
	private boolean saved = false;

	public boolean isSaved() {
		return saved;
	}

	public void setSaved(boolean saved) {
		this.saved = saved;
	}

	public String getLogonToken() {
		return LogonToken;
	}

	public void setLogonToken(String logonToken) {
		LogonToken = logonToken;
	}
	
	

}
