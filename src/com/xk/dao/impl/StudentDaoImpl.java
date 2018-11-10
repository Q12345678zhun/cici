package com.xk.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.opensymphony.xwork2.ActionContext;
import com.xk.bean.Course;
import com.xk.bean.Student;
import com.xk.bean.Teacher;
import com.xk.dao.StudentDao;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(student);

	}

	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Student");
	}
	
   //ÊµÏÖµÇÂ½
	
	public boolean getStudent(Student student) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Student> list = this.getHibernateTemplate().find(
				"from Student s where s.sno=" + student.getSno()
						+ "and s.spassword='" + student.getSpassword() + "'");
		if (list.isEmpty())
			return false;
		else
			return true;
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		/*Student student2 = this.getHibernateTemplate().get(Student.class,
				student.getSid());
		student2.setSclass(student.getSclass());
		student2.setSmajor(student.getSmajor());
		student2.setSname(student.getSname());
		student2.setSnation(student.getSnation());
		student2.setSpassword(student.getSpassword());
		student2.setSsex(student.getSsex());*/
		this.getHibernateTemplate().update(student);

	}

	public Student getStudentByNo(Student student) {
		// TODO Auto-generated method stub
		List list = this.getHibernateTemplate().find(
				"from Student s where s.sno=" + student.getSno());
		return (Student) list.get(0);
	}

	@Override
	public Student getStudentById(Integer sid) {
		// TODO Auto-generated method stub
		Student student = this.getHibernateTemplate().get(Student.class, sid);
		return student;
	}

	

}
