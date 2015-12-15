package com.anthem.ais.pmb.claims.microservices.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the HCID_2_TOKEN database table.
 * 
 */
@Entity
@Table(name="HCID_2_TOKEN", schema = "AIS")
public class Hcid2Token implements Serializable {
	private static final long serialVersionUID = 1L;
	private String token;
	private String additionalData;
	private String hcid;
	private Timestamp lastAccessed;
	private String password;
	private String username;

	public Hcid2Token() {
	}


	@Id
	@Column(name="\"TOKEN\"")
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}


	@Column(name="ADDITIONAL_DATA")
	public String getAdditionalData() {
		return this.additionalData;
	}

	public void setAdditionalData(String additionalData) {
		this.additionalData = additionalData;
	}


	public String getHcid() {
		return this.hcid;
	}

	public void setHcid(String hcid) {
		this.hcid = hcid;
	}


	@Column(name="LAST_ACCESSED")
	public Timestamp getLastAccessed() {
		return this.lastAccessed;
	}

	public void setLastAccessed(Timestamp lastAccessed) {
		this.lastAccessed = lastAccessed;
	}


	@Column(name="\"PASSWORD\"")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}