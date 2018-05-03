package com.m2i.hello;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;

import org.hibernate.Query;
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
		
		
		Film f = session.find(Film.class, Short.valueOf((short) 1));
		System.out.println(f.getTitle());
		for (FilmActor fa: f.getFilmactors()) {
			System.out.println(fa.getActor().getFirstname() + " " + 
							   fa.getActor().getLastname());
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
//	
		
		// API Native Hibernate
		String query1HQL = "SELECT c FROM Customer c WHERE c.id = 1";
		Query<Customer> query1 = session.createQuery(query1HQL, Customer.class);
		Customer resultsQuery1 = query1.uniqueResult();
		
		String query2HQL = "SELECT f FROM Film f";
		Query<Film> query2 = session.createQuery(query2HQL, Film.class);
		List<Film> results2 = query2.getResultList();
		
//		String query3HQL = "SELECT c FROM Customer c WHERE c.id = :id";
//		Query<Customer> query3 = session.createQuery(query3HQL, Customer.class);
//		query3.setParameter("id",(short) 2);
//		Customer resultsQuery3 = query3.uniqueResult();
//		System.out.println(resultsQuery3.getAddress().getAddress());
		
//		String query4HQL = "SELECT a FROM Actor a";
//	       Query<Actor> query4 = session.createQuery(query4HQL, Actor.class);
//	       List<Actor> resultsQuery4 = query4.getResultList();
//	       
//	       for (Actor a : resultsQuery4) {
//	            System.out.println(a.getFirstname() + " " + a.getLastname());
//	            Set<FilmActor> fa = a.getFilmactors();
//	            for(FilmActor filmactor : fa) {
//	            	System.out.println("\t" + filmactor.getFilm().getTitle());
//	            }
//	        }
	       
		String query5HQL = "SELECT DISTINCT a FROM Actor a JOIN FETCH a.filmactors fa";
	       Query<Actor> query5 = session.createQuery(query5HQL, Actor.class);
	       List<Actor> resultsQuery5 = query5.getResultList();
          
           for (Actor a : resultsQuery5) {
                System.out.println(a.getFirstname() + " " + a.getLastname());
                Set<FilmActor> fa = a.getFilmactors();
                for(FilmActor filmactor : fa) {
                    System.out.println("\t" + filmactor.getFilm().getTitle());
                }
            }

           List<Object[]> persons = session.createNativeQuery("SELECT * FROM city").getResultList();
           session.close();
           sessionFactory.close();
           List<Country> countries = session.createNativeQuery("SELECT country_id, country, last_update FROM country", Country.class).getResultList();
	       
	       session.close();
	       sessionFactory.close();
	}

}

