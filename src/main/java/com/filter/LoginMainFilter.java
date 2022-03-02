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

@WebFilter("/LoginMainServlet")
public class LoginMainFilter implements Filter{

	public void destroy() {

		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("in");
		String username=request.getParameter("username_l");
		String password=request.getParameter("password_l");
		
		boolean is_error=false;
		//username could must be email or phonenumber
//		String regex = "^(?=.*[0-9])"
//                + "(?=.*[a-zA-Z]).{8,10}$";
		String regexn="^(?=.*[0-9]).{10}$";
		//phone number
		Pattern p = Pattern.compile(regexn);
		Matcher m=p.matcher(username);
			
		String regexg="^[a-z0-9._%+-]+@[a-z]+\\.[a-z]{2,6}$";
		Pattern p1=Pattern.compile(regexg);
		Matcher m1=p1.matcher(username);
 
		String regexp = "^(?=.*[0-9])"
                + "(?=.*[a-zA-Z]).{8,16}$";
		Pattern p2 = Pattern.compile(regexp);
		Matcher m2 = p2.matcher(password);
 	
//		if((username.length()!=10&&m.matches()==false) || (username.trim().length()==0||m1.matches()==false)) {
//			System.out.println("phone");
//			request.setAttribute("username_EL", "Please provide valid email or phonenumber");
//			is_error=true;
//		}
		
		if(username.length()==10&&m.matches()) {
			System.out.println("phone");
		}else if(m1.find()) {
			System.out.println("email");
		}else {
			is_error=true;
			request.setAttribute("username_EL", "Please provide valid email or phonenumber");
		}
		
		
		if(password.trim().length()==0||m2.matches()==false) {
			System.out.println("password");
			request.setAttribute("password_EL", "Please Provide valid Password");
			is_error=true;
		}
		
		if(is_error) {
			request.getRequestDispatcher("LoginMain.jsp").forward(request, response);
		}else {
			chain.doFilter(request, response);
		}
		
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// 
		
	}
	
}