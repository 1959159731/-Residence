package com.residence.service;

import java.sql.SQLException;

import com.residence.dao.UserDao;
import com.residence.entity.User;

public class ResidenceService {
	public boolean checkUser(User user) {
		boolean bool = false;
		UserDao ud = new UserDao();
		try {
			//调用UserDao中的方法
			User u = ud.loadUser(user);
			//如果u不为空则找到此人，给bool置true
			if(u !=null) {
				bool = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}
}
