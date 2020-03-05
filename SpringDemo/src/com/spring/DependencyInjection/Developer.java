package com.spring.DependencyInjection;

public class Developer {
	int empId;
	String empName;
	public Developer(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Developer [empId=" + empId + ", empName=" + empName + "]";
	}
}
