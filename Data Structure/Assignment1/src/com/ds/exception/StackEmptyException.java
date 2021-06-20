package com.ds.exception;

public class StackEmptyException extends RuntimeException {
	public StackEmptyException() {
		super("Stack is Empty");
	}
	public StackEmptyException(String errMsg) {
		super(errMsg);
	}
}
