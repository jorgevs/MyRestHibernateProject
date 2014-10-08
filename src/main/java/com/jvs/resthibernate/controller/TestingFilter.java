package com.jvs.resthibernate.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This Filter class is used to generate a log for all request and responses
 * that interact with the web application services
 * 
 * @author jorgevs
 * @version 1.0
 */
public class TestingFilter implements Filter {

	public TestingFilter() {
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void destroy() {
	}

	/**
	 * Used to print a log for all request and responses in the default output
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		// System.out.println(((HttpServletRequest)request).getUserPrincipal());
		System.out.println(((HttpServletRequest) request).getMethod() + " >> " + ((HttpServletRequest) request).getRequestURI() + " ContentType: "
				+ ((HttpServletRequest) request).getContentType());

		/*
		 * System.out.println(((HttpServletResponse)response).getContentType());
		 * System
		 * .out.println(((HttpServletResponse)response).getCharacterEncoding());
		 * System.out.println(((HttpServletResponse)response).toString());
		 * System.out.println(((HttpServletResponse)response).getLocale());
		 */

		chain.doFilter(request, response);
	}

}
