package com.test.mode.department;
import com.test.mode.graduate.Graduate;;

/*
 * 教务处
 * 教务处给毕业生颁发毕业证、学位证
 */
public class Office {
	/*
	 * 大学毕业生验证学生证并获取毕业证，学位证
	 */
	public static Graduate checkingStudentID(Graduate graduate) {
		if(!graduate.getStudentID().isEmpty()) {
			return grantCertificate(graduate);
		}
		return notGrantCertificate(graduate);
	}
	/*
	 * 教务处发放毕业证、学生证 
	 */
	public static Graduate grantCertificate(Graduate graduate) {
		graduate.setDiploma("颁发毕业证");
		graduate.setCertificateOfDegree("颁发学位证");
		return graduate;
	}
	
	/*
	 * 教务处不发放毕业证、学生证
	 */
	public static Graduate notGrantCertificate(Graduate graduate) {
		graduate.setDiploma("不给予毕业");
		graduate.setCertificateOfDegree("不给予毕业");
		return graduate;
	}
}
