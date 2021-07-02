package com.moppet.demodel.decorator.impl;

import com.moppet.demodel.component.Case;
import com.moppet.demodel.decorator.OtherCost;

// ∏¥∑Ω∏–√∞¡È∆¨
public class CoGantab extends OtherCost{
	
	public CoGantab(Case medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return + 5.25;
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return medicalRecord.getDes() + " " + "∏¥∑Ω∏–√∞¡È∆¨";
	}
}