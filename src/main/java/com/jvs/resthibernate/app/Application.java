package com.jvs.resthibernate.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.jvs.resthibernate.controller.OffersController;
import com.jvs.resthibernate.entity.Greeting;
import com.jvs.resthibernate.entity.Page;

public class Application {
	private static final Logger logger = LoggerFactory.getLogger(OffersController.class);
	
	public static void main(String args[]) {
		RestTemplate restTemplate = new RestTemplate();
		Greeting greeting = restTemplate.getForObject("http://localhost:8080/MyRestHibernateProject/greeting", Greeting.class);
		logger.info("Id:    " + greeting.getId());
		logger.info("Context:   " + greeting.getContent());

		restTemplate = new RestTemplate();
		Page page = restTemplate.getForObject("http://graph.facebook.com/gopivotal", Page.class);
		logger.info("Name:    " + page.getName());
		logger.info("About:   " + page.getAbout());
		logger.info("Phone:   " + page.getPhone());
		logger.info("Website: " + page.getWebsite());
	}

}
