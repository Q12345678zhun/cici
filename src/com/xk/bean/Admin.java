package com.xk.bean;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private Integer aid;
	private Integer ano;
	private String apassword;

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** full constructor */
	public Admin(Integer ano, String apassword) {
		this.ano = ano;
		this.apassword = apassword;
	}

	// Property accessors

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Integer getAno() {
		return this.ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getApassword() {
		return this.apassword;
	}

	public void setApassword(String apassword) {
		this.apassword = apassword;
	}

}