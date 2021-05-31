package com.romario.cursomc.resource.exception;

public class objectionException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public objectionException (String msg) {
		super(msg);
	}
	
	public objectionException (String msg, Throwable cause) {
		super(msg, cause);
	}
}
