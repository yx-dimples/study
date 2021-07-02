package com.moppet.combination.composite;

import java.util.ArrayList;
import java.util.List;

import com.moppet.combination.component.Hospital;
/*
 * ����
 */
public class Department extends Hospital {
	
	private String name = "";

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Department(String name) {
		super();
		this.name = name;
	}
	
	private List<Hospital> childHospital = null;
	
	/*
	 * ��ӳ�Ա
	 */
	@Override
	public void add(Hospital hos) {
		if (null == childHospital) {
			childHospital = new ArrayList<Hospital>();
		}
		childHospital.add(hos);
	}
	/*
	 * �Ƴ���Ա
	 */
	@Override
	public void remove(Hospital hos) {
		if (null != childHospital) {
			childHospital.remove(hos);
		}
	}
	/*
	 * ��ӡ
	 */
	@Override
	public void print(String preStr) {
		System.out.println(preStr + name);
		
		if (null != childHospital) {
			preStr += "   ";
			
			for(Hospital hos : childHospital) {
				hos.print(preStr);
			}
		}
	}
}
