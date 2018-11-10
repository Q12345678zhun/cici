package com.xk.service.impl;

import com.xk.bean.Admin;
import com.xk.dao.AdminDao;
import com.xk.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private AdminDao adminDao;

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public boolean getAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return this.adminDao.getAdmin(admin);
	}

}
