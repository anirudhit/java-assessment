package com.jdbc.myapp.Controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jdbc.myapp.Beans.Employee;
import com.jdbc.myapp.Modals.EmployeeData;

/**
 * Servlet implementation class GetEmployeesServlet
 */
@WebServlet("/GetEmployeesServlet")
public class GetEmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEmployeesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> employee = new ArrayList<Employee>();
    	
    	EmployeeData empData=new EmployeeData();
    	empData.fetchData(employee);
    	System.out.println(employee);
    	
    	
    	if(employee.isEmpty()) {
    		response.sendRedirect("ErrorPage.jsp");
    	}else if(!employee.isEmpty()){
    		HttpSession session=request.getSession();
    		session.setAttribute("EmployeeListDetails", employee);
    		response.sendRedirect("ShowEmployees.jsp");
    	}else
    		response.sendRedirect("ErrorPage.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
