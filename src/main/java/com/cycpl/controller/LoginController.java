package com.cycpl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.cycpl.model.UserMaster;

@Controller
@EnableWebMvc
public class LoginController {

	@ResponseBody
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public UserMaster getUsers()
	{
		UserMaster users=new UserMaster();
		users.setUsername("prem");
		return users;
		
	}
	
}
