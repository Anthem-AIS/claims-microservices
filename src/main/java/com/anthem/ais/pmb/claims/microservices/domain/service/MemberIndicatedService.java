package com.anthem.ais.pmb.claims.microservices.domain.service;

import java.util.List;

import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicated;
import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicatedPK;
import com.anthem.ais.pmb.claims.microservices.generic.service.GenericEntityService;

public interface MemberIndicatedService extends
		GenericEntityService<MemberIndicated, MemberIndicatedPK> {

	public MemberIndicated saveIndicated(MemberIndicated mi);
	public List<MemberIndicated> findByHcId(String hcid);
	public List<MemberIndicated> findByClaimId(String claimId);
}
