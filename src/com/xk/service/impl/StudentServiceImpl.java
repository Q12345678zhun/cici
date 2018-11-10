package com.xk.service.impl;

import com.xk.bean.Course;
import com.xk.bean.Student;
import com.xk.bean.Teacher;
import com.xk.dao.StudentDao;
import com.xk.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public boolean getStudent(Student student) {
		// TODO Auto-generated method stub
		return this.studentDao.getStudent(student);

	}

	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		this.studentDao.insertStudent(student);

	}

	public void xuanke(Student student) {
		// TODO Auto-generated method stub
		this.studentDao.updateStudent(student);

	}

	public Student getStudentByNo(Student student) {
		// TODO Auto-generated method stub
		return this.studentDao.getStudentByNo(student);
	}

	public void tuixuan(Student student) {
		// TODO Auto-generated method stub
		this.studentDao.updateStudent(student);
		
	}

	public void updateStudentInf(Student student) {
		// TODO Auto-generated method stub
		this.studentDao.updateStudent(student);
		
	}

	@Override
	public Student getStudentById(Student student) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			return this.studentDao.getStudentById(student.getSid());
		
	}

}
