package com.example.learnviews.learnjspviews.login;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class AuthenticationService {
		
//		@RequestMapping(value="authenticate",method=RequestMethod.POST)
//		public String authenticateUser(@RequestParam String username,@RequestParam String password) {
//			
//			boolean isValidUser = username.equals("admin");
//			boolean isValidPassword = password.equals("Admin@123");
//			
//			if(isValidUser && isValidPassword) {
//				return "success";
//			}else if(!isValidUser) {
//				return "userfailure";
//			}else {
//				return "passwordfailure";
//			}
//		}
		
	public boolean authenticateUser(String username,String password) {
			
			boolean isValidUser = username.equals("admin");
			boolean isValidPassword = password.equals("Admin@123");
			
			if(isValidUser && isValidPassword) {
				return true;
			}else {
				return false;
			}
		}
}
