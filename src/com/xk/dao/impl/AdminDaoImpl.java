package com.xk.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.xk.bean.Admin;
import com.xk.dao.AdminDao;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

	@SuppressWarnings("unchecked")
	public boolean getAdmin(Admin admin) {
		// TODO Auto-generated method stub
		List<Admin> list = this.getHibernateTemplate().find(
				"from Admin a where a.ano=" + admin.getAno()
						+ "and a.apassword='" + admin.getApassword() + "'");
		if (list.isEmpty())
			return false;
		else
			return true;
	}

}
