package com.moppet.combination;

import com.moppet.combination.composite.Department;
import com.moppet.combination.leaf.Doctor;

public class GetHospital {
	public static void main(String[] args) {
		Department hospital = new Department("�����е�һ����ҽԺ");
		Department inmedicine = new Department("�ڿ�");
		Department surgery = new Department("���");
		
		Department GImedicine = new Department("�����ڿ�");
		Department DeofCard = new Department("��Ѫ�ܿ�");
		Department orthopaedics = new Department("�ǿ�");
		Department neurosurgery = new Department("�����");
		
	
		Doctor liudo = new Doctor("1.����");
		Doctor yangdo = new Doctor("2.����ƽ");
		Doctor lido = new Doctor("3.���");
		Doctor zhoudo = new Doctor("4.�ܹ���");
		Doctor yangqido = new Doctor("5.������");
		
		hospital.add(inmedicine);
		hospital.add(surgery);
		
		inmedicine.add(GImedicine);
		inmedicine.add(DeofCard);
		
		surgery.add(orthopaedics);
		surgery.add(neurosurgery);
		
		GImedicine.add(liudo);
		GImedicine.add(yangdo);
		
		DeofCard.add(lido);
		
		orthopaedics.add(zhoudo);
		
		neurosurgery.add(yangqido);
		
		hospital.print("");
	}

}
