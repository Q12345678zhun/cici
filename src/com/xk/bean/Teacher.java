package com.xk.bean;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private Integer tid;
	private Course course;
	private Integer tno;
	private String tname;
	private String tmajor;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** full constructor */
	public Teacher(Course course, Integer tno, String tname, String tmajor) {
		this.course = course;
		this.tno = tno;
		this.tname = tname;
		this.tmajor = tmajor;
	}

	// Property accessors

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Integer getTno() {
		return this.tno;
	}

	public void setTno(Integer tno) {
		this.tno = tno;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTmajor() {
		return this.tmajor;
	}

	public void setTmajor(String tmajor) {
		this.tmajor = tmajor;
	}

}