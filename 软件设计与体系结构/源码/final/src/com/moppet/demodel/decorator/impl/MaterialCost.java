package com.moppet.demodel.decorator.impl;

import com.moppet.demodel.component.Case;
import com.moppet.demodel.decorator.OtherCost;

// 材料费
public class MaterialCost extends OtherCost{
	
	public MaterialCost(Case medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return medicalRecord.cost() + 4.88;
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return medicalRecord.getDes() + " "  + "材料费";
	}
}
