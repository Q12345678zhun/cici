package com.xk.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.xk.bean.Course;
import com.xk.bean.Student;
import com.xk.dao.CourseDao;

public class CourseDaoImpl extends HibernateDaoSupport implements CourseDao {

	public void insertCourse(Course course) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(course);

	}

	@SuppressWarnings("unchecked")
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Course cs order by cs.cno");
	 
	}

	public Course getCourseById(int id) {
		// TODO Auto-generated method stub
		return  this.getHibernateTemplate().get(Course.class, id);
	}

	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(course);
		
	}

	public void deleteCourse(Course course) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(course);
		
	}
	public Course getCourseByNo(Course course){
		System.out.println(course.getCno());
		List list=this.getHibernateTemplate().find("from Course cs where cs.cno="+course.getCno());
		return (Course)list.get(0);
	}	




}
