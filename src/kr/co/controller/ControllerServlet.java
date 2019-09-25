package kr.co.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class ControllerServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		
		CommandInter inter = null;
		String viewName = "/WEB-INF/views/";
		
		try {
			if(command.equals("sangpum")) {
				inter = SangpumImpl.instance();
				viewName += inter.execute(request, response);
				request.getRequestDispatcher(viewName).forward(request, response);
			} else if(command.equals("gogek")) {
//				inter = GogekImpl.instance();
//				viewName += inter.execute(request, response);
			} else if(command.equals("jikwon")) {
//				inter = JikwonImpl.instance();
//				viewName += inter.execute(request, response);
			} else {
				viewName = "error.html";
				response.sendRedirect(viewName);
			}
		} catch (Exception e) {
			System.out.println("ControllerServlet err : " + e);
		}
	}
}