package com.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Department {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int did;
		private String dname;
		@OneToMany(mappedBy="department")
		private List<Student> students= new LinkedList();
		@ManyToMany
		private List<Subject> subjects= new LinkedList<Subject>();
		public List<Subject> getSubjects() {
			return subjects;
		}
		public void setSubjects(List<Subject> subjects) {
			this.subjects = subjects;
		}
		public List<Student> getStudents() {
			return students;
		}
		public void setStudents(List<Student> students) {
			this.students = students;
		}
		public int getDid() {
			return did;
		}
		public void setDid(int did) {
			this.did = did;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		@Override
		public String toString() {
			return "Department [did=" + did + ", dname=" + dname + "]";
		}
		
}
