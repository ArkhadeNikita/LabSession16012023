package com.hibernatepractex.manytomanymappingex;


import java.util.ArrayList;
import java.util.List;

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
       
       Student s1=new Student();
       s1.setId(111);
       s1.setName("Nikita");
       
       Student s2=new Student();
       s2.setId(112);
       s2.setName("Pritika");
       
       Student s3=new Student();
       s3.setId(113);
       s3.setName("Niku");
       
       Course c1=new Course();
       c1.setCid(401);
       c1.setCname("Python");
       
       Course c2=new Course();
       c2.setCid(402);
       c2.setCname("Java");
       
       Course c3=new Course();
       c3.setCid(403);
       c3.setCname("C Programming");
       
       List<Course>list1=new ArrayList<Course>();
       List<Student>list2=new ArrayList<Student>();
       
       list1.add(c1);
       list1.add(c2);
       list1.add(c3);
       
       list2.add(s1);
       list2.add(s2);
       list2.add(s3);
       
       Session session=factory.openSession();
       
       Transaction tx=session.beginTransaction();
       
       session.save(s1);
       session.save(s2);
       session.save(s3);
       session.save(c1);
       session.save(c2);
       session.save(c3);
       
       tx.commit();
       session.close();
       factory.close();
    }
}
