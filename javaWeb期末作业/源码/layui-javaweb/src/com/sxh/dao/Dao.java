package com.sxh.dao;

import java.util.List;

import com.sxh.pojo.Admin;
import com.sxh.pojo.Student;
import com.sxh.pojo.Teacher;

public interface Dao {

	// ��ѯs_admin����¼ҳ��ʹ�ã�
	public Admin queryByParams(Admin admin);
	
	// ɾ��ѧ����Ϣ
	public int deleteStu (String studentId) ;
	// ɾ����ʦ��Ϣ
	public int deleTea (String teacherId);
	
	// ��ӽ�ʦ
	public int addTeacher(Teacher teacher);
	// ���ѧ��
	public int addStudent(Student student);		
	
	//������ʦ�ж�����
	public int countTeacher();

	//��ҳ��ѯ������ʦ
	public List<Object> selevtAllTeacherList(String page, String limit);
	
	//����ѧ���ж�����
	public int countStudent();

	//��ҳ��ѯ����ѧ��
	public List<Object> selectAllStudentList(String page, String limit);
	
	// �޸Ľ�ʦ
	public int editTeacher(Teacher teacher);
	// �޸�ѧ��
	public int editStudent(Student student);
	

}
