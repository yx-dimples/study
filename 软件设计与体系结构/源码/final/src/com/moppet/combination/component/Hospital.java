package com.moppet.combination.component;


// 医院
public abstract class Hospital {
	/*
	 * 添加成员
	 */
	public void add(Hospital hos) {
		throw new UnsupportedOperationException("对象不支持此功能");
	}
	/*
	 * 移除成员
	 */
	public void remove(Hospital hos) {
		throw new UnsupportedOperationException("对象不支持此功能");
	}
	/*
	 * 打印
	 */
	public void print(String preStr) {
		throw new UnsupportedOperationException("对象不支持此功能");
	}
}