import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@javax.servlet.annotation.WebServlet("/logout")
public class Logout extends javax.servlet.http.HttpServlet {

	private static final long serialVersionUID = 1L;	

	public Logout() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	protected void doPost(javax.servlet.http.HttpServlet request, javax.servlet.http.HttpServletResponse response)
			throws javax.servlet.ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		
		out.print("You have been logged out successfully");
		
	
	}
	}