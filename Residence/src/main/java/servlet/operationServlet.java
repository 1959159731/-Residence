package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servers.PopulationService;

public class operationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");		
		String pId = request.getParameter("r1");
		System.out.println(pId);
		PopulationService ps = new PopulationService();
		boolean bool  = ps.pSelect(pId);
		System.out.println(bool);
		
		response.getWriter().print(bool?1:0);
		response.getWriter().flush();
	}

}
