package com.jdbc.myapp.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jdbc.myapp.Beans.Employee;
import com.jdbc.myapp.Modals.EmployeeActions;

/**
 * Servlet implementation class GetEmployeeServlet
 */
@WebServlet("/GetEmployeeServlet")
public class GetEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEmployeeServlet() {
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
    	int empId=Integer.parseInt(empid);
    	Employee emp=new Employee();
    	EmployeeActions empActions = new EmployeeActions();
    	emp = empActions.fetchData(empId);
    	if(emp == null) {
    		response.sendRedirect("ErrorPage.jsp");
    	}else {
    		HttpSession session=request.getSession();
    		session.setAttribute("EmployeeDetails", emp);
    		response.sendRedirect("UpdateEmployee.jsp?empId="+empid);
    	}

    }

}