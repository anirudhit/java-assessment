package com.jdbc.myapp.Modals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.myapp.Beans.Employee;
import com.jdbc.myapp.DBConnection.DatabaseConnection;

public class EmployeeData {
	private static Connection con=DatabaseConnection.getCon();
	public  int InsertData(Employee employee) throws SQLException{
		PreparedStatement ps=null;
		int result=0;
		try{

			String sql="insert into employee values(?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1, employee.getEmpId());
			ps.setString(2,employee.getEmployeeName());
			ps.setString(3,employee.getDateOfJoining());
			ps.setString(4,employee.getSalary());
			ps.setString(5,employee.getCity());
			ps.setString(6,employee.getSkills());
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
	public Employee fetchData(Employee emp){
		PreparedStatement ps=null;
		try{
			String sql="select * from employee where empid=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, emp.getEmpId());
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				emp.setEmployeeName(rs.getString("employeename"));
				emp.setSalary(rs.getString("salary"));
				emp.setSkills(rs.getString("skills"));
				emp.setCity(rs.getString("city"));
				emp.setDateOfJoining(rs.getString("salary"));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return emp;
	}

	public  int UpdateData(Employee employee) throws SQLException{
		PreparedStatement ps=null;
		int result=0;
		try{
			String sql="update employee set empname=?,salary=?,dateofjoining=?,skills=?,city=? where empid=?";
			ps=con.prepareStatement(sql);
			ps.setInt(6, employee.getEmpId());
			ps.setString(1,employee.getEmployeeName());
			ps.setString(2,employee.getSalary());
			ps.setString(3,employee.getDateOfJoining());
			ps.setString(5,employee.getCity());
			ps.setString(4,employee.getSkills());
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
	public  int deleteData(Employee employee){
		PreparedStatement ps=null;
		int result=0;
		try{
			String sql="Delete from employee  where empid=? ";
			ps=con.prepareStatement(sql);
			ps.setInt(1, employee.getEmpId());
			result=ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}

}
