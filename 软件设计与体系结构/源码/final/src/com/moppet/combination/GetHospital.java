package com.moppet.combination;

import com.moppet.combination.composite.Department;
import com.moppet.combination.leaf.Doctor;

public class GetHospital {
	public static void main(String[] args) {
		Department hospital = new Department("绵阳市第一人民医院");
		Department inmedicine = new Department("内科");
		Department surgery = new Department("外科");
		
		Department GImedicine = new Department("消化内科");
		Department DeofCard = new Department("心血管科");
		Department orthopaedics = new Department("骨科");
		Department neurosurgery = new Department("神经外科");
		
	
		Doctor liudo = new Doctor("1.刘丽");
		Doctor yangdo = new Doctor("2.杨晓平");
		Doctor lido = new Doctor("3.李江涛");
		Doctor zhoudo = new Doctor("4.周桂林");
		Doctor yangqido = new Doctor("5.杨启才");
		
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
