package com.banirudh.human.spring.autowired.xml;

public class Human {
	Heart heartObj;

	public Human(Heart heartObj) {
		super();
		this.heartObj = heartObj;
	}

	public void setheartObj(Heart heartObj) {
		this.heartObj = heartObj;
	}
	
	public void startPumping() {
		if(heartObj != null) {
			heartObj.pump();
		}else {
			System.out.println("You are not alive");
		}
	}
}
