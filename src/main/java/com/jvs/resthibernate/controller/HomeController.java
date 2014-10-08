package com.jvs.resthibernate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This Controller class handles requests for the application home page and
 * principal menu in the application
 * 
 * @author jorgevs
 * @version 1.0
 */

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Request mapping for initial home page
	 * 
	 * @return a String object that indicates the view to be processed by
	 *         ApacheTiles
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String startApp() {
		return "vwHome";
	}

	/**
	 * Request mapping for Dashboard page
	 * 
	 * @return a String object that indicates the view to be processed by
	 *         ApacheTiles
	 */
	@RequestMapping(value = "/spDashboard", method = RequestMethod.GET)
	public String dashboard() {
		return "vwDashboard";
	}

	/**
	 * Request mapping for Flot Charts page
	 * 
	 * @return a String object that indicates the view to be processed by
	 *         ApacheTiles
	 */
	@RequestMapping(value = "/spFlotCharts", method = RequestMethod.GET)
	public String flotCharts() {
		return "vwFlotCharts";
	}

	/**
	 * Request mapping for Morris Charts page
	 * 
	 * @return a String object that indicates the view to be processed by
	 *         ApacheTiles
	 */
	@RequestMapping(value = "/spMorrisCharts", method = RequestMethod.GET)
	public String morrisCharts() {
		return "vwMorrisCharts";
	}

	/**
	 * Request mapping for Tables page
	 * 
	 * @return a String object that indicates the view to be processed by
	 *         ApacheTiles
	 */
	@RequestMapping(value = "/spTables", method = RequestMethod.GET)
	public String tables() {
		return "vwTables";
	}

	/**
	 * Request mapping for Forms page
	 * 
	 * @return a String object that indicates the view to be processed by
	 *         ApacheTiles
	 */
	@RequestMapping(value = "/spForms", method = RequestMethod.GET)
	public String forms() {
		return "vwForms";
	}

	/**
	 * Request mapping for Panel Wells page
	 * 
	 * @return a String object that indicates the view to be processed by
	 *         ApacheTiles
	 */
	@RequestMapping(value = "/spPanelsWells", method = RequestMethod.GET)
	public String panelsWells() {
		return "vwPanelsWells";
	}

	/**
	 * Request mapping for Buttons page
	 * 
	 * @return a String object that indicates the view to be processed by
	 *         ApacheTiles
	 */
	@RequestMapping(value = "/spButtons", method = RequestMethod.GET)
	public String buttons() {
		return "vwButtons";
	}

	/**
	 * Request mapping for Notifications page
	 * 
	 * @return a String object that indicates the view to be processed by
	 *         ApacheTiles
	 */
	@RequestMapping(value = "/spNotifications", method = RequestMethod.GET)
	public String notifications() {
		return "vwNotifications";
	}

	/**
	 * Request mapping for Typography page
	 * 
	 * @return a String object that indicates the view to be processed by
	 *         ApacheTiles
	 */
	@RequestMapping(value = "/spTypography", method = RequestMethod.GET)
	public String typography() {
		return "vwTypography";
	}

	/**
	 * Request mapping for Grid page
	 * 
	 * @return a String object that indicates the view to be processed by
	 *         ApacheTiles
	 */
	@RequestMapping(value = "/spGrid", method = RequestMethod.GET)
	public String grid() {
		return "vwGrid";
	}

	/**
	 * Request mapping for Blank page
	 * 
	 * @return a String object that indicates the view to be processed by
	 *         ApacheTiles
	 */
	@RequestMapping(value = "/spBlank", method = RequestMethod.GET)
	public String blank() {
		return "vwBlank";
	}

	/**
	 * Request mapping for Login page
	 * 
	 * @return a String object that indicates the view to be processed by
	 *         ApacheTiles
	 */
	@RequestMapping(value = "/spLogin", method = RequestMethod.GET)
	public String login() {
		return "vwLogin";
	}

}
