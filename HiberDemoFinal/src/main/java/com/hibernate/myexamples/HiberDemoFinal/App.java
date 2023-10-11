package com.hibernate.myexamples.HiberDemoFinal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
   	Session session =factory.openSession();
   	Transaction tx=session.beginTransaction();
   	
 	Student s=new Student();
			s.setId(5);
			s.setStudname("abv");
			s.setAddress("navi mumbai");
			
			session.save(s);
			tx.commit();
			session.close();
			
    }	
}
