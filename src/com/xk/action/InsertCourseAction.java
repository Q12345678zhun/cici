package com.xk.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Course;
import com.xk.service.CourseService;

public class InsertCourseAction extends ActionSupport {
	private Course course;
	private CourseService courseService;

	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
//	public void validate() {
//		// TODO Auto-generated method stub
//		this.clearErrorsAndMessages();
//		if (null == this.course.getCno()) {
//			addFieldError("cno", "课程编号不能为空");
//		}
//		if (this.course.getCname().isEmpty()) {
//			addFieldError("cname", "课程名不能为空");
//		}
//		if (this.course.getCtime().isEmpty()) {
//			addFieldError("ctime", "上课时间不能为空");
//		}if (this.course.getCaddress().isEmpty()) {
//			addFieldError("caddress", "上课地点不能为空");
//		}
//
//	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.courseService.insertCourse(course);
		return SUCCESS;
	}
}
