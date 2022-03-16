package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BookESellDao;


public class UpdateDataUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productid=Integer.parseInt( request.getParameter("productid_send"));
		int inputqty=Integer.parseInt(request.getParameter("inputqty"));
		
		System.out.println(productid+" "+inputqty);
		
		int is_check=-1;
		BookESellDao dao=new BookESellDao();
		try {
			is_check=dao.ModifyCart(productid,inputqty);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(is_check==-1) {
			System.out.println("in is_check");
			request.setAttribute("Error_QtyMismatch", "We have only few qty");
			request.getRequestDispatcher("AddToCartMainServlet").forward(request, response);
		}else {
			request.getRequestDispatcher("AddToCartMainServlet").forward(request, response);
		}
		
		
		
	}

	//logout
	//signup redirect on home page
	//every page should contain logout button
	//logout page should destroyed session
	//
	
	
	
	
}