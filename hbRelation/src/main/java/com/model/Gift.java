package com.model;

import java.security.Identity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.id.IdentityGenerator;

@Entity
public class Gift {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gid;
	private String gname;
	private String gtype;
	@	ManyToOne
	private Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGtype() {
		return gtype;
	}
	public void setGtype(String gtype) {
		this.gtype = gtype;
	}
	@Override
	public String toString() {
		return "Gift [gid=" + gid + ", gname=" + gname + ", gtype=" + gtype + "]";
	}
	
}
