package com.xk.service.impl;

import java.util.List;

import com.xk.bean.Teacher;
import com.xk.dao.TeacherDao;
import com.xk.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
	private TeacherDao teacherDao;

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public void insertTeacher(Teacher teacher) {
		this.teacherDao.insertTeacher(teacher);
	}

	public Teacher getTeacherById(Teacher teacher) {
		// TODO Auto-generated method stub
		return this.teacherDao.getTeacherById(teacher.getTid());
	}

	public List getAllTeachers() {
		// TODO Auto-generated method stub
		return this.teacherDao.getAllTeachers();
	}

	public void deleteTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		this.teacherDao.deleteTeacher(teacher);
		
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		this.teacherDao.updateTeacher(teacher);
		
	}

	public Teacher getTeacherByNo(Teacher teacher) {
		// TODO Auto-generated method stub
		return this.teacherDao.getTeacherByNo(teacher);
		
	}

}
