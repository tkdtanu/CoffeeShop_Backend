package com.tkd.ordering.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tkd.ordering.model.User;
import com.tkd.ordering.repository.UserRepository;
import com.tkd.ordering.service.UserMgmtService;

@Service
public class UserMgmtServiceImpl implements UserMgmtService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		logger.info("Inserting User to DB");
		User createdUser = userRepository.save(user);
		logger.info("User inserted to DB successfuly");
		return createdUser;
	}

}
