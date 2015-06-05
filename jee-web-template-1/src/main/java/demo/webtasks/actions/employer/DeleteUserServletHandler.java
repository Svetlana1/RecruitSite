package demo.webtasks.actions.employer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.webtasks.actions.AbstractWebtasksServletHandler;
import demo.webtasks.dao.DAOManagerUser;


public class DeleteUserServletHandler extends AbstractWebtasksServletHandler {
	private static final long serialVersionUID = 1L;
       
  
    public DeleteUserServletHandler() {
        super();
       
    }


	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		new DAOManagerUser().delete(new Integer(request.getParameter("id")));
		redirectRequest("/admin/home.php", request, response);
		
	}

	


}
