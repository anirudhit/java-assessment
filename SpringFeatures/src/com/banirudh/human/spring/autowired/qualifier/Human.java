package com.banirudh.human.spring.autowired.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;
	
	public Human() {}

	public Human(Heart heart) {
		this.heart = heart;
	}
	
	@Autowired
	@Qualifier("humanHeart")
	public void setheart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		if(heart != null) {
			heart.pump();
			System.out.println("Name of the animal: "+ heart.getNameOfAninal() + 
								" Number of hearts: "+ heart.getNoOfHearts());
		}else {
			System.out.println("You are not alive");
		}
	}
}
