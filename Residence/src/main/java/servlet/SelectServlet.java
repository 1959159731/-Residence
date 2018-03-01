package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servers.PopulationService;
import table.Population;

public class SelectServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");		
		String pId = req.getParameter("r");		
		PopulationService ps = new PopulationService();
		boolean bool  = ps.pSelect(pId);
		System.out.println(bool);
		
		resp.getWriter().print(bool?1:0);
		resp.getWriter().flush();
			
	}

}
