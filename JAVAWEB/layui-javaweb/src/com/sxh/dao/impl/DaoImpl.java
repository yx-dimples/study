package com.sxh.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sxh.dao.Dao;
import com.sxh.pojo.Admin;
import com.sxh.pojo.Student;
import com.sxh.pojo.Teacher;
import com.sxh.utils.C3P0Util;

public class DaoImpl implements Dao{
	
	//  对象代表与数据库的连接，也就是在已经加载的Driver 和数据库之间建立连接。
	Connection conn = null; 
	
	Statement stm = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	// 查询s_admin表（登录页面使用）
	@Override
	public Admin queryByParams(Admin admin) {
		//获取连接对象
		conn = C3P0Util.getConnection();
		/*
		 * 查询数据库的SQL语句，就是从s_admin这张数据表中查询出与你的条件“name和password”相匹配的数据。
		 */
		try {
			String sql = "SELECT * FROM s_admin WHERE "
	                + "name='" + admin.getName() + "' AND "
	                + "password='" + admin.getPassword() +"'";
			
			//获取执行SQL语句的PreparedStatement对象
			//执行SQL语句
			ps = conn.prepareStatement(sql);

			// executeQuery()方法会把数据库响应的查询结果存放在ResultSet类对象中供使用。
			rs = ps.executeQuery();
			
			 //就是 将rs全部进行读取
			while (rs.next()) {
				admin = new Admin(rs.getString("name"), rs.getString("password"));
			}
			
			//CreateStatement方法创建了stm对象，再通过他查询的一部分语句片段。
			stm = conn.createStatement();
			
			rs = stm.executeQuery(sql.toString());
			
			 //rs进行读取一次 判断是否有数据
			if(rs.next()) {
				return admin;
			}
			else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			C3P0Util.release(rs, stm, conn);
		}
		return admin;
	}

	// 删除学生信息
	@Override
	public int deleteStu(String studentId) {
		
		int rs;
		
		conn = C3P0Util.getConnection();
		
		try {
			/*
			 * 删除表中的数据  关键字 delete from 表名 where 筛选条件
			 */
			String sql = "DELETE FROM studentinfo WHERE studentId = " + studentId;
			
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeUpdate();
			
			if (rs==1) {
				return 1;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			C3P0Util.release( stm, conn);
		}
		
		return 0;
	}

	// 删除教师信息
	@Override
	public int deleTea(String teacherId) {
		
		int rs;
		
		conn = C3P0Util.getConnection();
		
		try {
			/*
			 * 删除表中的数据  关键字 delete from 表名 where 筛选条件
			 */
			String sql = "DELETE FROM teacherinfo WHERE teacherId = " + teacherId;
			ps = conn.prepareStatement(sql);
			// 是当成功插入数据到数据库时候，这个会返回一个大于1的数字，来表明数据成功插入库之中
			rs = ps.executeUpdate();
			
			if (rs==1) {
				return 1;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			C3P0Util.release(stm, conn);
		}
		
		return 0;
	}

	
	// 添加教师
	@Override
	public int addTeacher(Teacher teacher) {
		
		int rs;
		conn = C3P0Util.getConnection();
		
		
		
		try {
			
			/*
			 * 向数据中插入数据 insert into用法
			 */
			
			String sql = "insert into teacherinfo (teacherId,tname,tage,tsex,tdept,tel,QQ,professional) values(?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, teacher.getTeacherId());
			ps.setString(2, teacher.getTname());
			ps.setInt(3, teacher.getTage());
			ps.setString(4, teacher.getTsex());
			ps.setString(5, teacher.getTdept());
			ps.setInt(6, teacher.getTel());
			ps.setInt(7, teacher.getQQ());
			ps.setString(8, teacher.getProfessional());
			
			rs = ps.executeUpdate();
			
			if (rs==1) {
				return 1;
			}
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			C3P0Util.release(stm, conn);
		}
		
		return 0;
	}

	
	// 添加学生
	@Override
	public int addStudent(Student student) {
		
		int rs;
		
		conn = C3P0Util.getConnection();
		
		try {
			
			/*
			 * 向数据中插入数据 insert into用法
			 */
			
			String sql = "insert into studentinfo (studentId,name,sex,age,clazz) values(?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, student.getStudentId());
			ps.setString(2, student.getName());
			ps.setString(3, student.getSex());
			ps.setInt(4, student.getAge());
			ps.setString(5, student.getClazz());
			
			rs = ps.executeUpdate();
			
			if(rs == 1) {
				return 1;
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			C3P0Util.release(stm, conn);
		}
		return 0;
	}

	
	//返回老师有多少条
	@Override
	public int countTeacher() {
		
		conn = C3P0Util.getConnection();
		
		try {
			
			/*
			 * select count(*) from 表名 这个是查询表的所有记录数
			 */
			
			String sql = "SELECT COUNT(*) as sum FROM teacherinfo";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				return rs.getInt("sum");
			
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			C3P0Util.release(rs, stm, conn);
		}
		return 0;
	}

	//分页查询所有老师
	@Override
	public List<Object> selevtAllTeacherList(String page, String limit) {
		
		conn = C3P0Util.getConnection();
		
		try {
			
			/*
			 * 原生Limit分页就是在编写sql语句时需要自己加上limit关键字，然后传入分页参数进行分页
			 */
			
			String sql = "SELECT * FROM teacherinfo LIMIT ?,?";
			ps = conn.prepareStatement(sql);
			int page1 = Integer.parseInt(page);
			int limit1 = Integer.parseInt(limit);
			ps.setInt(1, (page1-1)*limit1);
			ps.setInt(2, limit1);
			rs = ps.executeQuery();
			ArrayList<Object> list = new ArrayList<Object>();
			while(rs.next()) {
				Teacher teacher = new Teacher();
				teacher.setTeacherId(rs.getString("teacherId"));
				teacher.setTname(rs.getString("tname"));
				teacher.setTage(rs.getInt("tage"));
				teacher.setTsex(rs.getString("tsex"));
				teacher.setTdept(rs.getString("tdept"));
				teacher.setTel(rs.getInt("tel"));
				teacher.setQQ(rs.getInt("QQ"));
				teacher.setProfessional(rs.getString("professional"));
				list.add(teacher);
			}
			
			return list;
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			C3P0Util.release(rs, stm, conn);
		}
		
		return null;
	}

	
	//返回学生有多少条
	@Override
	public int countStudent() {
		
		conn = C3P0Util.getConnection();
		
		try {
			
			/*
			 * select count(*) from 表名 这个是查询表的所有记录数
			 */
			
			String sql = "SELECT COUNT(*) as sum FROM studentInfo";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				return rs.getInt("sum");
			
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			C3P0Util.release(rs, stm, conn);
		}
		return 0;
	}
	
	//分页查询所有学生

	@Override
	public List<Object> selectAllStudentList(String page, String limit) {
		
		conn = C3P0Util.getConnection();
		
		try {
			
			/*
			 * 原生Limit分页就是在编写sql语句时需要自己加上limit关键字，然后传入分页参数进行分页
			 */
			
			String sql = "SELECT * FROM studentInfo LIMIT ?,?";
			ps = conn.prepareStatement(sql);
			int page1 = Integer.parseInt(page);
			int limit1 = Integer.parseInt(limit);
			ps.setInt(1, (page1-1)*limit1);
			ps.setInt(2, limit1);
			rs = ps.executeQuery();
			ArrayList<Object> list = new ArrayList<Object>();
			while(rs.next()) {
				Student student = new Student();
				student.setStudentId(rs.getString("studentId"));
				student.setName(rs.getString("name"));
				student.setSex(rs.getString("sex"));
				student.setAge(rs.getInt("age"));
				student.setClazz(rs.getString("clazz"));
				list.add(student);
			}
			
			return list;
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			C3P0Util.release(rs, stm, conn);
		}
		
		return null;
	}

	@Override
	public int editTeacher(Teacher teacher) {
		
		conn = C3P0Util.getConnection();
		
		try {
			
			/*
			 * update 表名称 set 列名称=新值 where 更新条件;
			 */
			
			String sql = "update teacherinfo set tname=?, tage=?, tsex=?, tdept=?, tel=?, qQ=?, professional=? where teacherID=?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, teacher.getTname());
			ps.setInt(2, teacher.getTage());
			ps.setString(3, teacher.getTsex());
			ps.setString(4, teacher.getTdept());
			ps.setInt(5, teacher.getTel());
			ps.setInt(6, teacher.getQQ());
			ps.setString(7, teacher.getProfessional());
			int rs = ps.executeUpdate();
			if (rs==1) {
				return 1;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			C3P0Util.release(stm, conn);
		}
		return 0;
	}

	@Override
	public int editStudent(Student student) {
		
		conn = C3P0Util.getConnection();
		
		try {
			
			/*
			 * update 表名称 set 列名称=新值 where 更新条件;
			 */
			
			String sql = "update studentInfo set name=?, sex=?, age=? teacherId=?, grade=?, clazz=?, titleId=? where studentId=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setString(2, student.getSex());
			ps.setInt(3, student.getAge());
			ps.setString(4, student.getClazz());
			int rs = ps.executeUpdate();
			if (rs==1) {
				return 1;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			C3P0Util.release(rs, stm, conn);
		}
		return 0;
	}
	
	

}
