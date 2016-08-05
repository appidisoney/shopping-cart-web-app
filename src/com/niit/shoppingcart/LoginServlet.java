package com.niit.shoppingcart;

 
	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet("/Loginservlet")
	public class LoginServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
	    
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String id= request.getParameter("userid");
			String password= request.getParameter("pwd");
			LoginDAO loginDAO=new LoginDAO();
			RequestDispatcher dispatcher;
			if(loginDAO.isValidUser(id, password)==true)
			{
			dispatcher=request.getRequestDispatcher("home.html");
			dispatcher.include(request, response);
			}
			else
			{
				PrintWriter writer=response.getWriter();
				writer.println("Please enter valid credentials");
				dispatcher=request.getRequestDispatcher("login.html");
				dispatcher.include(request, response);

			}
			
		}}


