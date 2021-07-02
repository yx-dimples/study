package com.moppet.templete.concreteclass;

import java.util.Scanner;

import com.moppet.combination.GetHospital;
import com.moppet.demodel.component.Case;
import com.moppet.demodel.concretcomponent.BasicMedicalExpeness;
import com.moppet.demodel.decorator.OtherCost;
import com.moppet.demodel.decorator.impl.AmCapsules;
import com.moppet.demodel.decorator.impl.Register;
import com.moppet.demodel.decorator.impl.RoutineBloodTest;
import com.moppet.entity.MedicalRecords;
import com.moppet.templete.abstractclass.TePprocess;

// 病人
public class Patient extends TePprocess{
	
	Scanner input = new Scanner(System.in);
	
	private MedicalRecords medicalRecords;

	@Override
	public void register() {
		medicalRecords = new MedicalRecords();
		GetHospital getHospital = new GetHospital();
		getHospital.main(null);
		System.out.print("输入你要进行挂号的医生编号：");
		int donumber = input.nextInt();
		
		Case medicalRecord = new BasicMedicalExpeness();
		OtherCost otherCost = new Register(medicalRecord);
		System.out.println("挂号费：" + otherCost.cost() + "元");
		System.out.print("请缴费：");
		double cost = input.nextInt();
		
		wait(1.3);
		medicalRecords.setDoctorName(findDotorName(donumber));
		medicalRecords.setDepartment(findDepartadd(donumber));
		wait(1.5);
		System.out.println("恭喜你挂号成功" );
		System.out.println("\t医生：" + findDotorName(donumber) + "   就诊地点：" + findDepartadd(donumber) + "   请前往就诊区等待...");
}

	@Override
	public void doctorConfirmed() {
		
		System.out.println("医生确诊");
		System.out.println("医生开病例单了");
		
		Case me = new BasicMedicalExpeness();
		OtherCost o = new AmCapsules(me);
		medicalRecords.setCoseContext(o);
		System.out.println("需要先去缴费 然后诊疗室做检查");
	}

	@Override
	public void pay() {
		
		
		wait(2.0);
		double expenses = medicalRecords.getCoseContext().cost();
		System.out.println("你需要缴费: " + expenses + "元\n");
		double meray = 0.0;
		do {
			System.out.print("输入缴费金额: ");
			meray = input.nextDouble();
		}while(meray != expenses);
		wait(1.0);
		System.out.println("缴费成功，可以去拿着病例去拿药，与做检查");
	}
	
	
	
	@Override
	public void doctorTreatment() {	
		
		System.out.println("药房根据病历单给你拿了药方有：" + medicalRecords.getCoseContext().getDes());
		wait(2.0);
		System.out.println("拿药完成，请你检查是否药品数量是否与病例单上一致");
	}

	@Override
	public void endofTreatment() {
		wait(1.0);
		System.out.println("检查拿的药品是否与病例单上一致，无误");
		wait(1.0);
		System.out.println("检查无误，结束医院看病");
		input.close();
		
	}
	
	private String findDotorName(int n) {
		String name = "";
		switch (n) {
			case 1: {
				name = "刘丽";
			}
			break;
			case 2: name = "杨晓平";
			break;
			case 3: name = "李江涛";
			break;
			case 4: name = "周桂林";
			break;
			case 5: name = "杨启才";
			break;
		}
		return name;
	}
	
	private String findDepartadd(int n) {
		String address = "";
		final int liudo = 1;
		final int yangdo = 2;
		final int lido = 3;
		final int zhoudo = 4;
		final int yangqido = 5;
		switch (n) {
			case liudo: address = "二楼1室消化内科";
			break;
			case yangdo: address = "二楼2室消化内科";
			break;
			case lido: address = "二楼3室心血管科";
			break;
			case zhoudo: address = "二楼4室骨科";
			break;
			case yangqido: address = "二楼5室神经外科";
			break;
		}
		return address;
	}
	
	protected void wait(double d) {
		try {
			Thread.sleep((long) (d * 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
