package com.cycpl.dao;

import java.util.List;



public interface UserMasterDao {

	int checkLogin(String pusername,String ppassword);
	List<Module> getMenu(String pusername);
	
}
