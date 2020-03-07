package com.spring.DependencyInjection;

import java.util.Map;

public class Developer {
	private int empId;
	private String empName;
	private Map<String, String> empPhno;
	
	public Developer(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public Developer(Map<String, String> empPhno) {
		this.empPhno = empPhno;
	}

	@Override
	public String toString() {
		return "Developer [empId=" + empId + ", empName=" + empName + ", empPhno=" + empPhno + "]";
	}
}
