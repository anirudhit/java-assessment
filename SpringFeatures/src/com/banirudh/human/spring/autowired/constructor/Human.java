package com.banirudh.human.spring.autowired.constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heartObj;
	
	public Human() {}

	@Autowired
	public Human(Heart heartObj) {
		this.heartObj = heartObj;
	}
	
	public void setHeartObj(Heart heartObj) {
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
