package com.test.mode.department;

import com.test.mode.graduate.Graduate;

/*
 *  ͼ���  
 *	ͼ��ݸ���ѧ���Ľ���֤���˻�Ѻ��
 */

public class Library {
	/*
	 * ��ѧ��ҵ����֤����֤����ȡ����֤Ѻ��
	 */
	public static Graduate checkingLibraryCard(Graduate graduate) {
		if(!graduate.getLibraryCard().isEmpty()) {
			return grantDeposit(graduate);
		}
		return notGrantDeposit(graduate);
	}
	/*
	 * ͼ����˻�Ѻ��
	 */
	public static Graduate grantDeposit(Graduate graduate) {
		graduate.setLibraryCardDeposit("�˻�Ѻ��Ϊ100");
		return graduate;
	}
	
	/*
	 * ����֤��ʧ�����˻�Ѻ��
	 */
	public static Graduate notGrantDeposit(Graduate graduate) {
		graduate.setLibraryCardDeposit("����֤��ʧ�����˻�Ѻ��");
		return graduate;
	}
}
