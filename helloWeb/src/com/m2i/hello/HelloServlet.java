package com.m2i.hello;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//code status
		response.setStatus(200);
		
		//headers
		response.setHeader("Content-Type", "text/plain");
		
		//body
		response.getWriter()
				.append("GET Served at:")
				.append(request.getContextPath());
				
		response.getWriter()
				.append("method:  ")
				.append(request.getMethod());
		response.getWriter()
				.append("servlet path ")
				.append(request.getServletPath());
		response.getWriter()
				.append("scheme  ")
				.append(request.getScheme());
		response.getWriter()
				.append("server : name  ")
				.append(request.getServerName());
		response.getWriter()
				.append("server:port ")
				.append("" + request.getServerPort());
		response.getWriter()
				.append("path info  ")
				.append("" + request.getPathInfo());
		response.getWriter()
				.append("user agent  ")
				.append(request.getHeader("User-Agent"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("POST Served at: ").append(request.getContextPath());
		
	}

}
