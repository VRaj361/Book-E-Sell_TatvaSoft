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
		PreparedStatement pre=DBConnection.con.prepareStatement("insert into productsa (fullname,userid,title,selecttype,description,url,qty,price,discount,oprice) values (?,?,?,?,?,?,?,?,?,?)");
		pre.setString(1, bean.getFullname());
		pre.setInt(2, bean.getUserid());
		pre.setString(3, bean.getTitle());
		pre.setString(4, bean.getSelecttype());
		pre.setString(5,bean.getDescription());
		pre.setString(6, bean.getUrl());
		pre.setInt(7, bean.getQty());
		pre.setInt(8, bean.getPrice());
		pre.setInt(9, bean.getDiscount());
		pre.setInt(10, bean.getOprice());
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
			bean.setDiscount(r.getInt("discount"));
			bean.setOprice(r.getInt("oprice"));
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
			bean.setDiscount(r.getInt("discount"));
			bean.setOprice(r.getInt("oprice"));
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
			bean.setDiscount(r.getInt("discount"));
			bean.setOprice(r.getInt("oprice"));
			arr.add(bean);
		}
		return arr;
		
	}
	
	
	public void modifyData(SetDataBook bean) throws SQLException{
		
		PreparedStatement pre=DBConnection.con.prepareStatement("update productsa set fullname=?,title=?,description=?,url=?,price=?,qty=?,discount=?,oprice=?  where productid=?");
		System.out.println(bean.getDiscount()+" discount");
		pre.setString(1,bean.getFullname());
		pre.setString(2,bean.getTitle());
		pre.setString(3, bean.getDescription());
		pre.setString(4,bean.getUrl());
		pre.setInt(5, bean.getPrice());
		pre.setInt(6,bean.getQty());
		pre.setInt(7, bean.getDiscount());
		pre.setInt(8, bean.getOprice());
		pre.setInt(9, bean.getProductid());
//		pre.setInt(1, productid);
		int row= pre.executeUpdate();
		System.out.println(row+" row updated");
		
		
	}
	public void addToCartData(int productid,int userid) throws SQLException{
		PreparedStatement pre=DBConnection.con.prepareStatement("select * from productsa where productid=?");
		pre.setInt(1, productid);
		ResultSet s=pre.executeQuery();
		SetDataBook bean=new SetDataBook();
		while(s.next()) {
			bean.setUserid(s.getInt("userid"));
			bean.setProductid(s.getInt("productid"));
			bean.setTitle(s.getString("title"));
			bean.setDescription(s.getString("description"));
			bean.setDiscount(s.getInt("discount"));
			bean.setPrice(s.getInt("price"));
			bean.setOprice(s.getInt("oprice"));
			bean.setQty(s.getInt("qty"));
			bean.setUrl(s.getString("url"));
//			bean.setUseridu(s.getInt("useridu"));
		}
		System.out.println("done bean fetch");
		PreparedStatement pre1=DBConnection.con.prepareStatement("insert into productsu (userid,productid,title,description,priceo,priced,discount,url) values (?,?,?,?,?,?,?,?)");
		pre1.setInt(1, userid);
		pre1.setInt(2, bean.getProductid());
		pre1.setString(3, bean.getTitle());
		pre1.setString(4, bean.getDescription());
		
		pre1.setInt(5, bean.getOprice());
		pre1.setInt(6, bean.getPrice());
		pre1.setInt(7, bean.getDiscount());
		pre1.setString(8, bean.getUrl());
		
		int row=pre1.executeUpdate();
		System.out.println(row+" inserted in productsu table");
//		return bean.getUseridu();
	}
	
	
	public ArrayList<SetDataBook> addToCartShow(int userid) throws SQLException{
		ArrayList<SetDataBook> arr=new ArrayList<SetDataBook>();
		PreparedStatement pre=DBConnection.con.prepareStatement("select * from productsu where userid=?");
		pre.setInt(1,userid);
		ResultSet s=pre.executeQuery();
		
		while(s.next()) {
			SetDataBook bean=new SetDataBook();
			
			bean.setTitle(s.getString("title"));
			bean.setUrl(s.getString("url"));
			bean.setDescription(s.getString("description"));
			bean.setPrice(s.getInt("priced"));
			bean.setQty(s.getInt("qty"));
			bean.setProductid(s.getInt("productid"));
			bean.setDiscount(s.getInt("discount"));
			bean.setOprice(s.getInt("priceo"));
			bean.setUseridu(s.getInt("useridu"));
			arr.add(bean);
		}
		return arr;
		
		
	}
	
	
	public int ModifyCart(int productid,int qty) throws SQLException{
		PreparedStatement pre=DBConnection.con.prepareStatement("select qty,price,oprice from productsa where productid=? ");
		pre.setInt(1, productid);
		ResultSet s=pre.executeQuery();
		int updated=-1;
		int price=-1;
		int priceo=-1;
		while(s.next()) {
			price=s.getInt("price");
			priceo=s.getInt("oprice");
			if(s.getInt("qty")>=qty) {
				updated=s.getInt("qty")-qty;
			}else {
				System.out.println("overprice");
				return qty-s.getInt("qty");
			}
		}
		PreparedStatement pre1=DBConnection.con.prepareStatement("update productsa set qty=?  where productid=? ");
		pre1.setInt(1, updated);
		pre1.setInt(2, productid);
		int row=pre1.executeUpdate();
		
		System.out.println(row+ "update in modifycart in admin");
		
		//qty,price
		
		PreparedStatement pre2=DBConnection.con.prepareStatement("update productsu set qty=?,priced=?,priceo=?  where productid=? ");
		pre2.setInt(1, qty);
		pre2.setInt(2, qty*price);
		pre2.setInt(3, qty*priceo);
		pre2.setInt(4, productid);
		int row1=pre2.executeUpdate();
		System.out.println(row1+ " update in modifycart in user");
		
		
		return 1;
		
	}
	
	public void removeDataCart(int useridu) throws SQLException {
		System.out.println("removedatacart");
		PreparedStatement pre=DBConnection.con.prepareStatement("delete from productsu where useridu=?");
		pre.setInt(1, useridu);
		
		int row =pre.executeUpdate();
		System.out.println(row+" Row deleted");
		
		
	}
	
	
}


