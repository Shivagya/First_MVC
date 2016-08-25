package mvcdemo.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import mvcdemo.model.Authenticator;
import mvcdemo.model.User;
 
//import sun.text.normalizer.ICUBinary.Authenticate;

public class LoginController extends HttpServlet {
		
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		RequestDispatcher rd = null;
		User u = new User(username, password);
		Authenticator authenticator = new Authenticator();
		
		String result = authenticator.authenticate(u);
		
		if (result.equals("success")) {
			rd = request.getRequestDispatcher("/success.jsp");			
			request.setAttribute("user", u);
		} else {
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}

}
