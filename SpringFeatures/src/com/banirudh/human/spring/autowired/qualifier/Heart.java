package com.banirudh.human.spring.autowired.qualifier;

public class Heart {
	
	private String nameOfAninal;
	private int noOfHearts;

	public String getNameOfAninal() {
		return nameOfAninal;
	}

	public void setNameOfAninal(String nameOfAninal) {
		this.nameOfAninal = nameOfAninal;
	}

	public int getNoOfHearts() {
		return noOfHearts;
	}

	public void setNoOfHearts(int noOfHearts) {
		this.noOfHearts = noOfHearts;
	}

	public void pump() {
		System.out.println("The heart is pumping");
		System.out.println("Alive");
	}
}
