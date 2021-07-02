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

// ����
public class Patient extends TePprocess{
	
	Scanner input = new Scanner(System.in);
	
	private MedicalRecords medicalRecords;

	@Override
	public void register() {
		medicalRecords = new MedicalRecords();
		GetHospital getHospital = new GetHospital();
		getHospital.main(null);
		System.out.print("������Ҫ���йҺŵ�ҽ����ţ�");
		int donumber = input.nextInt();
		
		Case medicalRecord = new BasicMedicalExpeness();
		OtherCost otherCost = new Register(medicalRecord);
		System.out.println("�Һŷѣ�" + otherCost.cost() + "Ԫ");
		System.out.print("��ɷѣ�");
		double cost = input.nextInt();
		
		wait(1.3);
		medicalRecords.setDoctorName(findDotorName(donumber));
		medicalRecords.setDepartment(findDepartadd(donumber));
		wait(1.5);
		System.out.println("��ϲ��Һųɹ�" );
		System.out.println("\tҽ����" + findDotorName(donumber) + "   ����ص㣺" + findDepartadd(donumber) + "   ��ǰ���������ȴ�...");
}

	@Override
	public void doctorConfirmed() {
		
		System.out.println("ҽ��ȷ��");
		System.out.println("ҽ������������");
		
		Case me = new BasicMedicalExpeness();
		OtherCost o = new AmCapsules(me);
		medicalRecords.setCoseContext(o);
		System.out.println("��Ҫ��ȥ�ɷ� Ȼ�������������");
	}

	@Override
	public void pay() {
		
		
		wait(2.0);
		double expenses = medicalRecords.getCoseContext().cost();
		System.out.println("����Ҫ�ɷ�: " + expenses + "Ԫ\n");
		double meray = 0.0;
		do {
			System.out.print("����ɷѽ��: ");
			meray = input.nextDouble();
		}while(meray != expenses);
		wait(1.0);
		System.out.println("�ɷѳɹ�������ȥ���Ų���ȥ��ҩ���������");
	}
	
	
	
	@Override
	public void doctorTreatment() {	
		
		System.out.println("ҩ�����ݲ�������������ҩ���У�" + medicalRecords.getCoseContext().getDes());
		wait(2.0);
		System.out.println("��ҩ��ɣ��������Ƿ�ҩƷ�����Ƿ��벡������һ��");
	}

	@Override
	public void endofTreatment() {
		wait(1.0);
		System.out.println("����õ�ҩƷ�Ƿ��벡������һ�£�����");
		wait(1.0);
		System.out.println("������󣬽���ҽԺ����");
		input.close();
		
	}
	
	private String findDotorName(int n) {
		String name = "";
		switch (n) {
			case 1: {
				name = "����";
			}
			break;
			case 2: name = "����ƽ";
			break;
			case 3: name = "���";
			break;
			case 4: name = "�ܹ���";
			break;
			case 5: name = "������";
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
			case liudo: address = "��¥1�������ڿ�";
			break;
			case yangdo: address = "��¥2�������ڿ�";
			break;
			case lido: address = "��¥3����Ѫ�ܿ�";
			break;
			case zhoudo: address = "��¥4�ҹǿ�";
			break;
			case yangqido: address = "��¥5�������";
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
