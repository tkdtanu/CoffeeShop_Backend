package com.tkd.ordering.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author TKD
 *
 */
@Entity
@JsonInclude(Include.NON_NULL)
public class User implements UserDetails{
	@Id
	@GeneratedValue(generator="user_seq")
	@SequenceGenerator(name="user_seq",sequenceName="USER_SEQ", allocationSize=1)
	private Long id;
	
	private String name;
	
	private String username;
	
	private String password;
	

	private LocalDate dob;
	
	private LocalDateTime loginTime;
	
	
	public User() {
		super();
	}

	public User(String name, String userName, String password) {
		super();
		this.name = name;
		this.username = userName;
		this.password = password;
	}

	public User(String name, String userName, String password, LocalDate dob) {
		super();
		this.name = name;
		this.username = userName;
		this.password = password;
		this.dob = dob;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(LocalDateTime loginTime) {
		this.loginTime = loginTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", userName=" + username + ", dob=" + dob + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singletonList(new SimpleGrantedAuthority("USER"));
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	

}
