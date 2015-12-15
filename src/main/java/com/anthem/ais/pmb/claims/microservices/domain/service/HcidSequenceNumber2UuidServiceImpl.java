package com.anthem.ais.pmb.claims.microservices.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.anthem.ais.pmb.claims.microservices.domain.dao.HcidSequenceNumber2UuidDAO;
import com.anthem.ais.pmb.claims.microservices.domain.entity.HcidSequenceNumber2Uuid;
import com.anthem.ais.pmb.claims.microservices.generic.service.GenericEntityServiceImpl;

public class HcidSequenceNumber2UuidServiceImpl extends
		GenericEntityServiceImpl<HcidSequenceNumber2Uuid, String> implements
		HcidSequenceNumber2UuidService {

	@Autowired
	private HcidSequenceNumber2UuidDAO hcidSequenceNumber2UuidDAO;

	public HcidSequenceNumber2UuidDAO getHcidSequenceNumber2UuidDAO() {
		return hcidSequenceNumber2UuidDAO;
	}

	public void setHcidSequenceNumber2UuidDAO(
			HcidSequenceNumber2UuidDAO hcidSequenceNumber2UuidDAO) {
		this.hcidSequenceNumber2UuidDAO = hcidSequenceNumber2UuidDAO;
	}

	@Override
	public HcidSequenceNumber2UuidDAO getEntityDao() {

		return getHcidSequenceNumber2UuidDAO();
	}

	@Transactional
	public HcidSequenceNumber2Uuid savehcId(HcidSequenceNumber2Uuid cp) {
		return getHcidSequenceNumber2UuidDAO().saveOrUpdate(cp);
	}
}
