package com.xk.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Student;
import com.xk.service.StudentService;

public class UpdateStudentInfAction extends ActionSupport {
	private Student student;
	private StudentService studentServcice;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StudentService getStudentServcice() {
		return studentServcice;
	}

	public void setStudentServcice(StudentService studentServcice) {
		this.studentServcice = studentServcice;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.studentServcice.updateStudentInf(student);
		return "success";
	}
}
