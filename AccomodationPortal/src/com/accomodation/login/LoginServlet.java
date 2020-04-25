package com.accomodation.login;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.accomodation.loginverification.LoginVerificationDao;
import com.accomodation.model.UserModel;

import java.io.IOException; 
public class LoginServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			  throws ServletException, IOException {
		  RequestDispatcher resDispatcher=request.getRequestDispatcher("Index.html");
		  resDispatcher.forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			  throws ServletException, IOException {
		String username=request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session =request.getSession(true);
		UserModel userModel=LoginVerificationDao.validateUser(username, password);
		if(userModel != null) {
			session.setAttribute("username", userModel.getName());
			session.setAttribute("roleId", userModel.getRoleId());
			session.setAttribute("roleName", userModel.getRole());
			session.setAttribute("userid", userModel.getId());
			session.setAttribute("isAuthenticated",true);
			if(userModel.getRoleId()==2) {
				response.sendRedirect("welcome");
			}else {
				response.sendRedirect("welcomeadmin");
			}
			
		}else {
			
			response.sendRedirect("login");
		}
	}
}