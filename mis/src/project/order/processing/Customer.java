package project.order.processing;

public class Customer {
	int customerId;
	String customerName;
	String address;
	int phone;
	
	public Customer(int customerId, String customerName, String address, int phone) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.phone = phone;
	}
	
	public void addCustomer() {
		System.out.println("addCustomer method");
	}
	
	public void editCustomer() {
		System.out.println("editCustomer method");
	}
	
	public void deleteCustomer() {
		System.out.println("deletecustomer method");
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", phone=" + phone + "]";
	}
	
}
