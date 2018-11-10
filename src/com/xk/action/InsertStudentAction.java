package com.xk.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Student;
import com.xk.service.StudentService;

public class InsertStudentAction extends ActionSupport {
private Student student;
private StudentService studentService;
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public StudentService getStudentService() {
	return studentService;
}
public void setStudentService(StudentService studentService) {
	this.studentService = studentService;
}
@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
	this.studentService.insertStudent(student);
		return "success";
	}
}
