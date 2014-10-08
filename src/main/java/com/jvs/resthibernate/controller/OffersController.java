package com.jvs.resthibernate.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jvs.resthibernate.entity.Offer;
import com.jvs.resthibernate.service.OffersService;

/**
 * This Controller class handles requests for the Offer entities
 * 
 * @author jorgevs
 * @version 1.0
 */

// @RequestMapping(value="/offers")
@Controller
public class OffersController {
	private static final Logger logger = LoggerFactory.getLogger(OffersController.class);

	@Autowired
	private OffersService offersService;

	/**
	 * Shows the page form to capture info from user to create a new Offer
	 * object
	 * 
	 * @param model
	 * @return a ModelAndView object to render the Offer form
	 */
	@RequestMapping(value = "/offers/showCreateOfferFormPage", method = RequestMethod.GET)
	public ModelAndView getCreateOfferForm(Model model) {
		ModelAndView mav = new ModelAndView("vwshowCreateOfferFormPage");
		mav.addObject("offer", new Offer());
		return mav;
	}

	/**
	 * Shows the page form to capture info from user to edit an existing Offer
	 * object
	 * 
	 * @param model
	 * @return a ModelAndView object to render the Offer edit page
	 */
	@RequestMapping(value = "/offers/showEditOfferFormPage", method = RequestMethod.GET)
	public ModelAndView getEditOfferForm(Model model) {
		ModelAndView mav = new ModelAndView("vwShowEditOfferFormPage");
		mav.addObject("offer", new Offer());
		return mav;
	}

	/**
	 * Retrieves all the existing Offer objects.
	 * 
	 * @param model
	 *            contains a list with all the Offer objects.
	 * @return a ModelAndView object to render the Offer list page
	 */
	@RequestMapping("/offers/showAllOffersPage")
	public String getList(Model model) {
		List<Offer> offerList = offersService.getAllOffers();
		model.addAttribute("offerList", offerList);
		return "vwShowAllOffersPage";
	}

}
