package com.banirudh.college.spring.annotations;

public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("I am a math teacher");
	}

}
