package com.xk.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.xk.bean.Student;
import com.xk.service.StudentService;

public class getCourseStudentAciton {
	private Student student;
	private StudentService  studentService;
    
	

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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("studentDetail",
				this.studentService.getStudentById(student));
		return "success";
	}

}
