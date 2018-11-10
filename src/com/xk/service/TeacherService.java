package com.xk.service;

import java.util.List;

import com.xk.bean.Teacher;

public interface TeacherService {
	void insertTeacher(Teacher teacher);

	public Teacher getTeacherById(Teacher teacher);

	public List getAllTeachers();

	public void deleteTeacher(Teacher teacher);

	public void updateTeacher(Teacher teacher);
	
	public Teacher getTeacherByNo(Teacher teacher);
}
