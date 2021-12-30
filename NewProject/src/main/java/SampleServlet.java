
import java.io.IOException;

import org.apache.catalina.connector.Response;
import org.apache.tomcat.jakartaee.bcel.classfile.ClassFormatException;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;
import jakarta.servlet.jsp.JspException;


/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/add1")
public class SampleServlet extends jakarta.servlet.http.HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String s1 = req.getParameter("name1");
		String s2 = req.getParameter("name2");
		resp.getWriter().println(s1+" "+s2);
	}
     
}
