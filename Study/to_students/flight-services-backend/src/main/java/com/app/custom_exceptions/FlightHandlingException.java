package com.app.custom_exceptions;

@SuppressWarnings("serial")
public class FlightHandlingException extends RuntimeException {
	public FlightHandlingException(String mesg) {
		super(mesg);
	}
}
