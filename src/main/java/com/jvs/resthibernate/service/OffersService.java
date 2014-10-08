package com.jvs.resthibernate.service;

import java.util.List;

import com.jvs.resthibernate.entity.Offer;

public interface OffersService {

	public List<Offer> getAllOffers();
	
	public Offer getOffer(Long id);

	public void createOffer(Offer offer);
	
	public void updateOffer(Offer offer);

	public void deleteOffer(Long id);
	
}
