package com.http.tp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RessourceNotFoundException extends RuntimeException {

	public RessourceNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RessourceNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public RessourceNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RessourceNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RessourceNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	
	
}
