package com.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.util.ConnectionDatabse;
import com.util.DBConnection;

public class DBConnectionJoin implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		DBConnection.con=ConnectionDatabse.getConnection();
		System.out.println("data base start");
	}

}
