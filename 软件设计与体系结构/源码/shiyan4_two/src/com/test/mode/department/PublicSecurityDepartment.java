package com.test.mode.department;
import com.test.mode.graduate.Graduate;;

/*
 * 公安处
 * 公安处给毕业生颁发派遣证
 */
public class PublicSecurityDepartment {
	/*
	 * 大学毕业生验证身份证、学位证并获取派遣证
	 */
	public static Graduate checkingDispatchCertificate(Graduate graduate) {
		if(!graduate.getIdentityCard().isEmpty() && !graduate.getCertificateOfDegree().isEmpty()) {
			return grantDispatch(graduate);
		}
		return notGrantDispatch(graduate);
	}
	/*
	 * 公安处发放派遣证
	 */
	public static Graduate grantDispatch(Graduate graduate) {
		graduate.setDispatchCertificate("发放派遣证");
		return graduate;
	}
	
	/*
	 * 公安处不发放派遣证
	 */
	public static Graduate notGrantDispatch(Graduate graduate) {
		graduate.setDispatchCertificate("信息有误，不发派遣证");
		return graduate;
	}
}
