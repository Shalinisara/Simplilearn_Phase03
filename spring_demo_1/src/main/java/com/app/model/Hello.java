package com.app.model;

public class Hello {
	private String message;

	public Hello(String message) {
		
		System.out.println("Contructor called with message"+message);
		this.message = message;
	}

	public Hello() {
		System.out.println("empty Hello constructor is called");
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Hello [message=" + message + "]";
	}
	
	
}
