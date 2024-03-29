package com.koreait.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.ActionTo;

public class UserFrontController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//흐름 나누기
		String requestURI = req.getRequestURI();// ???????/user/userjoin.us
		String contextPath = req.getContextPath();// ??????(web_module명)
		String command = requestURI.substring(contextPath.length());
		System.out.println(command);
		ActionTo transfer = null;
		
		switch(command) {
		case "/user/userjoin.us":
			transfer = new ActionTo();
			transfer.setPath("/app/user/joinview.jsp");
			transfer.setRedirect(false);
			break;
		case "/user/userlogin.us":
			transfer = new ActionTo();
			transfer.setPath("/app/user/loginview.jsp");
			transfer.setRedirect(false);
			break;
		case "/user/userjoinok.us":
			//처리
			try {
				transfer = new UserJoinOkAction().execute(req, resp);
			} catch (Exception e) {
				System.out.println("WARN:UserJoinOk : "+e);
			}
			break;
		case "/user/userloginok.us":
			try {
				new UserLoginOkAction().execute(req,resp);
			} catch (Exception e) {
				System.out.println("WARN:UserLoginOk : "+e);
			}
			break;
		case "/user/checkidok.us":
			try {
				new CheckIdOkAction().execute(req,resp);
			} catch (Exception e) {
				System.out.println("WARN:CheckIdOk : "+e);
			}
			break;
		case "/user/userlogout.us":
			req.getSession().removeAttribute("loginUser");
			transfer = new ActionTo();
			transfer.setPath("/");
			transfer.setRedirect(false);
			break;
		}
		
		//전송 일괄처리(어디인지, 어떤 방식인지는 몰라도 그냥 transfer라는 객체에 담겨있는 정보를 해석해서 그대로 페이지를 이동)
		if(transfer != null) {
			if(transfer.isRedirect()) {
				//Redirect 방식
				resp.sendRedirect(transfer.getPath());
			}
			else {
				//Forward 방식
				req.getRequestDispatcher(transfer.getPath()).forward(req, resp);
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		doGet(req, resp);
	}
	
	
}











