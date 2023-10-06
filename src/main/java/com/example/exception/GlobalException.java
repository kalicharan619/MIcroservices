package com.example.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<ErrorDetail> resourceNotFound(ResourceNotFound ex , WebRequest req)
	{
		ErrorDetail error= new ErrorDetail(ex.getMessage(), "404", new Date());
	    
		return new ResponseEntity<ErrorDetail>(error , HttpStatus.NOT_FOUND); 
	
	}

}
