package com.banirudh.college.spring.annotations;

public class College {
	
	private Principal principal;
	private Teacher teacher;

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void test() {
		principal.getPrincipalInfo();
		System.out.println("Testing the college class method.");
		teacher.teach();
	}
}
