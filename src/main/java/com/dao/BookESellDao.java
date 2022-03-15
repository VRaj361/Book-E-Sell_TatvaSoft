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
		PreparedStatement pre=DBConnection.con.prepareStatement("insert into users (fullname,username,password,roleid) values(?,?,?,2)");
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
	
	
	public AddLoginDatabean CheckData(AddLoginDatabean bean) throws SQLException {
		AddLoginDatabean b=new AddLoginDatabean();
		PreparedStatement pre=DBConnection.con.prepareStatement("select userid,roleid from users where username=? and password=?");
		pre.setString(1,bean.getUsername());
		pre.setString(2, bean.getPassword());
		ResultSet r=pre.executeQuery();
		int count=0;
		
		if(r.next()) {
			count++;
			b.setUserid(r.getInt("userid"));
			b.setRoleid(r.getInt("roleid"));
		}
		if(count==1) {
			return b;
		}
		return b;
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
		PreparedStatement pre=DBConnection.con.prepareStatement("select * from productsa  where userid =? ");
		//admin can show that data using only the data of roleid 
//		PreparedStatement pre=DBConnection.con.prepareStatement("select * from productsa inner join users on productsa.userid=users.userid  where users.userid=?");
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
			bean.setProductid(r.getInt("productid"));
			arr.add(bean);
		}
		return arr;
		
	}
	
	
	public ArrayList<SetDataBook> getAllDataU() throws SQLException{
		ArrayList<SetDataBook> arr=new ArrayList<SetDataBook>();
		PreparedStatement pre=DBConnection.con.prepareStatement("select * from productsa inner join users on productsa.userid=users.userid inner join role on role.roleid=users.roleid  where rolename=? ");
		//admin can show that data using only the data of roleid 
//		PreparedStatement pre=DBConnection.con.prepareStatement("select * from productsa inner join users on productsa.userid=users.userid  where users.userid=?");
		pre.setString(1, "admin");
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
			bean.setProductid(r.getInt("productid"));
			arr.add(bean);
		}
		return arr;
		
	}
	
	
	
	
	
	
	public ArrayList<SetDataBook> getAllDataAM(int productid) throws SQLException{
		ArrayList<SetDataBook> arr=new ArrayList<SetDataBook>();
		PreparedStatement pre=DBConnection.con.prepareStatement("select * from productsa where productid =?");
		pre.setInt(1, productid);
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
			bean.setProductid(r.getInt("productid"));
			arr.add(bean);
		}
		return arr;
		
	}
	
	
	public void modifyData(SetDataBook bean) throws SQLException{
		
		PreparedStatement pre=DBConnection.con.prepareStatement("update productsa set fullname=?,title=?,description=?,url=?,price=?,qty=?  where productid=?");
		pre.setString(1,bean.getFullname());
		pre.setString(2,bean.getTitle());
		pre.setString(3, bean.getDescription());
		pre.setString(4,bean.getUrl());
		pre.setInt(5, bean.getPrice());
		pre.setInt(6,bean.getQty());
		pre.setInt(7, bean.getProductid());
//		pre.setInt(1, productid);
		int row= pre.executeUpdate();
		System.out.println(row+" row updated");
		
		
	}
	
	
	
	
}


