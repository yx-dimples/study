package com.test.mode.agency;
import com.test.mode.department.Library;
import com.test.mode.department.LogisticsOffice;
import com.test.mode.department.Office;
import com.test.mode.department.PublicSecurityDepartment;
import com.test.mode.graduate.Graduate;

public class GraduationAgency {
	public Graduate handlingOffice (Graduate graduate){
		officeAgency(graduate);
		publicSecurityAgency(graduate);
		logisticsAgency(graduate);
		libraryAgency(graduate);
		return graduate;
	
	}
	/*
	 * ���񴦴���
	 */
	private void officeAgency(Graduate graduate) {
		Office.checkingStudentID(graduate);
	}
	/*
	 * ��������ǲ֤����
	 */
	private void publicSecurityAgency(Graduate graduate) {
		PublicSecurityDepartment.checkingDispatchCertificate(graduate);
	}
	/*
	 * ����������
	 */
	private void logisticsAgency(Graduate graduate) {
		LogisticsOffice.checkingMealCardBalance(graduate);
	}
	/*
	 * ����֤Ѻ�����
	 */
	private void libraryAgency(Graduate graduate) {
		Library.checkingLibraryCard(graduate);
		
	}
}
