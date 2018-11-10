package com.xk.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Teacher;
import com.xk.service.TeacherService;

public class DeleteTeacherAction extends ActionSupport {
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

	@Override
	public String execute() throws Exception {
		this.teacherService.deleteTeacher(teacher);
		return "success";
	}
}
