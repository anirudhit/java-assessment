package project.order.processing;

public class Product {
	int productId;
	float productPrice;
	String productType;
	
	public Product(int productId, float productPrice, String productType) {
		super();
		this.productId = productId;
		this.productPrice = productPrice;
		this.productType = productType;
	}
	
	public void addProduct() {
		System.out.println("addProducts method");
	}
	
	public void modifyProduct() {
		System.out.println("modifyProduct method");
	}
	
	public void selectProduct(int productId) {
		System.out.println("selectProduct method");
	}
	
}
