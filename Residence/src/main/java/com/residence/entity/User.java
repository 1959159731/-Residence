package com.residence.entity;

public class User {
	private int userId;
	private String userName;
	private String userPwd;
	private boolean userRole;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public boolean isUserRole() {
		return userRole;
	}
	public void setUserRole(boolean userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userRole=" + userRole
				+ "]";
	}
	
}
