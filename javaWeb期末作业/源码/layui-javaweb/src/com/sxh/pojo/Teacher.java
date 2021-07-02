package com.sxh.pojo;

/**
 * 老师实体类
 * @author Moppet
 *
 */
public class Teacher {
	//工号 
	private String teacherId;
	// 姓名
	private String tname;
	// 年龄
	private int tage;
	// 性别
	private String tsex;
	// 部门
	private String tdept;
	// 电话
	private int tel;
	// QQ
	private int QQ;
	// 昵称
	private String professional;
	
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", tname=" + tname + ", tage=" + tage + ", tsex=" + tsex + ", tdept="
				+ tdept + ", tel=" + tel + ", QQ=" + QQ + ", professional=" + professional + "]";
	}
	
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Teacher(String teacherId, String tname, int tage, String tsex, String tdept, int tel, int qQ,
			String professional) {
		super();
		this.teacherId = teacherId;
		this.tname = tname;
		this.tage = tage;
		this.tsex = tsex;
		this.tdept = tdept;
		this.tel = tel;
		QQ = qQ;
		this.professional = professional;
	}

	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTage() {
		return tage;
	}
	public void setTage(int tage) {
		this.tage = tage;
	}
	public String getTsex() {
		return tsex;
	}
	public void setTsex(String tsex) {
		this.tsex = tsex;
	}
	public String getTdept() {
		return tdept;
	}
	public void setTdept(String tdept) {
		this.tdept = tdept;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getQQ() {
		return QQ;
	}
	public void setQQ(int qQ) {
		QQ = qQ;
	}
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}

	
}
