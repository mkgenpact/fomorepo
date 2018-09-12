package com.fomosystem.model;

public class Login {

	private String username;
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	private String password;
	private String role;

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

}
