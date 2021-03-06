package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/EditDataServletModify1")
public class EditDataFilter implements Filter {
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	//edit functionallity is done
	
	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String fullname=request.getParameter("fullname_e");
		String title=request.getParameter("title_e");
		
		String description=request.getParameter("descrption_e");
		String price=request.getParameter("price_e");
		String qty=request.getParameter("qty_e");
		String discount=request.getParameter("discount_e");
		String url=request.getParameter("url_e");
		System.out.println(fullname+" "+title+" "+" "+description+" "+price+" "+qty+" "+url+ " "+discount);
		
		
		boolean is_check=false;
		
		if(fullname==null||fullname.trim().length()==0) {
			is_check=true;
			request.setAttribute( "fullname_error","Please Enter Fullname");
		}if(title==null||title.trim().length()==0) {
			is_check=true;
			request.setAttribute( "title_error","Please Enter Title");
		}  if(description==null||description.trim().length()==0) {
			is_check=true;
			request.setAttribute( "descri_error","Please Enter Description");
		} if(price==null||price.trim().length()==0) {
			is_check=true;
			request.setAttribute( "price_error","Please Enter Price");
		} if(qty==null||qty.trim().length()==0) {
			is_check=true;
			request.setAttribute( "qty_error","Please Enter Qty");
		} if(discount==null||discount.trim().length()==0||(Integer.parseInt(discount)<0&&Integer.parseInt(discount)>100)) {
			is_check=true;
			request.setAttribute( "discount_error","Please Enter Discount");
		}
		
		
		if(url==null||url.trim().length()==0) {
			is_check=true;
			request.setAttribute( "url_error","Please Enter URL");
		}
		
		if(is_check) {
			request.getRequestDispatcher("EditDataJSP.jsp").forward(request, response);
		}else {
			chain.doFilter(request, response);
		}
		
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
