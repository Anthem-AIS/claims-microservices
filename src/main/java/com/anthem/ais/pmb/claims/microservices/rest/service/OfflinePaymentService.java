package com.anthem.ais.pmb.claims.microservices.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicated;
import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicatedPK;
import com.anthem.ais.pmb.claims.microservices.domain.service.MemberIndicatedService;
import com.anthem.ais.pmb.claims.microservices.rest.model.MembrIndcModel;
import com.anthem.ais.pmb.claims.microservices.util.PMBConstants;
import com.anthem.ais.pmb.claims.microservices.util.PMBDateUtil;
import com.anthem.ais.pmb.claims.microservices.util.RandomGUID;

@Component
public class OfflinePaymentService {

	@Autowired
	private MemberIndicatedService memberIndicatedService;

	@Transactional
	public String saveMemberIndicated(MembrIndcModel mim) {
		RandomGUID transactionGUID = new RandomGUID(true);
		String status = PMBConstants.EMPTY_SPACE;
		MemberIndicated mi = new MemberIndicated();
		MemberIndicatedPK pk = new MemberIndicatedPK();
		pk.setClaimId(mim.getClaimId());
		pk.setPaymentTransactionid(transactionGUID.getRandomGUID());
		mi.setId(pk);
		mi.setAmountPaid((long) Float.parseFloat(mim.getAmountPaid()));
		mi.setNotes(mim.getNotes());
		mi.setSequenceNumber(Long.parseLong(mim.getSequenceNumber()));
		mi.setTransactionDateTime(PMBDateUtil.getCurrentTimeStamp());
		mi.setHcid(mim.getHcId());
		mi = memberIndicatedService.saveIndicated(mi);
		if (mi != null) {
			status = PMBConstants.RESPONSE_SUCCESS;
		} else {
			status = PMBConstants.RESPONSE_ERROR;
		}
		return status;
	}
}
