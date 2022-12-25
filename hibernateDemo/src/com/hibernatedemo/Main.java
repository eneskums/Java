package com.hibernatedemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			 session.beginTransaction();
			 
			 /* 
			 * List<City> cities = session.
			 * createQuery("from City c where c.countryCode='TUR' AND c.district='Ankara'").
			 * getResultList();
			 * 
			 * for (City city:cities) { System.out.println(city.getName()); }
			 */
			
			// INSERT
			/*
			 * City city = new City(); city.setName("Düzce 5"); city.setCountryCode("TUR");
			 * city.setDistrict("Düzce 5"); city.setPopulation(10000);
			 * 
			 * session.save(city);
			 */
			 
			 // UPDATE
			 
				/*
				 * City city = session.get(City.class, 4082); city.setPopulation(110000);
				 * 
				 * session.save(city);
				 */
			
			 
			 // DELETE
			 
			 City city = session.get(City.class, 4082);
			 
			 session.delete(city);
			 
			session.getTransaction().commit();
			System.out.println("Şehir Silindi");
		} finally {
			factory.close();
		}
		
	}

}
