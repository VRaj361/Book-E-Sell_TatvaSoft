package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.SetDataBook;
import com.dao.BookESellDao;


public class EditDataServletModify1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname=request.getParameter("fullname_e");
		String title=request.getParameter("title_e");
		
		String description=request.getParameter("descrption_e");
		int price=Integer.parseInt(request.getParameter("price_e"));
		int qty=Integer.parseInt(request.getParameter("qty_e"));
		String url=request.getParameter("url_e");
		HttpSession session=request.getSession();
		int userid=(Integer) session.getAttribute("userid");
		int productid=(Integer) session.getAttribute("productid");
		SetDataBook bean=new SetDataBook();
//		bean.setFullname(fullname);
		bean.setTitle(title);
		bean.setUrl(url);
		bean.setProductid(productid);
		bean.setDescription(description);
		bean.setPrice(price);
		bean.setQty(qty);
		bean.setUserid(userid);
		
		BookESellDao dao=new BookESellDao();
		
		
		try {
			dao.modifyData(bean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("query updated");
//		ArrayList<SetDataBook> arr=new ArrayList<SetDataBook>();
//		try {
//			arr=dao.getAllDataA(userid);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		request.setAttribute("Modified_arr_EDSM", arr);
		
		response.sendRedirect("LoginMain.jsp");
	}

}
