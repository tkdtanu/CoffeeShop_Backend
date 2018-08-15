package com.tkd.ordering.service.impl;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.tkd.ordering.model.LoginUser;
import com.tkd.ordering.model.User;
import com.tkd.ordering.repository.UserRepository;
import com.tkd.ordering.security.JwtTokenUtil;
import com.tkd.ordering.service.UserMgmtService;

@Service
public class UserMgmtServiceImpl implements UserMgmtService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    
	@Override
	public String signIn(LoginUser signInDetails) {
		UsernamePasswordAuthenticationToken token1 = new UsernamePasswordAuthenticationToken(
        		signInDetails.getUsername(),
        		signInDetails.getPassword()
        );
		token1.isAuthenticated();
		final Authentication authentication = authenticationManager.authenticate(
				token1
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        User user = this.findOne(signInDetails.getUsername());
        user.setLoginTime(LocalDateTime.now());
        user = userRepository.save(user);
        final String token = jwtTokenUtil.generateToken(user);
        return token;
	}

	
	
	@Override
	public User createUser(User user) {
		logger.info("Inserting User to DB");
		User createdUser = userRepository.save(user);
		logger.info("User inserted to DB successfuly");
		return createdUser;
	}

	@Override
	public User findOne(String username) {
		logger.info("Retrieving User based on username");
		User user = userRepository.findByUsername(username);
		return user;
	}

}
