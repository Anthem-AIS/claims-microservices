package com.anthem.ais.pmb.claims.microservices.common.generated;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class Diagnoses {

	@JsonProperty("diagnosisCd")
	private List<DiagnosisCd> diagnosisCd = new ArrayList<DiagnosisCd>();

	/**
	 * @return the diagnosisCd
	 */
	public List<DiagnosisCd> getDiagnosisCd() {
		return diagnosisCd;
	}

	/**
	 * @param diagnosisCd the diagnosisCd to set
	 */
	public void setDiagnosisCd(List<DiagnosisCd> diagnosisCd) {
		this.diagnosisCd = diagnosisCd;
	}
	
}
