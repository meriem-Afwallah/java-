package com.m2i.hello;


import java.util.Iterator;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainSakila {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		//EntityManager em = sessionFactory.createEntityManager();
		
		Customer c = session.find(Customer.class, 1L);
		System.out.println(c.getId() + " " + c.getFirstName() + " " + c.getLastName());
		System.out.println(c.getAddress().getAddress()+" "+ c.getAddress());
		System.out.println(c.getAddress().getCity().getCity()+" "+ c.getAddress().getCity());
		System.out.println(c.getAddress().getCity().getCountry()+" "+ c.getAddress().getCity().getCountry());
		
		Film f = session.find(Film.class, Short.valueOf((short)1));
		System.out.println(f.getTitle());
		
		for(Actor actor: f.getActors()) {
			System.out.println(actor.getFirstName()+" " + actor.getLastName());
		}
		
		
		
//		Actor a = session.find(Actor.class, Short.valueOf(short)1);
//		Customer c2 = new Customer();
//		c2.setFirstName("thomas");
//		c2.setLastName("gros");
//		c2.setMail("thomas@mail.com");
//		c2.setStoreId(1L);
//		c2.setAdressId(1L);
//		
//		session.getTransaction().begin();
//		session.persist(c2);
//		
//		Customer c599 = session.find(Customer.class, 599L);
//		c599.setFirstName("TEST");
//		session.getTransaction().commit();
//		session.close();
//		
//		sessionFactory.close();
	}

}

