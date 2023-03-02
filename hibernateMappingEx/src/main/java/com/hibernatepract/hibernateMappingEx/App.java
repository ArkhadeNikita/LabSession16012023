package com.hibernatepract.hibernateMappingEx;




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
    	
    	Department d=new Department();
    	d.setDept_id(111);
    	d.setDept_name("IT");
    	
    	Employee e=new Employee();
    	e.setEmp_id(201);
    	e.setEmp_name("Nikita");
    	
    	Employee e1=new Employee();
    	e1.setEmp_id(202);
    	e1.setEmp_name("Niku");
    	
    	Employee e2=new Employee();
    	e2.setEmp_id(203);
    	e2.setEmp_name("Pooja");
    	
    	Employee e3=new Employee();
    	e3.setEmp_id(204);
    	e3.setEmp_name("Pritika");
    	
    
    	
    	Session session=factory.openSession();             //begin the transaction
    	
    	Transaction tx=session.beginTransaction();
    	
    	session.save(e);
    	session.save(e1);
    	session.save(e2);
    	session.save(e3);
    	tx.commit();
    	session.clear();
    	factory.close();
    }
}
