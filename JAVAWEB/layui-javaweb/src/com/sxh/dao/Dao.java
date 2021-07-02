package com.sxh.dao;

import java.util.List;

import com.sxh.pojo.Admin;
import com.sxh.pojo.Student;
import com.sxh.pojo.Teacher;

public interface Dao {

	// 查询s_admin表（登录页面使用）
	public Admin queryByParams(Admin admin);
	
	// 删除学生信息
	public int deleteStu (String studentId) ;
	// 删除教师信息
	public int deleTea (String teacherId);
	
	// 添加教师
	public int addTeacher(Teacher teacher);
	// 添加学生
	public int addStudent(Student student);		
	
	//返回老师有多少条
	public int countTeacher();

	//分页查询所有老师
	public List<Object> selevtAllTeacherList(String page, String limit);
	
	//返回学生有多少条
	public int countStudent();

	//分页查询所有学生
	public List<Object> selectAllStudentList(String page, String limit);
	
	// 修改教师
	public int editTeacher(Teacher teacher);
	// 修改学生
	public int editStudent(Student student);
	

}
