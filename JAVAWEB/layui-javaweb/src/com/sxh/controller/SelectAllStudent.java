package com.sxh.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxh.dao.impl.DaoImpl;
import com.sxh.pojo.Vo;
// fastjson��������ȡjson����
import com.alibaba.fastjson.JSONObject;
import com.sxh.dao.Dao;

/**
 * Servlet implementation class SelectAllStudent
 */
@WebServlet("/SelectAllStudent")
public class SelectAllStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectAllStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request.getParameterXXXXX() ��Щ����ֻ�ܵõ�ͨ��GET��POST�����ύ���������ݡ�
		String pageStr = request.getParameter("page");
		String limitStr = request.getParameter("limit");
		
		Dao userDao = new DaoImpl();
		List<Object> listR = userDao.selectAllStudentList(pageStr, limitStr);
		
		response.setContentType("text/html; charset=utf-8");
		
		Vo vo = new Vo();
		vo.setCode(0);
		vo.setMsg("success");
		vo.setCount(userDao.countStudent());
		vo.setData(listR); 
		
		//���� ת JSON
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
