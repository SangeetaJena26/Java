package com.sang.hibernateDemo.Myhibernate1;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.example.mypackage.HibernateUtil;
import com.mysql.cj.xdevapi.SessionFactory;
public class App 
{
    public static void main( String[] args )
    {
    	//SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	
    	org.hibernate.cfg.Configuration configuration=new org.hibernate.cfg.Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	SessionFactory sessionfactory=new SessionFactory();
    	Session session = sessionfactory.openSession();
			
    	 Song song1=new Song();
    	  song1.setId(1);
    	  song1.setSongname("hawayein");
    	  song1.setArtist("Arijit singh");
    	  session.save(song1);
    	  session.close();
    }
}
