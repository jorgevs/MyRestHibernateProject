package com.jvs.resthibernate.integrationtest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.jvs.resthibernate.unittest.OfferServiceTest;

@ContextConfiguration("classpath:beansTest.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class RestOfferTest {

	private static final Logger logger = LoggerFactory.getLogger(OfferServiceTest.class);

	private RestTemplate template;
	
	private String baseUrl; // base url
	
	@Before
	public void initTest() {
		baseUrl = "http://localhost:8080/MyRestHibernateProject/offers";
		template = new RestTemplate();
	}

	@Test
	public void createOfferTest() {
		/*final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		ResponseEntity<String> reponseEntity = new RestTemplate().getForEntity(baseUrl, String.class);
		MediaType contentType = reponseEntity.getHeaders().getContentType();
		HttpStatus statusCode = reponseEntity.getStatusCode();
		logger.info(">>>>" + reponseEntity.getBody());*/
	}

}
