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

public class EditMainServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname=request.getParameter("fullname_e");
		String title=request.getParameter("title_e");
		String select=request.getParameter("select_e");
		String description=request.getParameter("descrption_e");
		int price=Integer.parseInt(request.getParameter("price_e"));
		int qty=Integer.parseInt(request.getParameter("qty_e"));
		String url=request.getParameter("url_e");
		HttpSession session=request.getSession();
		int userid=(Integer) session.getAttribute("userid");
		SetDataBook bean=new SetDataBook();
//		bean.setFullname(fullname);
		bean.setTitle(title);
		bean.setUrl(url);
		bean.setSelecttype(select);
		bean.setDescription(description);
		bean.setPrice(price);
		bean.setQty(qty);
		bean.setUserid(userid);
		
		BookESellDao dao=new BookESellDao();
		try {
			dao.setProduct(bean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//add the data inserted the row
		ArrayList<SetDataBook> arr=new ArrayList<SetDataBook>();
		try {
			arr=dao.getAllDataA(userid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("getAllData_Ed", arr);
		request.getRequestDispatcher("ProductBookList.jsp").forward(request, response);
		
		
	}

}
