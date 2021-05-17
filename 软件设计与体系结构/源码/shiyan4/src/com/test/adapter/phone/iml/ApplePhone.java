package com.test.adapter.phone.iml;

import com.test.adapter.phone.IOSPhone;
import com.test.adapter.connector.PhoneConnector;

/*
 * Xiaomi返字
 */
public class ApplePhone implements IOSPhone{

	@Override
	public void charge(PhoneConnector phoneConnector) {
		System.out.println("道惚返字" + phoneConnector.phoneCharge());
	}
}
