package com.banirudh.student.spring.di.looselycoupling;

public class Student {
	private int studentId;
	private String studentName;
	private Cheatsheet cheat;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setCheat(Cheatsheet cheat) {
		this.cheat = cheat;
	}
	
	public void startCheating() {
		cheat.cheatsheet();
		System.out.println("Started cheating in the exam.");
		System.out.println("Hi, I am "+studentName+". My id: "+studentId);
	}
}
