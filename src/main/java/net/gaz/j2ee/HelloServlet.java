package net.gaz.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Browser sends Http Request to Web Server
 *
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 *
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class
//used to extend the capabilities of servers
//that host applications accessed by means of
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
                PrintWriter out = response.getWriter();
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Yahoo!!!!!!!!</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<p style=\"color:red\">");
                out.println("Hello, World!");
                out.println("<p style=\"color:blue\">");
                out.println("Random number: " + getRand());
                out.println("<p>");
                out.println("Date and Time: " + getDateTime());
                out.println("</body>");
                out.println("</html>");

        }
        
        
        private double getRand() {
        	return Math.round((Math.random() * 100));
        }
        
        private LocalDateTime getDateTime() {
        	return LocalDateTime.now();
        }

}
