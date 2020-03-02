package com.jdbc.myapp.Beans;

public class Employee {
	private int empId;
	private String empName;
	private String dateOfJoining;
	private String salary;
	private String city;
	private String skills;
	
	public Employee() {}

	public Employee(int empId, String empName, String dateOfJoining, String salary, String city, String skills) {
		this.empId = empId;
		this.empName = empName;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.city = city;
		this.skills = skills;
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dateOfJoining=" + dateOfJoining + ", salary="
				+ salary + ", city=" + city + ", skills=" + skills + "]";
	}
	
	
}
