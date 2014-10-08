package com.jvs.resthibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jvs.resthibernate.dao.OffersDao;
import com.jvs.resthibernate.entity.Offer;

@Service("offersService")
@Transactional
public class OffersServiceImpl implements OffersService {

	@Autowired
	private OffersDao offersDao;
	

	
	@Override
	public List<Offer> getAllOffers() {
		return offersDao.findAll();
	}

	@Override
	public Offer getOffer(Long id) {
		return offersDao.findByID(id);		
	}
	
	@Override
	public void createOffer(Offer offer) {
		offersDao.save(offer);
	}

	@Override
	public void updateOffer(Offer offer) {
		offersDao.save(offer);
		
	}

	@Override
	public void deleteOffer(Long id) {
		offersDao.delete(id);
	}	

}
