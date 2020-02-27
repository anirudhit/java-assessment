package com.banirudh.controller;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeController extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public void validate() {
		System.out.println("In validate");
		if(name.equals(""))
			addFieldError(name, getText("emp.name"));
		if(email.equals(""))
			addFieldError(email, getText("emp.email"));
		if(address.equals(""))
			addFieldError(address, getText("emp.address"));
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(name);
		System.out.println(email);
		System.out.println(address);
		return SUCCESS;
	}
}
