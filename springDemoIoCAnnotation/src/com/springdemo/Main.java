package com.springdemo;

import javax.naming.Context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		customerService.add();
		
//		CustomerManager mySqlManager = new CustomerManager(context.getBean("database", ICustomerDal.class));
//		mySqlManager.add();
	}

}
