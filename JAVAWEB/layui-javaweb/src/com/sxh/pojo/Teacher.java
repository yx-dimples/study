package com.sxh.pojo;

/**
 * ��ʦʵ����
 * @author Moppet
 *
 */
public class Teacher {
	//���� 
	private String teacherId;
	// ����
	private String tname;
	// ����
	private int tage;
	// �Ա�
	private String tsex;
	// ����
	private String tdept;
	// �绰
	private int tel;
	// QQ
	private int QQ;
	// �ǳ�
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
