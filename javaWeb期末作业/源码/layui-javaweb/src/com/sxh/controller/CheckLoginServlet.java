/**
 * 登录功能
 */
package com.sxh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sxh.dao.Dao;
import com.sxh.dao.impl.DaoImpl;
import com.sxh.pojo.Admin;

/**
 * Servlet implementation class CheckLoginServlet
 */
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		// request.getParameterXXXXX() 这些方法只能得到通过GET，POST方法提交过来的数据。
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		
		HttpSession session = request.getSession();
		 //将数据存储到session中
		session.removeAttribute("code");
		
		Admin admin = new Admin();
		admin.setName(name);
		admin.setPassword(password);
	
		
		Dao dao = new DaoImpl();
		try {
			
			if (dao.queryByParams(admin) != null) {
				request.setAttribute("name", name);
				request.setAttribute("password", password);
				request.getRequestDispatcher("/WEB-INF/jsp/MainForm.jsp").forward(request, response);
			}else {
				request.setAttribute("inf", "你的账号或密码错误，请确认账号密码登录");
				request.getRequestDispatcher("/WEB-INF/jsp/Login.jsp").forward(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
