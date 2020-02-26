package com.jdbc.myapp.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jdbc.myapp.Beans.Employee;
import com.jdbc.myapp.Modals.EmployeeData;

/**
 * Servlet implementation class FetchEmployeeServlet
 */
@WebServlet("/FetchEmployeeServlet")
public class FetchEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FetchEmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setCity("city");
		request.setAttribute("somedata", 90);
		response.sendRedirect("SuccessPage.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid=request.getParameter("empid");
		int employeeId=Integer.parseInt(empid);
		Employee employee=new Employee();
		employee.setEmpId(employeeId);
		EmployeeData empData=new EmployeeData();
		empData.fetchData(employee);
		if(!employee.getEmpName().isEmpty()){
			HttpSession session=request.getSession();
			session.setAttribute("EmployeeDetails", employee);
			response.sendRedirect("UpdateEmployee.jsp");
		}

	}

}