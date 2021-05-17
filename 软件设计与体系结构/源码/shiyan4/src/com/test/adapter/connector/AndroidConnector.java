package com.test.adapter.connector;

import com.test.adapter.connector.PhoneConnector;

/*
 * AndroidConnector接口
 */
public class AndroidConnector implements PhoneConnector{

	@Override
	public String phoneCharge() {
		return "正在使用AndroidConnector接口充电";
	}
	
}