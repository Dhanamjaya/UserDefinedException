package com.app.exception;

public class NoBookFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8226549109526257578L;

	public NoBookFoundException(String msg)
	{
		super(msg);
	}
}
