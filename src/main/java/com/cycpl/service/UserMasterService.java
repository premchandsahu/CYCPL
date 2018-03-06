package com.cycpl.service;

import java.util.List;

import com.cycpl.model.Modules;

public interface UserMasterService {
	int checkLogin(String pusername,String ppassword);
	List<Modules> getMenu(String pusername);
}
