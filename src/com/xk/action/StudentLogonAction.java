package com.xk.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Student;
import com.xk.service.StudentService;

//µÇÂ¼
public class StudentLogonAction extends ActionSupport {
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
		boolean ex = this.studentService.getStudent(student);

		if (ex == true) {
			Map<String, Object> map = ActionContext.getContext().getSession();
			map.put("sno", student.getSno());
			map.put("password", student.getSpassword());
			return "success";
		} else {
			// this.addFieldError(LOGIN, "ee");
			return "fail";
		}
	}
}
