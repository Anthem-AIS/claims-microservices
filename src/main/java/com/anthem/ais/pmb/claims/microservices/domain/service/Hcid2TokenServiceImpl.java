package com.anthem.ais.pmb.claims.microservices.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.anthem.ais.pmb.claims.microservices.domain.dao.Hcid2TokenDAO;
import com.anthem.ais.pmb.claims.microservices.domain.entity.Hcid2Token;
import com.anthem.ais.pmb.claims.microservices.generic.service.GenericEntityServiceImpl;

public class Hcid2TokenServiceImpl extends
		GenericEntityServiceImpl<Hcid2Token, String> implements
		Hcid2TokenService {
	
	@Autowired
	private Hcid2TokenDAO hcid2TokenDAO = null;
	


	public Hcid2TokenDAO getHcid2TokenDAO() {
		return hcid2TokenDAO;
	}

	public void setHcid2TokenDAO(Hcid2TokenDAO hcid2TokenDAO) {
		this.hcid2TokenDAO = hcid2TokenDAO;
	}



	@Override
	public Hcid2TokenDAO getEntityDao() {
		return getHcid2TokenDAO();
	}

	@Override
    @Transactional
    public Hcid2Token saveOrUpdate(Hcid2Token t) {
       return getEntityDao().saveOrUpdate(t);
    }
}
