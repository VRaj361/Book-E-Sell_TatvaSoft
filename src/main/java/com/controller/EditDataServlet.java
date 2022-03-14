package com.controller;

import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.SetDataBook;
import com.dao.BookESellDao;

public class EditDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in this page");
		int productid=Integer.parseInt(request.getParameter("productid"));
		System.out.println(productid);
		
		HttpSession session=request.getSession();
		session.setAttribute("productid", productid);
		
		ArrayList<SetDataBook> arr=new ArrayList<SetDataBook>();
		BookESellDao dao=new BookESellDao();
		try {
			arr=dao.getAllDataAM(productid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		request.setAttribute("ModifyData_EDS",arr);
		request.getRequestDispatcher("EditDataJSP.jsp").forward(request, response);
		
	}

}
