package com.mongo.wrapper;

import com.mongo.model.User;

public class WrapperUser {

	private String userId;
	private User user;
	/**
	 * @param userId
	 * @param user
	 */
	public WrapperUser(String userId, User user) {
		this.userId = userId;
		this.user = user;
	}
	
	public WrapperUser() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "WrapperUser [userId=" + userId + ", user=" + user + "]";
	}
	
	
}
