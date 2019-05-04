package com.aaudin.springboottutorial.model.response;

public class BaseResponse {

	private String message;
	
	public BaseResponse() {
	}
	
	public BaseResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
