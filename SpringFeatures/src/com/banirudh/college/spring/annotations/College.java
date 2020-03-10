package com.banirudh.college.spring.annotations;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	public void test() {
		System.out.println("Testing the college class method.");
	}
}
