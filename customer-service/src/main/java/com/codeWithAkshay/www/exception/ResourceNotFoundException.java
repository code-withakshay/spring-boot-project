package com.codeWithAkshay.www.exception;


public class ResourceNotFoundException extends RuntimeException 
{
	public ResourceNotFoundException(String msg)
	{
		super(msg);
	}
}