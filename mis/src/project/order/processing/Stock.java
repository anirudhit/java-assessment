package project.order.processing;

public class Stock {
	int productId;
	int quantity;
	int shopNo;
	
	public Stock(int productId, int quantity, int shopNo) {
		this.productId = productId;
		this.quantity = quantity;
		this.shopNo = shopNo;
	}
	
	public void addStock() {
		System.out.println("addStock method");
	}
	
	public void modifyStock(int productId) {
		System.out.println("modifyStock method");
	}
	
	public void selectStockItem(int productId) {
		System.out.println("selectStockItem method");
	}

	@Override
	public String toString() {
		return "Stock [productId=" + productId + ", quantity=" + quantity + ", shopNo=" + shopNo + "]";
	}
}
