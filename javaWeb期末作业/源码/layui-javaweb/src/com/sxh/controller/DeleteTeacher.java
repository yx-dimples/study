/**
 * ɾ��ѧ����Ϣ
 */
package com.sxh.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxh.dao.Dao;
import com.sxh.dao.impl.DaoImpl;
import com.sxh.pojo.Teacher;


/**
 * Servlet implementation class DeleteAll
 */
@WebServlet("/DeleteTea")
public class DeleteTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request.setCharacterEncoding("UTF-8")�����������öԿͻ�������������±���ı��롣
		request.setCharacterEncoding("utf-8");
		// response.setCharacterEncoding(��UTF-8��)��������ָ����������Ӧ��������ı���
		response.setCharacterEncoding("utf-8");
		// response.setContentType(��text/html;charset=utf-8��)��������ָ����������Ӧ��������ı��롣
		// ͬʱ�������Ҳ�Ǹ������������������յ������ݽ������±��루���߳�Ϊ���룩
		response.setContentType("text/html; charset=utf-8");
		
		Dao  dao = new DaoImpl();
		// request.getParameterXXXXX() ��Щ����ֻ�ܵõ�ͨ��GET��POST�����ύ���������ݡ�
		String id=request.getParameter("teacherId");
		
		
		Teacher teacher = new Teacher();
		teacher.setTeacherId(id);
		
		try {
			dao.deleTea(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
