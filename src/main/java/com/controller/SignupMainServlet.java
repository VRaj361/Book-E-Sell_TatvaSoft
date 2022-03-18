package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.AddLoginDatabean;
import com.bean.SetDataBook;
import com.dao.BookESellDao;


public class SignupMainServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname=request.getParameter("fullname_s");
		String username=request.getParameter("username_s");
		String password=request.getParameter("password_s");
		System.out.println("in servlet login");
		AddLoginDatabean bean=new AddLoginDatabean();
		bean.setFullname(fullname);
		bean.setUsername(username);
		bean.setPassword(password);
		
		BookESellDao dao=new BookESellDao();
		int userid=-1;
		try {
			userid=dao.insertDataDB(bean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession session=request.getSession();
		session.setAttribute("userid", userid);
		session.setAttribute("roleid", 2);

		//session code
		
//		response.sendRedirect("BookESellHomeJSP.jsp");
		ArrayList<SetDataBook> arr=new ArrayList<SetDataBook>();
		System.out.println(session.getAttribute("userid"));
		
		try {
			arr=dao.getAllDataU();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("getAllData_EdU", arr);
		request.getRequestDispatcher("ProductBookList.jsp").forward(request, response);
		
		
		
	}

}
