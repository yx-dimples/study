package com.test.mode.department;
import com.test.mode.graduate.Graduate;;

/*
 * ����
 * ���񴦸���ҵ���䷢��ҵ֤��ѧλ֤
 */
public class Office {
	/*
	 * ��ѧ��ҵ����֤ѧ��֤����ȡ��ҵ֤��ѧλ֤
	 */
	public static Graduate checkingStudentID(Graduate graduate) {
		if(!graduate.getStudentID().isEmpty()) {
			return grantCertificate(graduate);
		}
		return notGrantCertificate(graduate);
	}
	/*
	 * ���񴦷��ű�ҵ֤��ѧ��֤ 
	 */
	public static Graduate grantCertificate(Graduate graduate) {
		graduate.setDiploma("�䷢��ҵ֤");
		graduate.setCertificateOfDegree("�䷢ѧλ֤");
		return graduate;
	}
	
	/*
	 * ���񴦲����ű�ҵ֤��ѧ��֤
	 */
	public static Graduate notGrantCertificate(Graduate graduate) {
		graduate.setDiploma("�������ҵ");
		graduate.setCertificateOfDegree("�������ҵ");
		return graduate;
	}
}
