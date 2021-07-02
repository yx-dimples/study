package com.moppet.demodel;

import com.moppet.demodel.component.Case;
import com.moppet.demodel.concretcomponent.BasicMedicalExpeness;
import com.moppet.demodel.decorator.OtherCost;
import com.moppet.demodel.decorator.impl.CoGantab;
import com.moppet.demodel.decorator.impl.RoutineBloodTest;

public class GetMedicalRecord {

	public static void main(String[] args) {
		Case medicalRecord = new BasicMedicalExpeness();
		OtherCost otherCost = new RoutineBloodTest(medicalRecord);
		System.out.println(otherCost.getDes() + ":" + otherCost.cost() + "Ԫ");
	
		Case medicalRecord1 = new BasicMedicalExpeness();
		RoutineBloodTest otherCost1 = new RoutineBloodTest(medicalRecord1);
		CoGantab ch = new CoGantab(otherCost1);
		System.out.println(ch.getDes() + ":" + ch.cost() + "Ԫ");
	}

}
