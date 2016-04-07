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
	private Connection dbconnection;//���ݿ������
	private Statement st;//ִ��sql���
	private ResultSet rs;//���ڴ�����ݵ�����
	private String sql;
	private List list;
	private Trans ts;
	public List getTrans(){
		list=new ArrayList();
		//������ݿ������
		dbconnection=JdbcConn.getConnection();
		//�ϳ�SQL����ִ��Sql���
		try {
			st=(Statement)dbconnection.createStatement();
			sql="select tb_trans_collection.bk bk,tb_trans_collection.ua ua,"+ 
					"tb_trans_collection.ub ub,tb_trans_collection.uc uc from "+
					"tb_trans_collection order by  tb_trans_collection.bk";
			rs=st.executeQuery(sql);//ִ��sql���
			//����rs�е�Ԫ��
			while(rs.next()){
				ts=new Trans();//ע��ÿһ�α���Ҫnewһ��Trans����
				//��������ֵ
				ts.setBk(rs.getString("bk"));
				ts.setUa(rs.getDouble("ua"));
				ts.setUb(rs.getDouble("ub"));
				ts.setUc(rs.getDouble("uc"));
				
				list.add(ts);//�����������Ԫ��
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}
