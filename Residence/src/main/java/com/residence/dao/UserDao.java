package com.residence.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.residence.entity.User;

public class UserDao extends DBManger{
	
	public User loadUser(User user) throws SQLException{
		User u=null;
		String sql="select * from users where userName=? and userPwd=?";
		Object[] obs= {user.getUserName(),user.getUserPwd()};
		Connection conn=this.openConnection();
		ResultSet rs=this.query(conn, sql, obs);
		if(rs.next()) {
			u=new User();
			u.setUserId(rs.getInt("userId"));
			u.setUserName(rs.getString("userName"));
			u.setUserPwd(rs.getString("userPwd"));
			u.setUserRole(rs.getBoolean("userRole"));
		}
		this.closeConnection(conn);
		return u;
	}
	
}

