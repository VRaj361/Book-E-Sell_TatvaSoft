package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.BookESellDao;


public class AddToCartServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productid=Integer.parseInt(request.getParameter("productid"));
		System.out.println(productid + " productid");
		HttpSession session=request.getSession();
		int userid=(Integer)session.getAttribute("userid");
		
		System.out.println(userid+ " userid");
		//add the data in the data base
		//userid,productid,product name,product description,qty,priceo,url,priced,discount
		//return the array
		
		//add the data in database
		
		//method
		BookESellDao dao=new BookESellDao();
		
		try {
			dao.addToCartData(productid, userid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("AddToCartMainServlet");
		//this servlet can load all the data and present on the page of addtocart.jsp
	}

}
