package com.banirudh.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;

public class CalcController extends ActionSupport {
	private int firstNumber;
	private int secondNumber;
	private int result;
	
	public int getFirstNumber() {
		return firstNumber;
	}
	@IntRangeFieldValidator(min = "1",max = "999999",message = "First number range is from ${min} to ${max}")
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public int getSecondNumber() {
		return secondNumber;
	}
	@IntRangeFieldValidator(min = "1",max = "999999",message = "Second number range is from ${min} to ${max}")
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public String add() throws Exception {
		result = firstNumber + secondNumber;
		return SUCCESS;
	}
	public String sub() throws Exception {
		result = firstNumber - secondNumber;
		return SUCCESS;
	}
	public String mul() throws Exception {
		result = firstNumber * secondNumber;
		return SUCCESS;
	}
	public String div() throws Exception {
		result = firstNumber/secondNumber;
		return SUCCESS;
	}
	
	
}
