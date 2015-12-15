package com.anthem.ais.pmb.claims.microservices.domain.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.anthem.ais.pmb.claims.microservices.domain.entity.HcidSequenceNumber2Uuid;
import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicated;
import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicatedPK;
import com.anthem.ais.pmb.claims.microservices.generic.dao.GenericPMBDAOImpl;

public class MemberIndicatedDAOImpl extends
		GenericPMBDAOImpl<MemberIndicated, MemberIndicatedPK> implements
		MemberIndicatedDAO {
	
	public List<MemberIndicated> findByHcId(String hcid){
		Session session = getSession();
		List<MemberIndicated> ids = new ArrayList<>();
		try {
			Query query = session.createQuery("From MemberIndicated md where hc.hcid=:hcid");
			query.setString("hcid", hcid);
			ids = query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return ids;
	}

}
