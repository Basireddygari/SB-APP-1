package com.flight.exception;

public class TicketNotFoundException extends Exception {

	public TicketNotFoundException() {}
	public TicketNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public TicketNotFoundException(Exception message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

	public TicketNotFoundException(String message,Exception e) {
		super(message,e);
		// TODO Auto-generated constructor stub
	}


	

}
