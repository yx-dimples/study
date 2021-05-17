package com.test.adapter;

import com.test.adapter.connector.AndroidConnector;
import com.test.adapter.connector.IOSConnector;
import com.test.adapter.connector.PhoneConnector;
import com.test.adapter.connector.PhoneConnectorAdapter;
import com.test.adapter.phone.iml.XiaomiPhone;
import com.test.adapter.phone.iml.ApplePhone;
/**
 * ʵ��1��
 * �ּ�����Android�ֻ���IOS�ֻ�����ϵ�У�������֪��
 * �����ֻ�ʹ�õ�������AndroidConnector��IOSConnector�ӿ��ǲ�һ�µģ�
 * �뿪����������ʹ�����ö�Ӧ�������������Ӳ�ͬ�ֻ���
 * @author Moppet
 *
 */



public class AdapterTest {
	public static void main(String[] args) {
		/*
		 * ��׿�ֻ�����
		 */
		XiaomiPhone xiaomiPhone = new XiaomiPhone();
		xiaomiPhone.charge(new PhoneConnectorAdapter(new IOSConnector()));
		xiaomiPhone.charge(new PhoneConnectorAdapter(new AndroidConnector()));
		
		/*
		 * IOS�ֻ�����
		 */
		ApplePhone applePhone = new ApplePhone();
		applePhone.charge(new PhoneConnectorAdapter(new AndroidConnector()));
	}

}
