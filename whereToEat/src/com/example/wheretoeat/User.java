package com.example.wheretoeat;

public class User {
	private String ID;
	private String password;
	private String name;
	
	public String getID() {
		return ID;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public void setPassword(String pw) {
		password = pw;
	}
	public void setName(String n) {
		name = n;
	}
}
