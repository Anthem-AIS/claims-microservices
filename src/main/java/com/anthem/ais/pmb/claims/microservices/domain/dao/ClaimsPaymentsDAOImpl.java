package com.anthem.ais.pmb.claims.microservices.domain.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPayment;
import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPaymentPK;
import com.anthem.ais.pmb.claims.microservices.domain.entity.HcidSequenceNumber2Uuid;
import com.anthem.ais.pmb.claims.microservices.generic.dao.GenericPMBDAOImpl;

public class ClaimsPaymentsDAOImpl extends
		GenericPMBDAOImpl<ClaimsPayment, ClaimsPaymentPK> implements
		ClaimsPaymentsDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<HcidSequenceNumber2Uuid> getHcidByUuid(String uuid) {
		Session session = getSession();
		List<HcidSequenceNumber2Uuid> ids = new ArrayList<HcidSequenceNumber2Uuid>();
		try {
			Query query = session.createQuery("From HcidSequenceNumber2Uuid hc where hc.uuid=:uuid");
			query.setString("uuid", uuid);
			ids = query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return ids;
	}
}