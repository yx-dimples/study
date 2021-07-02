package com.moppet.combination.leaf;

/*
 * ҽ��
 */
import com.moppet.combination.component.Hospital;

public class Doctor extends Hospital {
	
	private String name = "";

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Doctor(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Doctor [name=" + name + "]";
	}
	/*
	 * ��ӡ
	 */
	@Override
	public void print(String preStr) {
		System.out.println(preStr + name);
	}
}
