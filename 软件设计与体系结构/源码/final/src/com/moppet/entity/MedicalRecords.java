package com.moppet.entity;

import com.moppet.demodel.component.Case;

/*
 * 看病记录实体
 */
public class MedicalRecords {
	
	/**
	 * 患者姓名
	 */
	private String patientName;
	
	/**
	 * 选择挂号科室
	 */
	private String department;
	
	/**
	 * 医生姓名
	 */
	private String doctorName;
	
	/**
	 * 病例内容
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
