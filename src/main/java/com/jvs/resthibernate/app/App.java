package com.jvs.resthibernate.app;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jvs.resthibernate.entity.Customer;
import com.jvs.resthibernate.entity.Order;
import com.jvs.resthibernate.util.AuditInterceptor;
import com.jvs.resthibernate.util.HibernateUtil;

public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		AuditInterceptor interceptor = new AuditInterceptor();	
		interceptor.setUserIdForCurrentThread(999999L);
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession(interceptor);
		session.beginTransaction();
		//----------------------------------------------------
		
		
		Customer customer = new Customer();
		customer.setName("Jorge Vazquez");				
	
		ArrayList<Order> orderList = new ArrayList<Order>();		
		orderList.add(new Order(new Date(), "CREDIT", "PAID"));
		orderList.add(new Order(new Date(), "CASH", "NOT_PAID"));
		
		customer.setOrders(orderList);		
	
		session.save(customer);
		
		
		//----------------------------------------------------		
		session.getTransaction().commit();
		session.close();		
	}

}