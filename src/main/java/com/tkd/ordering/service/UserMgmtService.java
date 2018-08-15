package com.tkd.ordering.service;

import com.tkd.ordering.model.LoginUser;
import com.tkd.ordering.model.User;

/**
 * @author TKD
 */
public interface UserMgmtService {
	User createUser(User user);

	User findOne(String userName);
	
	String signIn(LoginUser signInDetails);
}
