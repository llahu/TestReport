package jdbc;
import java.sql.*;
public class JdbcConn {
	//设置连接数据库的路径
	private  static String url="jdbc:oracle:thin:@172.16.254.185:1521:AHUSERVICE";
	//数据库的用户名和密码
	private static String user="CS2013";
	private static String password="m123";
	//建立一个数据库的连接
	public static Connection conn;//与特定数据库的连接（会话）。在连接上下文中执行 SQL 语句并返回结果。
	public static PreparedStatement ps;
	public static ResultSet rs;//表示数据库结果集的数据表，通常通过执行查询数据库的语句生成。 
	public static Statement st;//用于执行静态 SQL 语句并返回它所生成结果的对象。
	
	//创建一个连接数据库的方法
	public static Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//加载数据库的驱动
			conn=DriverManager.getConnection(url,user,password);//连接数据库
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
