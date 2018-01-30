package com.residence.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.residence.dao.DBManger;
import com.residence.entity.User;
import com.residence.service.ResidenceService;

public class Test {
	public static void main(String[] args) throws SQLException {
		DBManger db = new DBManger(); 
		Connection conn = db.openConnection();
		System.out.println(conn);
		db.closeConnection(conn);
//		ResidenceService rs = new ResidenceService();
//		User user = new User();
//		user.setUserName("admin");
//		user.setUserPwd("123");
//		rs.checkUser(user);
//		System.out.println(rs.checkUser(user));
	}

}
