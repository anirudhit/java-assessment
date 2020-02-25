package com.jdbc.myapp.Controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.myapp.Beans.Employee;
import com.jdbc.myapp.Modals.EmployeeData;

/**
 * Servlet implementation class SaveEmployee
 */
@WebServlet("/SaveEmployee")
public class SaveEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SaveEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee employee=new Employee();
		employee.setEmpId(Integer.parseInt(request.getParameter("empid")));
		employee.setEmployeeName(request.getParameter("empname"));
		employee.setSkills(request.getParameter("skills"));
		employee.setCity(request.getParameter("city"));
		employee.setSalary(request.getParameter("salary"));
		employee.setDateOfJoining(request.getParameter("doj"));

		EmployeeData employeeData=new EmployeeData();
		try {
			int data=101;//employeeData.InsertData(employee);
			if(data!=0)
				response.sendRedirect("SuucessPage.jsp");
			else
				response.sendRedirect("ErrorMessage.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
