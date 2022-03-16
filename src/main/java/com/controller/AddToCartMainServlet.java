package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.SetDataBook;
import com.dao.BookESellDao;


public class AddToCartMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("fetch all data using addto cart");
		HttpSession session=request.getSession();
		int userid=(Integer) session.getAttribute("userid");
		BookESellDao dao=new BookESellDao();
		ArrayList<SetDataBook> arr=new ArrayList<SetDataBook>();
		try {
			arr=dao.addToCartShow(userid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("AddtocartShow", arr);
		request.getRequestDispatcher("AddToCartJSP.jsp").forward(request, response);
	}

}
