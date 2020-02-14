package project.order.processing;

import java.util.Date;

public class Order {
	int orderId;
	int customerId;
	String customerName;
	int productId;
	float amount;
	Date orderDate;
	
	public Order(int orderId, int customerId, String customerName, int productId, float amount, Date orderDate) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.customerName = customerName;
		this.productId = productId;
		this.amount = amount;
		this.orderDate = orderDate;
	}
	
	public void createOrder() {
		System.out.println("createOrder method");
	}
	
	public void editOrder(int orderId) {
		System.out.println("editOrder method");
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", customerName=" + customerName
				+ ", productId=" + productId + ", amount=" + amount + ", orderDate=" + orderDate + "]";
	}
	
}
