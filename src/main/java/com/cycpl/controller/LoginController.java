package com.cycpl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.cycpl.dao.UserMasterDao;
import com.cycpl.model.Modules;
import com.cycpl.model.UserMaster;
import com.cycpl.service.UserMasterService;


@Controller
@EnableWebMvc
public class LoginController {

	private UserMasterService usermasterService;
	
	@Autowired
	public void setUsermasterService(UserMasterService usermasterService){
		this.usermasterService=usermasterService;
	}
	
	@ResponseBody
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public UserMaster getUsers()
	{
		UserMaster users=new UserMaster();
		users.setUsername("prem");
		return users;
		
	}
	
	@ResponseBody
	@RequestMapping(value="/menu",method=RequestMethod.GET)
	public List<Modules> getModules()
	{
		String username="prem";
		List<Modules> list=usermasterService.getMenu(username);
		return list;
		
		
	}
	
}
