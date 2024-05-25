package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Department;
import com.model.Gift;
import com.model.Laptop;
import com.model.Student;
import com.model.Subject;
import com.utils.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
        Session session= HBUtils.sf.openSession();
        Transaction tx=session.beginTransaction();
       
       Student s= session.get(Student.class, 3);
       System.out.println(s);
      
       
       
        
        tx.commit();
        session.close();
    }
}
