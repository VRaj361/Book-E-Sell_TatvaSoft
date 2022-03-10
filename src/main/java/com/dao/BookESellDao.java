package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import com.bean.AddLoginDatabean;
import com.util.DBConnection;

public class BookESellDao {
	
	//add data db
	public int insertDataDB(AddLoginDatabean bean) throws SQLException {
		PreparedStatement pre=DBConnection.con.prepareStatement("insert into users(fullname,username,password) values(?,?,?)");
		pre.setString(1, bean.getFullname());
		pre.setString(2, bean.getUsername());
		pre.setString(3, bean.getPassword());
		
		int row=pre.executeUpdate();
		System.out.println("signup done "+row+" inserted");
		
		PreparedStatement pre1=DBConnection.con.prepareStatement("select userid from users where username=? and password=?");
		pre1.setString(1, bean.getUsername());
		pre1.setString(2, bean.getPassword());
		ResultSet r=pre1.executeQuery();
		int userid=-1;
		while(r.next()) {
			userid=r.getInt("userid");
		}
		return userid;
		
		
	}
	
	
	public int CheckData(AddLoginDatabean bean) throws SQLException {
		
		PreparedStatement pre=DBConnection.con.prepareStatement("select userid from users where username=? and password=?");
		pre.setString(1,bean.getUsername());
		pre.setString(2, bean.getPassword());
		ResultSet r=pre.executeQuery();
		int count=0;
		int userid=-1;
		if(r.next()) {
			count++;
			userid=(r.getInt("userid"));
		}
		if(count==1) {
			return userid;
		}
		return -1;
	}
}
