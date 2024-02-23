package com.SRP.SOES.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class userlog {

	
	private String username;
	@Id
	private String password;
	
	public userlog(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public userlog() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "userlog [username=" + username + ", password=" + password + "]";
	}
	
}
