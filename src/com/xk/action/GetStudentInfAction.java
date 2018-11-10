package com.xk.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Student;
import com.xk.service.StudentService;

public class GetStudentInfAction extends ActionSupport {

	private StudentService studentService;
	public StudentService getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Integer sno=(Integer) ActionContext.getContext().getSession().get("sno");
		Student student=new Student();
		student.setSno(sno);
		student=this.studentService.getStudentByNo(student);
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("studentDetail", student);
		return "success";
	}
}
