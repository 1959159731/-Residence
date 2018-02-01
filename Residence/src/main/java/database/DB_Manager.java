package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DB_Manager {
	
	private  ThreadLocal<Connection> threadlocal = new ThreadLocal<Connection>();
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {			 
			e.printStackTrace();
		}	
	}
	
	//创建连接
	public Connection openConnection() throws SQLException {
		String url="jdbc:mysql://localhost:3306/work?useSSL=true";
		return DriverManager.getConnection(url,"root","1234");		
	}
	
	//关闭连接
	public void closeConnection(Connection conn) throws SQLException {
		 if(conn!= null && !conn.isClosed()) {
				conn.close();
		}
	}
	
	
	public int update(Connection conn,String sql,Object...obs)throws SQLException {
		int count=0;
		if(conn!=null && !conn.isClosed()) {
			PreparedStatement psment=conn.prepareStatement(sql);
			if(obs!=null) {
				for (int i = 0; i < obs.length; i++) {
					psment.setObject(i+1, obs[i]);
				}
			}
			count=psment.executeUpdate();
		}
		return count;
	}

	public ResultSet query(Connection conn,String sql,Object...obs)throws SQLException {
		ResultSet rs=null;
		if(conn!=null && !conn.isClosed()) {
			PreparedStatement psment=conn.prepareStatement(sql);
			if(obs!=null) {
				for (int i = 0; i < obs.length; i++) {
					psment.setObject(i+1, obs[i]);
				}
			}
			rs=psment.executeQuery();
		}
		return rs;
	}
	
}
