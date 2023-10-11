package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Employee;
import com.utility.HibernateUtil;

public class insert
{
	public static void main(String args[]) {
	SessionFactory factory=HibernateUtil.getSessionFactory();
	  Session ses=HibernateUtil.getSession();
 
  try
  {
	  
	  ses.beginTransaction();
	  Employee emp1=new Employee("Shakar","AWS Trainer",50000.00);
	  Employee emp2=new Employee("Prem","QA",10000.00);
	  Employee emp3=new Employee("Yatin","BA",20000.00);
	  Employee emp4=new Employee("Aakash","Management",30000.00);
	  Employee emp5=new Employee("Swaraj","Admin",40000.00);
	  ses.save(emp1);
	  ses.save(emp2);

	  ses.save(emp3);

	  ses.save(emp4);

	  ses.save(emp5);

	  
	  ses.getTransaction().commit();
	  }
  catch(Exception e)
  {
		  e.printStackTrace();
	  }
  }
}
