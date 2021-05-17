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
	 * 教务处代办
	 */
	private void officeAgency(Graduate graduate) {
		Office.checkingStudentID(graduate);
	}
	/*
	 * 公安处派遣证代办
	 */
	private void publicSecurityAgency(Graduate graduate) {
		PublicSecurityDepartment.checkingDispatchCertificate(graduate);
	}
	/*
	 * 饭卡余额代办
	 */
	private void logisticsAgency(Graduate graduate) {
		LogisticsOffice.checkingMealCardBalance(graduate);
	}
	/*
	 * 借书证押金代办
	 */
	private void libraryAgency(Graduate graduate) {
		Library.checkingLibraryCard(graduate);
		
	}
}
