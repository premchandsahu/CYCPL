package com.cycpl.dao;

import java.util.List;

import com.cycpl.model.Modules;



public interface UserMasterDao {

	int checkLogin(String pusername,String ppassword);
	List<Modules> getMenu(String pusername);
	
}
