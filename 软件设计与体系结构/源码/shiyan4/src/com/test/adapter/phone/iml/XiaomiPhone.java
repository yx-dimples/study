package com.test.adapter.phone.iml;

import com.test.adapter.phone.AndroidPhone;
import com.test.adapter.connector.PhoneConnector;

/*
 * Xiaomi�ֻ�
 */
public class XiaomiPhone implements AndroidPhone{

	@Override
	public void charge(PhoneConnector phoneConnector) {
		System.out.println("С���ֻ�" + phoneConnector.phoneCharge());
	}
}
