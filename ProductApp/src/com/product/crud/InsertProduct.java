package com.product.crud;

import java.sql.SQLException;

import com.product.dto.Category;
import com.product.dto.Product;
import com.product.modals.ProductData;

public class InsertProduct {
	public static void main(String[] args) {
		Category category = new Category();
		category.setCategoryId(11);
		Product product = new Product();
		product.setProductId(12);
		product.setProductname("Mobile");
		product.setCategory(category);
		product.setPrice(875);
		product.setQuantity(25);
		
		ProductData productData = new ProductData();
		
		try {
			productData.InsertData(product);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
