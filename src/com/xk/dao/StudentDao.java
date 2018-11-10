package com.xk.dao;

import java.util.List;

import com.xk.bean.Course;
import com.xk.bean.Student;

public interface StudentDao {
	public void insertStudent(Student student);

	public List<Student> getAllStudents();

	public boolean getStudent(Student student);

	public void updateStudent(Student student);

	public Student getStudentByNo(Student student);

	public Student getStudentById(Integer sid);

}
