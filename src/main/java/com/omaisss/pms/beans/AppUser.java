package com.omaisss.pms.beans;

public class AppUser {

	private String userName;
	private String fullName;
	private String email;
	private String password;
	private String phoneNumber;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "AppUser [userName=" + userName + ", fullName=" + fullName + ", email=" + email + ", password="
				+ password + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
	
}