package main.controll;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/maincontroll")
public class MainControll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String view = "/WEB-INF/jsp/index.jsp";
		//client -> Web Server -> 동적페이지 WAS  -> Web.xml mapping정보를 참조해서 servlet을 구동시킴
                                               // ㄴ dispatcher을 사용해서 jsp를 실행하여 was webserver client순서로 전달
                                               // ㄴ forward req(요청정보)/resp(응답정보)를 같이 전달해서 jsp파일이 동작하게 도와줌
		request.getRequestDispatcher(view).forward(request, response);
	}

}
