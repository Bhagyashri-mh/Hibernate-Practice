package com.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
			@Id
			@GeneratedValue(strategy= GenerationType.IDENTITY)
			private int sid;
			private String sname;
			@ManyToMany(mappedBy = "subjects")
			private List<Department> departments= new LinkedList();
			public int getSid() {
				return sid;
			}
			public void setSid(int sid) {
				this.sid = sid;
			}
			public String getSname() {
				return sname;
			}
			public void setSname(String sname) {
				this.sname = sname;
			}
			@Override
			public String toString() {
				return "Subject [sid=" + sid + ", sname=" + sname + "]";
			}
			
}
