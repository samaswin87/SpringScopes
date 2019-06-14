package com.singleton;

public class Message {

	private String message;

	public void printMessage() {
		System.out.println("Message recieved: "+ message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
