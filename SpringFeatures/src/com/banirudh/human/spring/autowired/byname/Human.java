package com.banirudh.human.spring.autowired.byname;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart humanHeart;
	
	public Human() {}

	public Human(Heart humanHeart) {
		this.humanHeart = humanHeart;
	}
	
	@Autowired
	public void sethumanHeart(Heart humanHeart) {
		this.humanHeart = humanHeart;
	}

	public void startPumping() {
		if(humanHeart != null) {
			humanHeart.pump();
		}else {
			System.out.println("You are not alive");
		}
	}
}
