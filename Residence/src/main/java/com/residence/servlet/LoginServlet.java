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
		//设置前端请求的字符集
		req.setCharacterEncoding("utf-8");
		//得到用户输入的userName和userPwd
		String userName = req.getParameter("userName");
		String userPwd = req.getParameter("userPwd");
		ResidenceService rs = new ResidenceService();
		
		//将用户输入的userName和userPwd封装成User对象
		User user = new User();
		user.setUserName(userName);
		user.setUserPwd(userPwd);
		
		//调用service层的checkUser()方法 返回Boolean类型的值
		boolean bool = rs.checkUser(user);
		//将查询结果返回前端 查询成功返回 1 否则 为0
		resp.getWriter().println(bool?"1":"0");
		//刷新
		resp.getWriter().flush();
	}
}
