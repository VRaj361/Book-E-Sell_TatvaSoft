package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddToCartServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productid=Integer.parseInt(request.getParameter("productid"));
		System.out.println(productid + " productid");
		HttpSession session=request.getSession();
		int userid=(Integer)session.getAttribute("userid");
		
		System.out.println(userid+ " userid");
		//
	}

}
