package com.anthem.ais.pmb.claims.microservices.domain.service;

import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicated;
import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicatedPK;
import com.anthem.ais.pmb.claims.microservices.generic.service.GenericEntityService;

public interface MemberIndicatedService extends
		GenericEntityService<MemberIndicated, MemberIndicatedPK> {

	public MemberIndicated saveIndicated(MemberIndicated mi);
}
