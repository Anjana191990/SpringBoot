package com.eb.user.exception;

public class UserResource  extends RuntimeException {

	public UserResource(String msg) {
		super(msg);
	}
}
