package jsp.controll;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp_script")
public class JspControll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//maincontroll에 연결된 jsp파일을 사용하여 링크이동할 새로운 controll과 jsp파일 생성
		String view = "/WEB-INF/jsp/jsp_script.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}
}
