package com.example.learnviews.learnjspviews.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private Logger logger=LoggerFactory.getLogger(getClass());
	@Autowired
	private AuthenticationService authService;
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String handleLoginGet(@RequestParam(required=false) String name,ModelMap model) {
		logger.debug("Query Param is {} and Request Param is {}", name,name);
		model.put("name",name);
		return "login";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String handleLoginPost(@RequestParam String username,@RequestParam String password,ModelMap model) {
		
		boolean isValidCred=authService.authenticateUser(username, password);
		logger.debug("Query Param is {} and Request Param is {}", username,username);
		model.put("username",username);
		model.put("password",password);
		
		if(isValidCred)
		return "welcome";
		else {
			return "passwordfailure";
		}
	}

}
