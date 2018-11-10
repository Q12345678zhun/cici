package com.xk.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Course;
import com.xk.bean.Teacher;
import com.xk.service.CourseService;
import com.xk.service.TeacherService;

public class InsertTeacherAction extends ActionSupport {
	private TeacherService teacherService;
	private Teacher teacher;
	private CourseService courseService;
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
		Course course=this.courseService.getCourseByNo(teacher.getCourse());
		teacher.setCourse(course);
		this.teacherService.insertTeacher(teacher);
		return SUCCESS;
	}
}
