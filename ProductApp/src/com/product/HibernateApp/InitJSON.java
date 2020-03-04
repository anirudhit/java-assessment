package com.product.HibernateApp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;
import org.json.JSONWriter;

import com.product.dto.Category;
import com.product.dto.Product;

public class InitJSON {
	public static void main(String[] args) throws JSONException {
		initJSON();
	}
	public static void initJSON() throws JSONException {
		Category category = new Category();
		category.setCategoryId(11);
		Product product = new Product();
		product.setProductId(13);
		product.setProductname("Ipod");
		product.setCategory(category);
		product.setPrice(745);
		product.setQuantity(35);
		
		JSONObject jsObj = new JSONObject(product);
		System.out.println("jsObj: "+jsObj);
		System.out.println("jsObj.toString(): "+jsObj.toString());
		System.out.println("product: "+product);
	}
}
