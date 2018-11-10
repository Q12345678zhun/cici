package com.xk.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xk.bean.Admin;
import com.xk.dao.AdminDao;
import com.xk.service.AdminService;

public class AdminLogonAction extends ActionSupport {
	private Admin admin;
	private AdminService adminService;

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}



	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		boolean ex = this.adminService.getAdmin(admin);

		if (ex == true) {
                      
			return "success";
		} else {
			// this.addFieldError(LOGIN, "ee");
			return "fail";
		}
	}
}
