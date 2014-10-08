package com.jvs.resthibernate.dao;

import org.springframework.stereotype.Repository;

import com.jvs.resthibernate.entity.Offer;

@Repository
public class OfferDaoImpl extends BaseDaoImpl<Offer, Long> implements OffersDao {

	public OfferDaoImpl() {
		super(Offer.class);
	}

}
