package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Trans;

import jdbc.JdbcConn;

public class Services {
	private Connection dbconnection;//数据库的连接
	private Statement st;//执行sql语句
	private ResultSet rs;//用于存放数据的容器
	private String sql;
	private List list;
	private Trans ts;
	public List getTrans(){
		list=new ArrayList();
		//获得数据库的连接
		dbconnection=JdbcConn.getConnection();
		//合成SQL语句和执行Sql语句
		try {
			st=(Statement)dbconnection.createStatement();
			sql="select tb_trans_collection.bk bk,tb_trans_collection.ua ua,"+ 
					"tb_trans_collection.ub ub,tb_trans_collection.uc uc from "+
					"tb_trans_collection order by  tb_trans_collection.bk";
			rs=st.executeQuery(sql);//执行sql语句
			//遍历rs中的元素
			while(rs.next()){
				ts=new Trans();//注意每一次必须要new一个Trans对象
				//依次设置值
				ts.setBk(rs.getString("bk"));
				ts.setUa(rs.getDouble("ua"));
				ts.setUb(rs.getDouble("ub"));
				ts.setUc(rs.getDouble("uc"));
				
				list.add(ts);//向容器中添加元素
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}
