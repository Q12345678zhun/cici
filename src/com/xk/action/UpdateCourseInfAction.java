package com.xk.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Course;
import com.xk.service.CourseService;

public class UpdateCourseInfAction extends ActionSupport {
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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.courseService.updateCourseInf(course);
		return SUCCESS;
	}
}
