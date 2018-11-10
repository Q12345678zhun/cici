package com.xk.action;

import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Course;
import com.xk.bean.Student;
import com.xk.service.CourseService;
import com.xk.service.StudentService;

public class TuixuanAction extends ActionSupport {
	private Course course;
	private StudentService studentService;
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

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map map = ActionContext.getContext().getSession();
		int no = (Integer) map.get("sno");
		Student student = new Student();
		student.setSno(no);
		student = this.studentService.getStudentByNo(student);
		Set<Course> courses = student.getCourses();
		for (Course ct : courses) {
			if (ct.getCid().equals(course.getCid())) {
				courses.remove(ct);
				break;
			}
		}
		this.studentService.tuixuan(student);
		return "success";
	}
}
