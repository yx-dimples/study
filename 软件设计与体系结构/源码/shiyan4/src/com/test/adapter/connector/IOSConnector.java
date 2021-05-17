package com.test.adapter.connector;

/*
 * IOSConnector接口
 */
public class IOSConnector implements PhoneConnector{

	@Override
	public String phoneCharge() {
		return "正在使用IOSConnector接口充电";
	}	
}