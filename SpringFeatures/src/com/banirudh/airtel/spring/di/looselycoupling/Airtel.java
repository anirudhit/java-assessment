package com.banirudh.airtel.spring.di.looselycoupling;

public class Airtel {
	
	private long pno;
	private String customerName;
	Service service;
		
	public void setPno(long pno) {
		this.pno = pno;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setService(Service service) {
		this.service = service;
	}

	public void activateService() {
		System.out.println("Customer: "+customerName+", with Phone number: "+pno);
		service.service();
	}
}
