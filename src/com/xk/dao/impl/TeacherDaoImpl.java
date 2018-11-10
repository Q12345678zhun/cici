package com.xk.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.xk.bean.Teacher;
import com.xk.dao.TeacherDao;

public class TeacherDaoImpl extends HibernateDaoSupport implements TeacherDao {

	public void insertTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(teacher);

	}

	public Teacher getTeacherById(int id) {
		Teacher teacher = this.getHibernateTemplate().get(Teacher.class, id);
		return teacher;
	}

	public List getAllTeachers() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Teacher");
	}

	public void deleteTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(teacher);
		
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(teacher);
		
	}

	public Teacher getTeacherByNo(Teacher teacher) {
		// TODO Auto-generated method stub
		return (Teacher) this.getHibernateTemplate().find("from Teacher t where t.tno="+teacher.getTno()).get(0);
		
	}

}
