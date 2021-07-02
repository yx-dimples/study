package com.sxh.pojo;

/**
 * 管理员实体类
 * @author Moppet
 *
 */
public class Admin {
	// 姓名
	private String name;
	// 密码
	private String password;
	@Override
	public String toString() {
		return "Admin [name=" + name + ", password=" + password + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}