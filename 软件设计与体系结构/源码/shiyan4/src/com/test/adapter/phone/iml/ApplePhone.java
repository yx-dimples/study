package com.test.adapter.phone.iml;

import com.test.adapter.phone.IOSPhone;
import com.test.adapter.connector.PhoneConnector;

/*
 * Xiaomi�ֻ�
 */
public class ApplePhone implements IOSPhone{

	@Override
	public void charge(PhoneConnector phoneConnector) {
		System.out.println("ƻ���ֻ�" + phoneConnector.phoneCharge());
	}
}
