import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;	

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
		// To verify whether entered data is printing correctly or not
		System.out.println("emailId.." + emailId);
		System.out.println("password.." + password);
	
		RequestDispatcher rd=null;
		
		if(emailId.equalsIgnoreCase("ashwani@ok.com")&&password.equalsIgnoreCase("password")) {
			rd=request.getRequestDispatcher("Success");
			rd.forward(request, response);
			PrintWriter out=response.getWriter();
			rd.include(request, response);
			out.println("<button style='color:red, width:100%,height:20px' type=\"submit\">Logout</button>");
	
		}
		else {
			rd=request.getRequestDispatcher("index.html");
			PrintWriter out=response.getWriter();
			rd.include(request, response);
			out.println("<center><span style='color:red'>Invalid Credentials !!</span></center>");
		}
		
			
	
		}
	}

