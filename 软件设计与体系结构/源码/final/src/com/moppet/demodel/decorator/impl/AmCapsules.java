package com.moppet.demodel.decorator.impl;

import com.moppet.demodel.component.Case;
import com.moppet.demodel.decorator.OtherCost;

// °¢ÄªÎ÷ÁÖ½ºÄÒ
public class AmCapsules extends OtherCost{
	
	public AmCapsules(Case medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 19.22;
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return medicalRecord.getDes() + " " + "°¢ÄªÎ÷ÁÖ½ºÄÒ";
	}
}