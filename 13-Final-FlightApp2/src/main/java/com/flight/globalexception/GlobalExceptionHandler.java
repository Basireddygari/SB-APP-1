package com.flight.globalexception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.flight.exception.TicketNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(TicketNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleEx(TicketNotFoundException e){
		return new ResponseEntity<ErrorMessage>(
				new ErrorMessage(
						e.getMessage(), 
						LocalDateTime.now(), 
						e.getClass().toString())
				, HttpStatus.OK);
	}
	
}

