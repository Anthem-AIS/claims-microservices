package com.anthem.ais.pmb.claims.microservices.domain.service;

import com.anthem.ais.pmb.claims.microservices.domain.entity.Hcid2Token;
import com.anthem.ais.pmb.claims.microservices.generic.service.GenericEntityService;

public interface Hcid2TokenService extends GenericEntityService<Hcid2Token, String>{

	public Hcid2Token saveOrUpdate(Hcid2Token t);
}
