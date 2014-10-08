package com.jvs.resthibernate.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.jvs.resthibernate.entity.Offer;
import com.jvs.resthibernate.service.OffersService;

/**
 * This Controller class handles requests for the Offer entities as RESTful web
 * services
 * 
 * @author jorgevs
 * @version 1.0
 */

// @RequestMapping(value="/offers")
@Controller
public class RestOffersController {
	private static final Logger logger = LoggerFactory.getLogger(RestOffersController.class);

	@Autowired
	private OffersService offersService;

	/**
	 * Used to retrieve a list of all the Offer objects that exist in the
	 * database
	 * 
	 * @return a List object with all the the retrieved Offer objects
	 */
	@RequestMapping(value = "/offers", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Offer> getAllOffers() {
		logger.info(">>> getAllOffers()");
		return offersService.getAllOffers();
	}

	/**
	 * Used to retrieve an Offer object from the database
	 * 
	 * @param id
	 *            indicates the key form the object to be retrieved
	 * @return the retrieved Offer object
	 */
	@RequestMapping(value = "/offers/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Offer getOffer(@PathVariable long id) {
		return offersService.getOffer(id);
	}

	/**
	 * Used to persist an Offer object in the database
	 * 
	 * @param offer
	 *            the object to be persisted
	 * @param bindingResult
	 *            indicates whether exist error during this operation
	 */
	@RequestMapping(value = "/offers", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.CREATED)
	@ResponseBody
	public void createOffer(@RequestBody @Valid Offer offer, BindingResult bindingResult) {
		logger.info(">>> createOffer()");
		if (bindingResult.hasErrors()) {
			logger.info("Form is not valid.");
			List<ObjectError> errors = bindingResult.getAllErrors();
			for (ObjectError error : errors) {
				logger.error(error.getDefaultMessage());
			}

			/*
			 * List<FieldError> fieldErrors = bindingResult.getFieldErrors();
			 * for (FieldError fieldError : fieldErrors) { String[]
			 * resolveMessageCodes =
			 * bindingResult.resolveMessageCodes(fieldError.getCode()); String
			 * string = resolveMessageCodes[0];
			 * //System.out.println("resolveMessageCodes : "+string); String
			 * message = messages.getMessage(string + "." +
			 * fieldError.getField(), new Object[] {
			 * fieldError.getRejectedValue() }, null);
			 * //System.out.println("Meassage : "+message);
			 * errors.put(fieldError.getField(), message) ; }
			 */

		} else {
			logger.info("Form validated.");
			offersService.createOffer(offer);
		}
	}

	/**
	 * Used to edit an existing Offer object
	 * 
	 * @param offer
	 *            the existing object to be edited
	 * @param id
	 *            is the key to identify the Offer object to be edited
	 */
	@RequestMapping(value = "/offers/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public void editOffer(@RequestBody @Valid Offer offer, @PathVariable long id) {
		offersService.updateOffer(offer);
	}

	/**
	 * Used to delete a Offer object from the database
	 * 
	 * @param id
	 *            is the key to identify the Offer object to be deleted
	 */
	@RequestMapping(value = "/offers/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public void deleteOffer(@PathVariable long id) {
		offersService.deleteOffer(id);
	}

}
