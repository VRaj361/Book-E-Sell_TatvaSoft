package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import com.bean.AddLoginDatabean;
import com.bean.SetDataBook;
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
	
	//add the product in database
	public void setProduct(SetDataBook bean) throws SQLException{
		System.out.println("set production function");
		//product id
		PreparedStatement pre=DBConnection.con.prepareStatement("insert into productsa (fullname,userid,title,selecttype,description,url,qty,price) values (?,?,?,?,?,?,?,?)");
		pre.setString(1, bean.getFullname());
		pre.setInt(2, bean.getUserid());
		pre.setString(3, bean.getTitle());
		pre.setString(4, bean.getSelecttype());
		pre.setString(5,bean.getDescription());
		pre.setString(6, bean.getUrl());
		pre.setInt(7, bean.getQty());
		pre.setInt(8, bean.getPrice());
		int row=pre.executeUpdate();
		System.out.println(row+" row inserted in setproduct function");

	}
	
	
	
	//get the data of admin which should show admin and user 
	//user can not allow to show another data which can not add by admin itself
	//user can have buy functionality admin can have delete the product,change the qty,price 
	public ArrayList<SetDataBook> getAllDataA(int userid) throws SQLException{
		ArrayList<SetDataBook> arr=new ArrayList<SetDataBook>();
		PreparedStatement pre=DBConnection.con.prepareStatement("select * from productsa where userid =?");
		pre.setInt(1, userid);
		ResultSet r= pre.executeQuery();
		while(r.next()) {
			SetDataBook bean=new SetDataBook();
			bean.setFullname(r.getString("fullname"));
			bean.setTitle(r.getString("title"));
			bean.setUrl(r.getString("url"));
			bean.setSelecttype(r.getString("selecttype"));
			bean.setDescription(r.getString("description"));
			bean.setPrice(r.getInt("price"));
			bean.setQty(r.getInt("qty"));
			arr.add(bean);
		}
		return arr;
		
	}
	
	
	
	
}


