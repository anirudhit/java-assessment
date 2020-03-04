package com.product.modals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.product.DBConnection.DatabaseConnection;
import com.product.dto.Product;

public class ProductData {
	private static Connection con=DatabaseConnection.getCon();
	public  int InsertData(Product product) throws SQLException{
		PreparedStatement ps=null;
		int result=0;
		try{

			String sql="insert into product values(?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1, product.getProductId());
			ps.setString(2,product.getProductname());
			ps.setInt(3,product.getCategory().getCategoryId());
			ps.setDouble(4,product.getPrice());
			ps.setInt(5,product.getQuantity());
			result=ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			ps.close();
		}
		return result;
	}
}
