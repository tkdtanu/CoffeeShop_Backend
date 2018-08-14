package com.tkd.ordering.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TKD
 *
 */
@RestController
@RequestMapping(path="/api")
public class UserMgmtController {
	
	@PostMapping("/login")
	public void login(){
	}
	
	@PostMapping("/logout")
	public void logOut(){
		
	}
}
