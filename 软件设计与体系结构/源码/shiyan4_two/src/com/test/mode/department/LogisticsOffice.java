package com.test.mode.department;
import com.test.mode.graduate.Graduate;;

/*
 * ���ڴ�
 * ���񴦸���ҵ���˻��������
 */
public class LogisticsOffice {
	/*
	 * �鿴�������˻����
	 */
	public static Graduate checkingMealCardBalance(Graduate graduate) {
		if(!graduate.getMealCard().isEmpty()) {
			return grantBalance(graduate);
		}
		return notGrantBalance(graduate);
	}
	/*
	 * �����˻��������10
	 */
	public static Graduate grantBalance(Graduate graduate) {
		graduate.setMealCardBalance("������ʣ10.0");
		return graduate;
	}
	
	/*
	 * �����˻��������0
	 */
	public static Graduate notGrantBalance(Graduate graduate) {
		graduate.setMealCardBalance("������ʣ0.0");
		return graduate;
	}
}
