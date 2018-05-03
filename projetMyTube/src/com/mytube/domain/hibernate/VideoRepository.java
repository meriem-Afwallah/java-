package com.mytube.domain.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class VideoRepository {
	
	public Video findVideoById(Long id){
		
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Video video = session.find(Video.class, 1L);
		return video;
		
	}

}
	

	
