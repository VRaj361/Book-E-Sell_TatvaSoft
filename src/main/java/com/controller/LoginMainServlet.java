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


public class LoginMainServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username_l");
		String password=request.getParameter("password_l");
		
		AddLoginDatabean bean=new AddLoginDatabean();
		bean.setUsername(username);
		bean.setPassword(password);
		
		BookESellDao dao=new BookESellDao();
		int check=-1;
		try {
			check=dao.CheckData(bean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(check!=-1) {
			ArrayList<SetDataBook> arr=new ArrayList<SetDataBook>();
			HttpSession session=request.getSession();
			session.setAttribute("userid", check);
			System.out.println(session.getAttribute("userid"));
			int userid=(Integer) session.getAttribute("userid");
			try {
				arr=dao.getAllDataA(userid);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("getAllData_Ed", arr);
			request.getRequestDispatcher("ProductBookList.jsp").forward(request, response);;
		}else {
			request.setAttribute("INCorrectDATA_DB", "User Doesn't exists");
			request.getRequestDispatcher("LoginMain.jsp").forward(request, response);
		}
	}

}
