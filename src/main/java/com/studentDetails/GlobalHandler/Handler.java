package com.studentDetails.GlobalHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.studentDetails.excepHandler.AgeLimitException;
import com.studentDetails.excepHandler.AttandanceNotFoundException;

@RestControllerAdvice
public class Handler {
	@ExceptionHandler(AgeLimitException.class )
	public ResponseEntity<Object> ageHandler(){
		return new ResponseEntity<Object>("Invalid Data",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(AttandanceNotFoundException.class)
	public ResponseEntity<Object> AttandeanceHandler(){
		return new ResponseEntity<Object>("Attandance More then 90",HttpStatus.BAD_REQUEST);
	}

}
