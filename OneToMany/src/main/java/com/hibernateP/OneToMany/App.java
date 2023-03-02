package com.hibernateP.OneToMany;

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
    	cfg.configure("hibernate1.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
        System.out.println(factory.isClosed());
    	
    	Student s2=new Student();
    	s2.setId(10);
    	s2.setName("Pritika");
    	
    	Course c2=new Course();
    	c2.setCid(501);
    	c2.setCname("Python");
    	c2.setStudent(s2);      //setting the course for course object
    	
    	Course c3=new Course();
    	c3.setCid(502);
    	c3.setCname("Java");
    	c3.setStudent(s2); 
    	
    	Course c4=new Course();
    	c4.setCid(503);
    	c4.setCname("C Programming");
    	c4.setStudent(s2); 
    	
    	//create the list of course to associated with 1 Student
    	
    	List<Course>list=new ArrayList<Course>();
    	
    	//Setting the course with student
    	
    	list.add(c2);
    	list.add(c3);
    	list.add(c4);     
    	
    	s2.setCourse(list);
    	
    	Session session=factory.openSession();             //begin the transaction
    	
    	Transaction tx=session.beginTransaction();
    	
    	
    	session.save(c2);
    	session.save(c3);
    	session.save(c4);
    	tx.commit();
    	session.clear();
    	factory.close();
    	
    }
}
