package com.demo;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;



import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.util.HBUtils;

import net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique;

public class App 
{  
    public static void main( String[] args )
    {
       Session session =HBUtils.sf.openSession();
       Transaction tx = session.beginTransaction();
       
     Emp e= (Emp) session.createCriteria(Emp.class)
    		 .add(Restrictions.eq("esalary",session.createCriteria(Emp.class)
    		 .add(Restrictions.eq("esalary",  session.createCriteria(Emp.class)
      .add(Restrictions.lt("esalary", session.createCriteria(Emp.class)
      .setProjection(Projections.max("esalary"))
      .uniqueResult()))
      .setProjection(Projections.max("esalary"))
      .uniqueResult()))
    		 .uniqueResult()))
    	.setProjection(Projections.max("esalary"))
    	.uniqueResult();
    		 
    	System.out.println(e);
       tx.commit();
       session.close();
       
    }
}
 