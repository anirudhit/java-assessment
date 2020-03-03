package com.product.crud;

import java.sql.SQLException;

import com.product.dto.Product;
import com.product.modals.ProductData;

public class InsertProduct {
	public static void main(String[] args) {
		Product product = new Product();
		product.setProductId(12);
		product.setProductname("Jeans");
		product.setCategoryId(15);
		product.setPrice(1500);
		product.setQuantity(50);
		
		ProductData productData = new ProductData();
		
		try {
			productData.InsertData(product);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
