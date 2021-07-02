package com.sxh.pojo;

import java.util.List;

public class Vo {
	int code;   //表示状态码
	String msg; //表示描述
	int count;  //表示数据条数
	List<Object> data; //表示数据集
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Object> getData() {
		return data;
	}
	public void setData(List<Object> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Vo [code=" + code + ", msg=" + msg + ", count=" + count + ", data=" + data + "]";
	}
	public Vo(int code, String msg, int count, List<Object> data) {
		super();
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
	}
	public Vo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
