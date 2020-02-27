package com.banirudh;

import com.opensymphony.xwork2.Action;

public class HelloStruts implements Action {
	// The values from the form tag will be fetched by using interceptor
	private String username;
	private String message;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String execute() throws Exception {
		message = "Hello " + username;
		return SUCCESS;
	}

}
