package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servers.OperationService;
import table.Operation;

public class saveServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String oGoDate = request.getParameter("oGoDate");
		String oNnuboer = request.getParameter("oNnuboer");
		String pId = request.getParameter("pId");
		String oToDate = request.getParameter("oToDate");
		String oAddress = request.getParameter("oAddress");
		
		Operation o = new Operation();
		o.setoGoDate(oGoDate);
		o.setoNnuboer(oNnuboer);
		o.setpId(pId);
		o.setoToDate(oToDate);
		o.setoAddress(oAddress);
		
		OperationService os = new OperationService();
		boolean bool = os.oSave(o);
		response.sendRedirect(bool?"3.html":"error.html");
	}
}
