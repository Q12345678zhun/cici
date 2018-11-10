package com.xk.service;

import java.util.List;

import com.xk.bean.Course;

public interface CourseService {
	void insertCourse(Course course);

	public List getAllCourses();

	public Course getCourseById(Course course);
	
	public void updateCourseInf(Course course);
	
	public void deleteCourse(Course course);
	
	public Course getCourseByNo(Course course);
}
