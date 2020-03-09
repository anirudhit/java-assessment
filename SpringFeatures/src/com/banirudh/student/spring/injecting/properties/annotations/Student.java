package com.banirudh.student.spring.injecting.properties.annotations;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")
	private String name;
	private String interestedCourse;
	private String hobby;
	
	public void setName(String name) {
		this.name = name;
	}
	@Required
	@Value("${student.interestedCourse}")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name: "+name);
		System.out.println("Student interested course: "+interestedCourse);
		System.out.println("Student hobby: "+hobby);
	}
}
