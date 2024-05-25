package com.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sname;
	private String scity;
	@Column(columnDefinition = "double(5,2)")
	private double spercentage;
	@OneToOne
	private Laptop laptop;
	@OneToMany(mappedBy="student")
	private List<Gift> gifts= new LinkedList();
	@ManyToOne
	private Department department;
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<Gift> getGifts() {
		return gifts;
	}
	public void setGifts(List<Gift> gifts) {
		this.gifts = gifts;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
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
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public double getSpercentage() {
		return spercentage;
	}
	public void setSpercentage(double spercentage) {
		this.spercentage = spercentage;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercentage=" + spercentage + "]";
	}
	
}
