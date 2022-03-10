package com.filter;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/SignupMainServlet")
public class SignupMainFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String fullname=request.getParameter("fullname_s");
		String username=request.getParameter("username_s");
		String password=request.getParameter("password_s");
		String cpassword=request.getParameter("cpassword_s");
		
		boolean is_error=false;
		System.out.println("filter done");

		String regexn="^(?=.*[0-9]).{10}$";

		Pattern p = Pattern.compile(regexn);
		Matcher m=p.matcher(username);
			
		String regexg="^[a-z0-9._%+-]+@[a-z]+\\.[a-z]{2,6}$";
		Pattern p1=Pattern.compile(regexg);
		Matcher m1=p1.matcher(username);
 
		String regexp = "^(?=.*[0-9])"
                + "(?=.*[a-zA-Z]).{8,16}$";
		Pattern p2 = Pattern.compile(regexp);
		Matcher m2 = p2.matcher(password);
 	

		
		if(username.length()==10&&m.matches()) {
			System.out.println("phone");
		}else if(m1.find()) {
			System.out.println("email");
		}else {
			is_error=true;
			request.setAttribute("username_ES", "Please provide valid email or phonenumber");
		}
		
		if(fullname.trim().length()==0) {
			is_error=true;
			request.setAttribute("fullname_ES", "Please Enter Fullname");
		}
		if(!password.equals(cpassword)) {
			is_error=true;
			request.setAttribute("cpassword_ES", "Password shouldn't match");
		}
		if(password.trim().length()==0||m2.matches()==false) {
			is_error=true;
			request.setAttribute("password_ES", "Please Provide valid Password");
		}
		if(is_error) {
			request.getRequestDispatcher("SignupMain.jsp").forward(request, response);
		}else {
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
