/**
 * ��¼
 */
package com.sxh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * �ǲ�������ת����ʽ������תҳ���ʱ���Ǵ���ԭ��ҳ���request��response��ת�ģ�
		 * request����ʼ�մ��ڣ��������´�����ת�����ݲ��ᶪʧ��
		 * forward ����ת�ĵ���˼�����ǰѿͻ��˵�һ�������ڷ������ڲ���ɣ�
		 * ����֮ǰ������request �ͷ�����������response һ��ת����ȥ��
		 * ˵��ͨ�׵����֮ǰ���������ݡ�
		 */
		 request.getRequestDispatcher("/WEB-INF/jsp/Login.jsp").forward(request, response);
	}

}
