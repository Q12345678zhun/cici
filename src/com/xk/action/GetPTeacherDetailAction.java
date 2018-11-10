package com.xk.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Teacher;
import com.xk.service.TeacherService;

public class GetPTeacherDetailAction extends ActionSupport {
	ActionSupport ac=new ActionSupport();
	
	private Teacher teacher;
	private TeacherService teacherService;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public TeacherService getTeacherService() {
		return teacherService;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("teacherDetail",
				this.teacherService.getTeacherById(teacher));
		return "success";
	}

}
