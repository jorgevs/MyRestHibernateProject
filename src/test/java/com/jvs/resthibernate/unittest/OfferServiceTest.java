package com.jvs.resthibernate.unittest;

import static org.junit.Assert.*;

import java.util.List;

import javax.sql.DataSource;

import com.jvs.resthibernate.entity.Offer;
import com.jvs.resthibernate.service.OffersService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:beansTest.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class OfferServiceTest {

	private static final Logger logger = LoggerFactory.getLogger(OfferServiceTest.class);

	@Autowired
	private OffersService offersService;

	@Autowired
	private DataSource dataSource;

	@Before
	public void initTest() {
		logger.info("Truncating User table...");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.execute("DELETE FROM OFFERS");
	}

	@Test
	public void createOfferTest() {
		Offer offer = new Offer("Didier", "didier@gmail.com", "Didier's new offer");
		offersService.createOffer(offer);
		logger.info("Saving offer: " + (offer.toString()));

		List<Offer> offerList = offersService.getAllOffers();
		assertEquals("Total number of offers must be 1.", 1, offerList.size());
	}

}
