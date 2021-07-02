package com.moppet.demodel.decorator;

import com.moppet.demodel.component.Case;

// 其它药物或治疗费
public class OtherCost extends Case{
	
	public Case medicalRecord;
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return null;
	}

}
