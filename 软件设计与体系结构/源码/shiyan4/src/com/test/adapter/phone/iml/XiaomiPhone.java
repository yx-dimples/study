package com.test.adapter.phone.iml;

import com.test.adapter.phone.AndroidPhone;
import com.test.adapter.connector.PhoneConnector;

/*
 * Xiaomi手机
 */
public class XiaomiPhone implements AndroidPhone{

	@Override
	public void charge(PhoneConnector phoneConnector) {
		System.out.println("小米手机" + phoneConnector.phoneCharge());
	}
}
