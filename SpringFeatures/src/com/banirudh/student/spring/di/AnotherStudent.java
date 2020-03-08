package com.banirudh.student.spring.di;

public class AnotherStudent {
	MathCheatsheet mathCheat;
	
	public void setMathCheat(MathCheatsheet mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void startCheating() {
		mathCheat.mathCheating();
	}
}
