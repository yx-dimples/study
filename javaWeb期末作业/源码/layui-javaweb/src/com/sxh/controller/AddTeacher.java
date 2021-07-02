/**
 * 添加教师
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
 * Servlet implementation class addTeacher
 */
@WebServlet("/addTeacher")
public class AddTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeacher() {
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
		// request.setCharacterEncoding("UTF-8")的作用是设置对客户端请求进行重新编码的编码。
		request.setCharacterEncoding("utf-8");
		// response.setCharacterEncoding(“UTF-8”)的作用是指定服务器响应给浏览器的编码
		response.setCharacterEncoding("utf-8");
		// response.setContentType(“text/html;charset=utf-8”)的作用是指定服务器响应给浏览器的编码。
		// 同时，浏览器也是根据这个参数来对其接收到的数据进行重新编码（或者称为解码）
		response.setContentType("text/html; charset=utf-8");
		// request.getParameterXXXXX() 这些方法只能得到通过GET，POST方法提交过来的数据。
		
		String teacherId = request.getParameter("teacherId");
		String tname = request.getParameter("tname");
		String tsex = request.getParameter("tsex");
		String tage = request.getParameter( "tage");
		String tdept = request.getParameter("tdept");
		String tel = request.getParameter("tel");
		String qQ = request.getParameter("qQ");
		String professional = request.getParameter("professional");
		
		int tage1 = Integer.parseInt(tage);
		int qQ1 = Integer.parseInt(qQ);
		int tel1 = Integer.parseInt(tel);
		
		
		Teacher teacher = new Teacher();
		teacher.setProfessional(professional);
		teacher.setQQ(qQ1);
		teacher.setTage(tage1);
		teacher.setTdept(tdept);
		teacher.setTel(tel1);
		teacher.setTname(tname);
		teacher.setTeacherId(teacherId);
		teacher.setTsex(tsex);
	
		
		Dao addDao = new DaoImpl();
		
		if (addDao.addTeacher(teacher) == 1) {
			// response.getWriter().write() 功能：向前台页面显示一段信息。
			response.getWriter().write("success");
		}
	}

}
