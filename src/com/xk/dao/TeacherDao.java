package com.xk.dao;

import java.util.List;

import com.xk.bean.Teacher;

public interface TeacherDao {
	void insertTeacher(Teacher teacher);

	public Teacher getTeacherById(int id);

	public List getAllTeachers();

	public void deleteTeacher(Teacher teacher);

	public void updateTeacher(Teacher teacher);
	
	public  Teacher getTeacherByNo(Teacher teacher);
}
