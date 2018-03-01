package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servers.OperationService;
import table.Population;
 
public class PUpdateServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
	
		Population p = new Population();
		p.setpName(request.getParameter("pName"));
		p.setpDate(request.getParameter("pDate"));
		p.setpId(request.getParameter("pId"));
		p.setpAddress(request.getParameter("pAddress"));
		p.setpHRType(request.getParameter("pHRType"));
		p.setpUsedName(request.getParameter("pUsedName"));
		p.setpHeight(Double.parseDouble(request.getParameter("pHeight")));
		p.setpRelation(request.getParameter("pRelation"));
		p.setpSex(request.getParameter("pSex"));
		p.setpBType(request.getParameter("pBType"));
		p.setpBornPlace(request.getParameter("pBornPlace"));
		p.setpNation(request.getParameter("pNation"));
		p.setpNativePlace(request.getParameter("pNativePlace"));
		p.setpBirthday(request.getParameter("pBirthday"));  
		p.setpDegree(request.getParameter("pDegree"));
		p.setpMarry(request.getParameter("pMarry"));
		p.setpMilitary(request.getParameter("pMilitary"));
		p.setpJob(request.getParameter("pJob"));
		p.setpReligions(request.getParameter("pReligions"));
		p.setpOtherAdd(request.getParameter("pOtherAdd"));
	
		OperationService os = new OperationService();
		boolean bool = os.oUpdate(p);
		response.getWriter().print(bool?1:0);
		response.getWriter().flush();
		 
	}

}
