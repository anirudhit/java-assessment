package project.order.processing;

import java.util.Scanner;

public class OrderProcessing {

	public static void main(String[] args) {
		
		// Entering customer details
		Scanner sci = new Scanner(System.in);
		Scanner scs = new Scanner(System.in);
		System.out.println("Enter customerId, customerName, address, phone:");
		int customerId, phone;
		String customerName, address;
		customerId = sci.nextInt();
		customerName = scs.nextLine();
		address = scs.nextLine();
		phone = sci.nextInt();
		
		Customer cust = new Customer(customerId, customerName, address, phone);
		System.out.println(cust);
		
	}

}
