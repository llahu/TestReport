package jdbc;
import java.sql.*;
public class JdbcConn {
	//�����������ݿ��·��
	private  static String url="jdbc:oracle:thin:@172.16.254.185:1521:AHUSERVICE";
	//���ݿ���û���������
	private static String user="CS2013";
	private static String password="m123";
	//����һ�����ݿ������
	public static Connection conn;//���ض����ݿ�����ӣ��Ự������������������ִ�� SQL ��䲢���ؽ����
	public static PreparedStatement ps;
	public static ResultSet rs;//��ʾ���ݿ����������ݱ�ͨ��ͨ��ִ�в�ѯ���ݿ��������ɡ� 
	public static Statement st;//����ִ�о�̬ SQL ��䲢�����������ɽ���Ķ���
	
	//����һ���������ݿ�ķ���
	public static Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//�������ݿ������
			conn=DriverManager.getConnection(url,user,password);//�������ݿ�
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
