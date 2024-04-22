package com.student.exception;

public class StudentResource extends RuntimeException {

	public StudentResource(String msg) {
		super(msg);
	}
}
