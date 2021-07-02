package com.sxh.pojo;
/**
 * 学生实体类
 * @author Moppet
 *
 */
public class Student {
	// 学号
	private String studentId;
	// 姓名
	private String name;
	// 性别
	private String sex;
	// 年龄
	private int age;
	// 班级
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