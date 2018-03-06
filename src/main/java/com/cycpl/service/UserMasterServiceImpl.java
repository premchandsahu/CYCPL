package com.cycpl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cycpl.dao.UserMasterDao;
import com.cycpl.model.Modules;



@Service("usermasterService")
public class UserMasterServiceImpl implements UserMasterService {
	UserMasterDao usermasterDao;
	@Autowired
	public void setUserMasterDao(UserMasterDao usermasterDao)
	{
		this.usermasterDao=usermasterDao;
	}
	
	public int checkLogin(String pusername,String ppassword){
		return usermasterDao.checkLogin(pusername, ppassword);
	}
	
	public List<Modules> getMenu(String pusername){
		return usermasterDao.getMenu(pusername);
	}
	
	
}
