package com.xk.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Course;
import com.xk.bean.Student;
import com.xk.service.CourseService;
import com.xk.service.StudentService;

public class GetXuankeCourseAction extends ActionSupport {
	private CourseService courseService;
	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
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

		Integer sno = (Integer) ActionContext.getContext().getSession()
				.get("sno");
		Student student = new Student();
		student.setSno(sno);
		List<Course> selected = new ArrayList(this.studentService
				.getStudentByNo(student).getCourses());

		List<Course> all = this.courseService.getAllCourses();
		List<Course> all2 = new ArrayList(all);
		for (Course course : all) {
			for (Course course2 : selected) {
				if (course.getCno().equals(course2.getCno())) {
					all2.remove(course);
				}
			}
		}
		Map map = (Map) ActionContext.getContext().get("request");
		map.put("allCourses", all2);
		return "success";
	}
}
