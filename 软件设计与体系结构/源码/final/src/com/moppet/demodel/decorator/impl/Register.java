package com.moppet.demodel.decorator.impl;

import com.moppet.demodel.component.Case;
import com.moppet.demodel.decorator.OtherCost;

// นาบล
public class Register extends OtherCost{
	
	public Register(Case medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return medicalRecord.getDes() + " "  + "นาบลทั";
	}
}