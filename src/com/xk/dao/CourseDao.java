package com.xk.dao;

import java.util.List;

import com.xk.bean.Course;
import com.xk.bean.Student;

public interface CourseDao {
	public void insertCourse(Course course);

	public List<Course> getAllCourses();

	public Course getCourseById(int id);
	
	public void updateCourse(Course course);
	
	public void deleteCourse(Course course);
	
	public Course getCourseByNo(Course course);
	
}
