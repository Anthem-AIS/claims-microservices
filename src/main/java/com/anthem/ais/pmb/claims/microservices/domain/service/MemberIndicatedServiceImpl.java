package com.anthem.ais.pmb.claims.microservices.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.anthem.ais.pmb.claims.microservices.domain.dao.MemberIndicatedDAO;
import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicated;
import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicatedPK;
import com.anthem.ais.pmb.claims.microservices.generic.dao.GenericPMBDAO;
import com.anthem.ais.pmb.claims.microservices.generic.service.GenericEntityServiceImpl;

public class MemberIndicatedServiceImpl extends
		GenericEntityServiceImpl<MemberIndicated, MemberIndicatedPK> implements
		MemberIndicatedService {
	
	@Autowired
	private MemberIndicatedDAO memberIndicatedDAO;
	
	public MemberIndicatedDAO getMemberIndicatedDAO() {
		return memberIndicatedDAO;
	}

	public void setMemberIndicatedDAO(MemberIndicatedDAO memberIndicatedDAO) {
		this.memberIndicatedDAO = memberIndicatedDAO;
	}

	@Override
	public GenericPMBDAO<MemberIndicated, MemberIndicatedPK> getEntityDao() {
		return getMemberIndicatedDAO();
	}
	
	@Override
	@Transactional
	public MemberIndicated saveIndicated(MemberIndicated mi) {
		return getMemberIndicatedDAO().saveOrUpdate(mi);
	}
	
	@Override
	@Transactional
	public List<MemberIndicated> findByHcId(String hcid){
		return getMemberIndicatedDAO().findByHcId(hcid);
	}
	
	@Override
	@Transactional
	public List<MemberIndicated> findByClaimId(String claimId){
		return getMemberIndicatedDAO().findByHcId(claimId);
	}
	
}
