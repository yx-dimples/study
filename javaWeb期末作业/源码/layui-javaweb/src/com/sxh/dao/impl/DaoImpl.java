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
	
	//  ������������ݿ�����ӣ�Ҳ�������Ѿ����ص�Driver �����ݿ�֮�佨�����ӡ�
	Connection conn = null; 
	
	Statement stm = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	// ��ѯs_admin����¼ҳ��ʹ�ã�
	@Override
	public Admin queryByParams(Admin admin) {
		//��ȡ���Ӷ���
		conn = C3P0Util.getConnection();
		/*
		 * ��ѯ���ݿ��SQL��䣬���Ǵ�s_admin�������ݱ��в�ѯ�������������name��password����ƥ������ݡ�
		 */
		try {
			String sql = "SELECT * FROM s_admin WHERE "
	                + "name='" + admin.getName() + "' AND "
	                + "password='" + admin.getPassword() +"'";
			
			//��ȡִ��SQL����PreparedStatement����
			//ִ��SQL���
			ps = conn.prepareStatement(sql);

			// executeQuery()����������ݿ���Ӧ�Ĳ�ѯ��������ResultSet������й�ʹ�á�
			rs = ps.executeQuery();
			
			 //���� ��rsȫ�����ж�ȡ
			while (rs.next()) {
				admin = new Admin(rs.getString("name"), rs.getString("password"));
			}
			
			//CreateStatement����������stm������ͨ������ѯ��һ�������Ƭ�Ρ�
			stm = conn.createStatement();
			
			rs = stm.executeQuery(sql.toString());
			
			 //rs���ж�ȡһ�� �ж��Ƿ�������
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

	// ɾ��ѧ����Ϣ
	@Override
	public int deleteStu(String studentId) {
		
		int rs;
		
		conn = C3P0Util.getConnection();
		
		try {
			/*
			 * ɾ�����е�����  �ؼ��� delete from ���� where ɸѡ����
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

	// ɾ����ʦ��Ϣ
	@Override
	public int deleTea(String teacherId) {
		
		int rs;
		
		conn = C3P0Util.getConnection();
		
		try {
			/*
			 * ɾ�����е�����  �ؼ��� delete from ���� where ɸѡ����
			 */
			String sql = "DELETE FROM teacherinfo WHERE teacherId = " + teacherId;
			ps = conn.prepareStatement(sql);
			// �ǵ��ɹ��������ݵ����ݿ�ʱ������᷵��һ������1�����֣����������ݳɹ������֮��
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

	
	// ��ӽ�ʦ
	@Override
	public int addTeacher(Teacher teacher) {
		
		int rs;
		conn = C3P0Util.getConnection();
		
		
		
		try {
			
			/*
			 * �������в������� insert into�÷�
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

	
	// ���ѧ��
	@Override
	public int addStudent(Student student) {
		
		int rs;
		
		conn = C3P0Util.getConnection();
		
		try {
			
			/*
			 * �������в������� insert into�÷�
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

	
	//������ʦ�ж�����
	@Override
	public int countTeacher() {
		
		conn = C3P0Util.getConnection();
		
		try {
			
			/*
			 * select count(*) from ���� ����ǲ�ѯ������м�¼��
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

	//��ҳ��ѯ������ʦ
	@Override
	public List<Object> selevtAllTeacherList(String page, String limit) {
		
		conn = C3P0Util.getConnection();
		
		try {
			
			/*
			 * ԭ��Limit��ҳ�����ڱ�дsql���ʱ��Ҫ�Լ�����limit�ؼ��֣�Ȼ�����ҳ�������з�ҳ
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

	
	//����ѧ���ж�����
	@Override
	public int countStudent() {
		
		conn = C3P0Util.getConnection();
		
		try {
			
			/*
			 * select count(*) from ���� ����ǲ�ѯ������м�¼��
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
	
	//��ҳ��ѯ����ѧ��

	@Override
	public List<Object> selectAllStudentList(String page, String limit) {
		
		conn = C3P0Util.getConnection();
		
		try {
			
			/*
			 * ԭ��Limit��ҳ�����ڱ�дsql���ʱ��Ҫ�Լ�����limit�ؼ��֣�Ȼ�����ҳ�������з�ҳ
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
			 * update ������ set ������=��ֵ where ��������;
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
			 * update ������ set ������=��ֵ where ��������;
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
