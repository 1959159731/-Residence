package com.residence.service;

import java.sql.SQLException;

import com.residence.dao.UserDao;
import com.residence.entity.User;

public class ResidenceService {
	public boolean checkUser(User user) {
		boolean bool = false;
		UserDao ud = new UserDao();
		try {
			//����UserDao�еķ���
			User u = ud.loadUser(user);
			//���u��Ϊ�����ҵ����ˣ���bool��true
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
