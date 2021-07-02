package com.sxh.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.sxh.dao.Dao;
import com.sxh.dao.impl.DaoImpl;
import com.sxh.pojo.Vo;

/**
 * Servlet implementation class SelectAllTeacher
 */

public class SelectAllTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectAllTeacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request.getParameterXXXXX() 这些方法只能得到通过GET，POST方法提交过来的数据。
		String pageStr = request.getParameter("page");
		String limitStr = request.getParameter("limit");
				
		Dao userDao = new DaoImpl();
		List<Object> listR = userDao.selevtAllTeacherList(pageStr, limitStr);
		response.setContentType("text/html; charset=utf-8");
		Vo vo = new Vo();
		vo.setCode(0);
		vo.setMsg("Success");
		vo.setCount(userDao.countTeacher());
		vo.setData(listR);
		response.getWriter().write(JSONObject.toJSON(vo).toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
