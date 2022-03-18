package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BookESellDao;

public class RemoveItemAddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("REmove addto cart servlet");
		int useridu=Integer.parseInt(request.getParameter("useridu"));
		System.out.println(useridu);
		BookESellDao dao=new BookESellDao();
		try {
			dao.removeDataCart(useridu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		response.sendRedirect("AddToCartMainServlet");
		
		//change on user as well as admin data base
	}

}
