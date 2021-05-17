package com.test.mode.department;
import com.test.mode.graduate.Graduate;;

/*
 * ������
 * ����������ҵ���䷢��ǲ֤
 */
public class PublicSecurityDepartment {
	/*
	 * ��ѧ��ҵ����֤���֤��ѧλ֤����ȡ��ǲ֤
	 */
	public static Graduate checkingDispatchCertificate(Graduate graduate) {
		if(!graduate.getIdentityCard().isEmpty() && !graduate.getCertificateOfDegree().isEmpty()) {
			return grantDispatch(graduate);
		}
		return notGrantDispatch(graduate);
	}
	/*
	 * ������������ǲ֤
	 */
	public static Graduate grantDispatch(Graduate graduate) {
		graduate.setDispatchCertificate("������ǲ֤");
		return graduate;
	}
	
	/*
	 * ��������������ǲ֤
	 */
	public static Graduate notGrantDispatch(Graduate graduate) {
		graduate.setDispatchCertificate("��Ϣ���󣬲�����ǲ֤");
		return graduate;
	}
}
