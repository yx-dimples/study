/**
 * ��¼����
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
		// request.getParameterXXXXX() ��Щ����ֻ�ܵõ�ͨ��GET��POST�����ύ���������ݡ�
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		
		HttpSession session = request.getSession();
		 //�����ݴ洢��session��
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
				request.setAttribute("inf", "����˺Ż����������ȷ���˺������¼");
				request.getRequestDispatcher("/WEB-INF/jsp/Login.jsp").forward(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
