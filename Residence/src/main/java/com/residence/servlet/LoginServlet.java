package com.residence.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.residence.entity.User;
import com.residence.service.ResidenceService;

public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//����ǰ��������ַ���
		req.setCharacterEncoding("utf-8");
		//�õ��û������userName��userPwd
		String userName = req.getParameter("userName");
		String userPwd = req.getParameter("userPwd");
		ResidenceService rs = new ResidenceService();
		
		//���û������userName��userPwd��װ��User����
		User user = new User();
		user.setUserName(userName);
		user.setUserPwd(userPwd);
		
		//����service���checkUser()���� ����Boolean���͵�ֵ
		boolean bool = rs.checkUser(user);
		//����ѯ�������ǰ�� ��ѯ�ɹ����� 1 ���� Ϊ0
		resp.getWriter().println(bool?"1":"0");
		//ˢ��
		resp.getWriter().flush();
	}
}
