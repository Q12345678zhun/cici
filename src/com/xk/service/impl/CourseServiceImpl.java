package com.xk.service.impl;

import java.util.List;

import com.xk.bean.Course;
import com.xk.dao.CourseDao;
import com.xk.service.CourseService;

public class CourseServiceImpl implements CourseService {
	private CourseDao courseDao;

	public CourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	public void insertCourse(Course course) {
		// TODO Auto-generated method stub
		this.courseDao.insertCourse(course);

	}

	public List getAllCourses() {
		// TODO Auto-generated method stub
		return this.courseDao.getAllCourses();

	}

	public Course getCourseById(Course course) {
		// TODO Auto-generated method stub
		return this.courseDao.getCourseById(course.getCid());
	}

	public void updateCourseInf(Course course) {
		// TODO Auto-generated method stub
		this.courseDao.updateCourse(course);
	}

	public void deleteCourse(Course course) {
		// TODO Auto-generated method stub
		this.courseDao.deleteCourse(course);

	}

	public Course getCourseByNo(Course course) {
		// TODO Auto-generated method stub
		return this.courseDao.getCourseByNo(course);
	}

}
