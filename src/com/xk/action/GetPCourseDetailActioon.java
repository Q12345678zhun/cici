package com.xk.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Course;
import com.xk.service.CourseService;

public class GetPCourseDetailActioon extends ActionSupport {
	private Course course;
	private CourseService courseService;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map request=(Map)ActionContext.getContext().get("request");
		Course cs=this.courseService.getCourseById(course);
		request.put("courseDetail", cs);
		return "success";
	}
}
