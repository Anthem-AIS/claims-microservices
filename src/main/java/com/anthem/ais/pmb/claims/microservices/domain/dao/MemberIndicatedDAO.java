package com.anthem.ais.pmb.claims.microservices.domain.dao;

import java.util.List;

import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicated;
import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicatedPK;
import com.anthem.ais.pmb.claims.microservices.generic.dao.GenericPMBDAO;

public interface MemberIndicatedDAO extends GenericPMBDAO<MemberIndicated, MemberIndicatedPK>{

	public List<MemberIndicated> findByHcId(String hcid);

}
