package com.xk.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xk.service.TeacherService;

public class GetAllTeachersAction extends ActionSupport {
	private TeacherService teacherService;

	public TeacherService getTeacherService() {
		return teacherService;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map request = (Map) ActionContext.getContext().get("request");
		List teachers = this.teacherService.getAllTeachers();
		request.put("allTeachers", teachers);
		return "success";
	}
}
