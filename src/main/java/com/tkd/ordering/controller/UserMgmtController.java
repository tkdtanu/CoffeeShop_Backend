package com.tkd.ordering.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tkd.ordering.model.User;
import com.tkd.ordering.service.UserMgmtService;

/**
 * @author TKD
 *
 */
@RestController
@RequestMapping(path="/api/user")
public class UserMgmtController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserMgmtService userMgmtService;
	
	@PostMapping("/login")
	public void login(){
		logger.info("Login Request Came");
	}
	
	@PostMapping("/logout")
	public void logOut(){
		logger.info("Logout Request Came");
		
	}
	
	@PostMapping("/signup")
	public User createUser(@RequestBody User user){
		logger.debug("Request Came for create user:{}", user);
		User createdUser = userMgmtService.createUser(new User(user.getUserName(), user.getUserName(), user.getPassword(), user.getDob()));
		logger.info("User Created Successfully");
		return createdUser;
	}
}
