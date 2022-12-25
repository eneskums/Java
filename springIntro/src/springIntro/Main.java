package springIntro;

import javax.naming.Context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		customerService.add();
		
//		CustomerManager mySqlManager = new CustomerManager(context.getBean("database", ICustomerDal.class));
//		mySqlManager.add();
	}

}
