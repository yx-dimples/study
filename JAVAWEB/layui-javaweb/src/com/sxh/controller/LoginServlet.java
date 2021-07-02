/**
 * 登录
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
		 * 是采用请求转发方式，在跳转页面的时候是带着原来页面的request和response跳转的，
		 * request对象始终存在，不会重新创建。转发数据不会丢失，
		 * forward 就是转寄的意思，就是把客户端第一次请求在服务器内部完成，
		 * 带着之前的请求request 和服务器解析成response 一并转发过去。
		 * 说的通俗点就是之前的所有数据。
		 */
		 request.getRequestDispatcher("/WEB-INF/jsp/Login.jsp").forward(request, response);
	}

}
