package com.jdbc.myapp.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
private static Connection con=null;

static{
	try {
		Class.forName("com.mysq.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anirudh","root","");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static Connection getCon() {
	return con;
}
public static void setCon(Connection con) {
	DatabaseConnection.con = con;
}
}
