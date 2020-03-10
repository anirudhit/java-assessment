package com.banirudh.college.spring.annotations;

public class College {
	
	Principal principal;
	
	public College(Principal principal) {
		super();
		this.principal = principal;
	}
	
	public void test() {
		principal.getPrincipalInfo();
		System.out.println("Testing the college class method.");
	}
}
