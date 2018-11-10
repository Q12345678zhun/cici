package com.xk.action;

import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Course;
import com.xk.bean.Student;
import com.xk.service.StudentService;

public class XuankeAction extends ActionSupport {
	private Course course;
	private StudentService service;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public StudentService getService() {
		return service;
	}

	public void setService(StudentService service) {
		this.service = service;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map map = ActionContext.getContext().getSession();
		int no = (Integer) map.get("sno");
		Student student = new Student();
		student.setSno(no);
		student = this.service.getStudentByNo(student);
		Set<Course> courses = student.getCourses();
		courses.add(course);
//		student.setCourses(courses);
		this.service.xuanke(student);
		return "success";
	}
}
