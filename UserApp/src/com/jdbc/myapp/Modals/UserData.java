package com.jdbc.myapp.Modals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.jdbc.myapp.Beans.User;
import com.jdbc.myapp.DBConnection.DatabaseConnection;

public class UserData {
	private static Connection con=DatabaseConnection.getCon();
	public  int InsertData(User user) throws SQLException{
		PreparedStatement ps=null;
		int result=0;
		try{

			String sql="insert into user values(?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1, user.getId());
			ps.setString(2,user.getName());
			ps.setString(3,user.getEmail());
			ps.setString(4,user.getPhone());
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
