package project.order.processing;

public class Order {
	int orderId;
	int customerId;
	String customerName;
	int productId;
	float amount;
	int orderDate;
	
	public Order(int orderId, int customerId, String customerName, int productId, float amount, int orderDate) {
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
	
}
