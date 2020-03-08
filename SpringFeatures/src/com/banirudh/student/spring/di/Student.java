package com.banirudh.student.spring.di;

public class Student {
	private int studentId;
	private String studentName;
	private MathCheatsheet mathCheat;
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setMathCheat(MathCheatsheet mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	public void startCheating() {
		mathCheat.mathCheating();
		System.out.println("Started cheating in math exam");
		System.out.println("Hi, I am "+studentName+". My id: "+studentId);
	}
}
