package com.jdbc.myapp.Controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.myapp.Beans.AdminDetails;
import com.jdbc.myapp.Modals.AdminLogin;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminLoginServlet() {
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
		String username		=	request.getParameter("username");
		String password		=	request.getParameter("password");
		AdminDetails adminDetails=new  AdminDetails();
		adminDetails.setPassword(password);
		adminDetails.setUsername(username);
		AdminLogin adminLoginModal=new AdminLogin();

		boolean result = false;
		try {
			result = adminLoginModal.validateLogin(adminDetails);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(result)
			response.sendRedirect("homepage.jsp");
		else
			response.sendRedirect("InvalidLogin.jsp");
	}
}
