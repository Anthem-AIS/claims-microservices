package com.anthem.ais.pmb.claims.microservices.domain.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPayment;
import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPaymentPK;
import com.anthem.ais.pmb.claims.microservices.generic.dao.GenericPMBDAOImpl;

public class ClaimsPaymentsDAOImpl extends
		GenericPMBDAOImpl<ClaimsPayment, ClaimsPaymentPK> implements
		ClaimsPaymentsDAO {

	public List<ClaimsPayment> findByHcId(String hcid){
		
		Session session = getSession();
		List<ClaimsPayment> ids = new ArrayList<>();
		try {
			Query query = session.createQuery("From ClaimsPayment cp where cp.hcid=:hcid");
			query.setString("hcid", hcid);
			ids = query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return ids;
		
	}
	
	public List<ClaimsPayment> findByClaimId(String claimId){
		
		Session session = getSession();
		List<ClaimsPayment> ids = new ArrayList<>();
		try {
			Query query = session.createQuery("From ClaimsPayment cp where cp.id.claimId=:claimId");
			query.setString("claimId", claimId);
			ids = query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return ids;
		
	}
}