package com.test.adapter.connector;

/*
 * 手机接口适配器
 */
public class PhoneConnectorAdapter extends IOSConnector implements PhoneConnector{

	private PhoneConnector phoneConnector;

	public PhoneConnectorAdapter(PhoneConnector phoneConnector) {
		this.phoneConnector = phoneConnector;
	}
	@Override
	public String phoneCharge() {
		
		return phoneConnector.phoneCharge();
	}
	
}