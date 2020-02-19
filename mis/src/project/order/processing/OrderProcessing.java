package project.order.processing;

import java.util.Date;
import java.util.Scanner;

public class OrderProcessing {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Scanner sci = new Scanner(System.in);
		Scanner scs = new Scanner(System.in);
		Scanner scf = new Scanner(System.in);
		
		// Entering customer details
		System.out.println("Enter customerId, customerName, address, phone:");
		int customerId, phone;
		String customerName, address;
		customerId = sci.nextInt();
		customerName = scs.nextLine();
		address = scs.nextLine();
		phone = sci.nextInt();
		
		Customer customer = new Customer(customerId, customerName, address, phone);
		System.out.println(customer);
		
		//Entering order details
		System.out.println("Enter orderId, customerId, customerName, productId, amount, orderDate");
		int orderId, productId;
		Date orderDate;
		float amount;
		orderId = sci.nextInt();
		customerId = sci.nextInt();
		customerName = scs.nextLine();
		productId = sci.nextInt();
		amount = scf.nextFloat();
		orderDate = new Date(scs.nextLine());
		
		Order order = new Order(orderId, customerId, customerName, productId, amount, orderDate);
		System.out.println(order);
		
		//Entering product details
		System.out.println("Enter productId, productPrice and productType");
		float productPrice;
		String productType;
		productId = sci.nextInt();
		productPrice = scf.nextFloat();
		productType = scs.nextLine();
		
		Product product = new Product(productId, productPrice, productType);
		System.out.println(product);
		
		//Entering stock details
		System.out.println("Enter productId, quantity, shopNo");
		int quantity, shopNo;
		productId = sci.nextInt();
		quantity = sci.nextInt();
		shopNo = sci.nextInt();
		
		Stock stock = new Stock(productId, quantity, shopNo);
		System.out.println(stock);
		
		sci.close();
		scs.close();
		scf.close();
		
	}

}
