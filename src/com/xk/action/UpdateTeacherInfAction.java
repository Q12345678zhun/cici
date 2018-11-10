package com.xk.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Course;
import com.xk.bean.Teacher;
import com.xk.service.CourseService;
import com.xk.service.TeacherService;

public class UpdateTeacherInfAction extends ActionSupport {
	private Teacher teacher;
	private Course course;
	private CourseService courseService;
	private TeacherService teacherService;

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
		// TODO Auto-generated method stub
//		Teacher teacher2 = this.teacherService.getTeacherById(teacher);
//		course = this.courseService.getCourseByNo(course);
//		teacher2.setCourse(course);
//		teacher2.setTname(teacher.getTname());
//		teacher2.setTmajor(teacher.getTmajor());
//		this.teacherService.updateTeacher(teacher2);
//		return "success";
		course = this.courseService.getCourseByNo(course);
		teacher.setCourse(course);
		teacher.setTname(teacher.getTname());
		teacher.setTmajor(teacher.getTmajor());
		this.teacherService.updateTeacher(teacher);
		return "success";
	}
}
