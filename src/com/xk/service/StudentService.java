package com.xk.service;

import com.xk.bean.Course;
import com.xk.bean.Student;

public interface StudentService {
	public boolean getStudent(Student student);

	public void insertStudent(Student student);

	public void xuanke(Student student);

	public Student getStudentByNo(Student student);

	public void tuixuan(Student student);

	public void updateStudentInf(Student student);
	
	public Student getStudentById(Student  student);

	
}
