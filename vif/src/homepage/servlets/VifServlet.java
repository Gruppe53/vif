package homepage.servlets;

import homepage.database.DBManager;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/VifServlet")
public class VifServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public void init(ServletConfig config) throws ServletException {
    	System.out.println("** INIT::VifServlet **");
    	
    	super.init(config);
    	
    	DBManager dba = new DBManager();
		dba.setDbUrl(config.getInitParameter("dbUrl"));
		dba.setDbUser(config.getInitParameter("dbUser"));
		dba.setDbPass(config.getInitParameter("dbPass"));

    	
		ServletContext context = config.getServletContext();
		context.setAttribute("base", config.getInitParameter("base"));
		context.setAttribute("imgUrl", config.getInitParameter("imgUrl"));
		context.setAttribute("dbManager", dba);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
