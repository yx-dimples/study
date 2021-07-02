package com.moppet.demodel.decorator.impl;

import com.moppet.demodel.component.Case;
import com.moppet.demodel.decorator.OtherCost;

//血常规
public class RoutineBloodTest extends OtherCost{
	
	public RoutineBloodTest(Case medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 25;
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return medicalRecord.getDes() + " "  + "血常规";
	}
}
