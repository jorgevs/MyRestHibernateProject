package com.jvs.resthibernate.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * This Controller class catch all exceptions that are trown from Database
 * access
 * 
 * @author jorgevs
 * @version 1.0
 */

@ControllerAdvice
public class ErrorHandlerController {

	/**
	 * Exception handler for exceptions form database access
	 * 
	 * @return a the ModelAndView object with the render of the exception   
	 */
	@ExceptionHandler(DataAccessException.class)
	public ModelAndView handleDatabaseException(DataAccessException ex) {
		ex.printStackTrace();

		ModelAndView model = new ModelAndView("vwError");
		model.addObject("errCode", "500");
		model.addObject("excMsg", ex.getMessage());
		model.addObject("errMsg", "Oops! Something went wrong.");
		return model;
	}

}
