/**
 * �༭ѧ����Ϣ
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
import com.sxh.pojo.Student;

/**
 * Servlet implementation class EditStudent
 */
@WebServlet("/EditStudent")
public class EditStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		
		// request.getParameterXXXXX() ��Щ����ֻ�ܵõ�ͨ��GET��POST�����ύ���������ݡ�
		String studentId = request.getParameter("studentId");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String age = request.getParameter("age");
		String clazz = request.getParameter("clazz");
		
		
		int age1 = Integer.parseInt(age);
		
		System.out.println(age);
		
		Student student = new Student();
		student.setStudentId(studentId);
		student.setName(name);
		student.setSex(sex);
		student.setAge(age1);
		student.setClazz(clazz);
		
		Dao editDao = new DaoImpl();
		if (editDao.editStudent(student) == 1) {
			response.getWriter().write("success");
		}
		
	}

}
