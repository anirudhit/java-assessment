package com.jdbc.myapp.Modals;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.myapp.Beans.AdminDetails;
import com.jdbc.myapp.DBConnection.DatabaseConnection;

public class AdminLogin {
	ResultSet res = null;

	public boolean validateLogin(AdminDetails adminDetails) throws SQLException {
		try {
			  String sql="Select * from admin where username=? and password=?";
			  PreparedStatement stmt=DatabaseConnection.getCon().prepareStatement(sql);
			  
			  stmt.setString(1, adminDetails.getUsername());
			  stmt.setString(2,adminDetails.getPassword());
			  res=stmt.executeQuery();
			  
			  if(res.next())
				  return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			res.close();
		}
		return false;
	}
}
