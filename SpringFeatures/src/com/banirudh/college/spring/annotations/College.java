package com.banirudh.college.spring.annotations;

public class College {
	
	Principal principal;
	
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public void test() {
		principal.getPrincipalInfo();
		System.out.println("Testing the college class method.");
	}
}
