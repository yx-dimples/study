package com.test.adapter;

import com.test.adapter.connector.AndroidConnector;
import com.test.adapter.connector.IOSConnector;
import com.test.adapter.connector.PhoneConnector;
import com.test.adapter.connector.PhoneConnectorAdapter;
import com.test.adapter.phone.iml.XiaomiPhone;
import com.test.adapter.phone.iml.ApplePhone;
/**
 * 实验1：
 * 现假设有Android手机和IOS手机两个系列，众所周知，
 * 两个手机使用的数据线AndroidConnector和IOSConnector接口是不一致的，
 * 请开发适配器，使其能让对应的数据线能连接不同手机。
 * @author Moppet
 *
 */



public class AdapterTest {
	public static void main(String[] args) {
		/*
		 * 安卓手机测试
		 */
		XiaomiPhone xiaomiPhone = new XiaomiPhone();
		xiaomiPhone.charge(new PhoneConnectorAdapter(new IOSConnector()));
		xiaomiPhone.charge(new PhoneConnectorAdapter(new AndroidConnector()));
		
		/*
		 * IOS手机测试
		 */
		ApplePhone applePhone = new ApplePhone();
		applePhone.charge(new PhoneConnectorAdapter(new AndroidConnector()));
	}

}
