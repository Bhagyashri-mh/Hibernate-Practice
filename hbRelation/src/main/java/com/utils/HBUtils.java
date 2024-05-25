package com.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Department;
import com.model.Gift;
import com.model.Laptop;
import com.model.Student;
import com.model.Subject;

public class HBUtils {
	public static SessionFactory sf = new Configuration()
			.setProperties(hbProperties())
			.addAnnotatedClass(Student.class)
			.addAnnotatedClass(Laptop.class)
			.addAnnotatedClass(Gift.class)
			.addAnnotatedClass(Department.class)
			.addAnnotatedClass(Subject.class)
			.buildSessionFactory();

	private static Properties hbProperties() {
		Properties p = new Properties();
		p.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		p.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/jap55");
		p.put("hibernate.connection.username", "root");
		p.put("hibernate.connection.password", "root");
		p.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.put("hibernate.hbm2ddl.auto", "update");
		p.put("hibernate.show_sql", "true");
		p.put("hibernate.fromate_sql", "true");

		return p;
	}
}
