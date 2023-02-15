package com.hibernateProj.employeeProj;



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
    	System.out.println("Project is Running..");
    	
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        System.out.println(factory.isClosed());
        
        //create the Student class object...
        Student s1=new Student();
        s1.setId(111);
        s1.setName("Nikita");
        
        Course c=new Course();
        c.setCid(201);
        c.setCname("C Programming");   //setting the course for Student Object
        s1.setCourse(c);
        c.setStudent(s1);
        
        
        Session session=factory.openSession(); //begin the transaction
        
        Transaction tx=session.beginTransaction();
        session.save(s1);
        session.save(c);
        tx.commit();
        session.close();
        factory.close();
    }
}
