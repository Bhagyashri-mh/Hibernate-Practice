package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con= new Configuration().configure();
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Employee e= new Employee();
        e.setEname("Sakshi Patil");
        e.setEcompany("Yardi");
        e.setEdesignation("Java Developer");
        e.setEsalary(30000);
        
        Address a= new Address();
        a.setLine1("Ganesh Apartment");
        a.setLine2("Shivajinagar");
        a.setCity("Pune");
        a.setState("MH");
         e.setAddress(a);
        session.save(e);
        tx.commit();
        session.close();
        
    }
}
