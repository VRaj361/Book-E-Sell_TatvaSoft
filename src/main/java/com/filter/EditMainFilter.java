package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/EditMainServlet")
public class EditMainFilter implements Filter{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String fullname=request.getParameter("fullname_e");
		String title=request.getParameter("title_e");
		String select=request.getParameter("select_e");
		String description=request.getParameter("descrption_e");
		String price=request.getParameter("price_e");
		String qty=request.getParameter("qty_e");
		String url=request.getParameter("url_e");
		System.out.println(fullname+" "+title+" "+select+" "+description+" "+price+" "+qty+" "+url);
		
		
		boolean is_check=false;
		
		if(fullname==null||fullname.trim().length()==0) {
			is_check=true;
			request.setAttribute( "fullname_error","Please Enter Fullname");
		}if(title==null||title.trim().length()==0) {
			is_check=true;
			request.setAttribute( "title_error","Please Enter Title");
		} if(select==null||select.trim().length()==0||select.equals("Select")) {
			is_check=true;
			request.setAttribute( "select_error","Please Select State");
		} if(description==null||description.trim().length()==0) {
			is_check=true;
			request.setAttribute( "descri_error","Please Enter Description");
		} if(price==null||price.trim().length()==0) {
			is_check=true;
			request.setAttribute( "price_error","Please Enter Price");
		} if(qty==null||qty.trim().length()==0) {
			is_check=true;
			request.setAttribute( "qty_error","Please Enter Qty");
		} if(url==null||url.trim().length()==0) {
			is_check=true;
			request.setAttribute( "url_error","Please Enter URL");
		}
		
		if(is_check) {
			request.getRequestDispatcher("EditPage.jsp").forward(request, response);
		}else {
			chain.doFilter(request, response);
		}
		
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
