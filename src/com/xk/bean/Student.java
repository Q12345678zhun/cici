package com.xk.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer sid;
	private Integer sno;
	private String spassword;
	private String sname;
	private String ssex;
	private String snation;
	private String smajor;
	private String sclass;
	private Set courses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(Integer sno, String spassword, String sname, String ssex,
			String snation, String smajor, String sclass, Set courses) {
		this.sno = sno;
		this.spassword = spassword;
		this.sname = sname;
		this.ssex = ssex;
		this.snation = snation;
		this.smajor = smajor;
		this.sclass = sclass;
		this.courses = courses;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Integer getSno() {
		return this.sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getSpassword() {
		return this.spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSsex() {
		return this.ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public String getSnation() {
		return this.snation;
	}

	public void setSnation(String snation) {
		this.snation = snation;
	}

	public String getSmajor() {
		return this.smajor;
	}

	public void setSmajor(String smajor) {
		this.smajor = smajor;
	}

	public String getSclass() {
		return this.sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

}