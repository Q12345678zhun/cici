package com.xk.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xk.service.CourseService;

public class GetAllCourseAction extends ActionSupport {
	private CourseService courseServcie;

	public CourseService getCourseServcie() {
		return courseServcie;
	}

	public void setCourseServcie(CourseService courseServcie) {
		this.courseServcie = courseServcie;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		List course=this.courseServcie.getAllCourses();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("allCourse",course);
		return "success";
	}
}
