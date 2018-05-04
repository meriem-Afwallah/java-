package projetPoecMyTube;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VideoFormCreateServlet
 */
@WebServlet("/VideoCreate")
public class VideoFormCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VideoFormCreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("VideoCreate.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String title = request.getParameter("title");
		String url = request.getParameter("url");
		
		
		Map<String, String> validationErrors = new HashMap<>();
		
		if(title.isEmpty()||title.length()>100) {
			validationErrors.put("title", "titre invalide");
		}
		if(url.isEmpty()||url.length()>2000) {
			validationErrors.put("url", "URL invalide ");
		}
		
		if(! validationErrors.isEmpty()) {
			
			request.setAttribute("title", title);
			request.setAttribute("url", url);
			request.setAttribute("validationErrors", validationErrors);
			request.getRequestDispatcher("VideoCreate.jsp").forward(request, response);
			
		}else {
			
			request.setAttribute("video", VideoRepository.addVideo());
		}
		
	}

		
		
		
		
		
		
		

}
