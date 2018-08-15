package com.tkd.ordering.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tkd.ordering.model.AuthToken;
import com.tkd.ordering.model.LoginUser;
import com.tkd.ordering.model.User;
import com.tkd.ordering.security.JwtTokenUtil;
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
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping("/auth/login")
	public ResponseEntity<?> login(@RequestBody LoginUser signInDetails){
		logger.info("Login Request Came");
        return ResponseEntity.ok(userMgmtService.signIn(signInDetails));
	}
	
	@PostMapping("/logout")
	public void logOut(){
		logger.info("Logout Request Came");
		
	}
	
	@PostMapping("/auth/signup")
	public User createUser(@RequestBody User requestUser){
		logger.debug("Request Came for create user:{}", requestUser);
		User user = new User(requestUser.getUserName(), requestUser.getUserName(), bCryptPasswordEncoder.encode(requestUser.getPassword()), requestUser.getDob());
		User createdUser = userMgmtService.createUser(user);
		logger.info("User Created Successfully");
		return createdUser;
	}
	@GetMapping("/profile")
	public User profile(){
		org.springframework.security.core.userdetails.User user = (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal(); 
		String username = user.getUsername();
		return userMgmtService.findOne(username);
	}
}
