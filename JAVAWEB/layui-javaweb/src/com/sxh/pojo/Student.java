package com.sxh.pojo;
/**
 * ѧ��ʵ����
 * @author Moppet
 *
 */
public class Student {
	// ѧ��
	private String studentId;
	// ����
	private String name;
	// �Ա�
	private String sex;
	// ����
	private int age;
	// �༶
	private String clazz;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", sex=" + sex + ", age=" + age + ", clazz="
				+ clazz + "]";
	}
	public Student(String studentId, String name, String sex, int age, String clazz) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.clazz = clazz;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}