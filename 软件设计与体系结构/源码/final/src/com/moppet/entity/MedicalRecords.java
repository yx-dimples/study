package com.moppet.entity;

import com.moppet.demodel.component.Case;

/*
 * ������¼ʵ��
 */
public class MedicalRecords {
	
	/**
	 * ��������
	 */
	private String patientName;
	
	/**
	 * ѡ��Һſ���
	 */
	private String department;
	
	/**
	 * ҽ������
	 */
	private String doctorName;
	
	/**
	 * ��������
	 */
	private Case coseContext;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Case getCoseContext() {
		return coseContext;
	}

	public void setCoseContext(Case coseContext) {
		this.coseContext = coseContext;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Override
	public String toString() {
		return "MedicalRecords [patientName=" + patientName + ", department=" + department
				+ ", doctorName=" + doctorName + ", coseContext=" + coseContext + "]";
	}

	public MedicalRecords(String patientName, String department, String doctorName,
			Case coseContext) {
		super();
		this.patientName = patientName;
		this.department = department;
		this.doctorName = doctorName;
		this.coseContext = coseContext;
	}

	public MedicalRecords() {
		super();
	}

}
