/**
 * ����һ��Ϊ��������ͼ��д���򵥹������������������󹤳���ʵ�ʴ���
 * 		3.���󹤳�
 * @author Moppet
 * @since JDk 1.8.0
 * @data 2021/4/8
 * @version V1.0.0
 */

public class Question3 {
	public static void main(String[] args) {
		Vegetablesfactory1 plantTransgeniPlants = new PlantTransgeniPlants();
		Vegetablesfactory1 plantNoTransgeniPlants = new PlantNoTransgeniPlants();
		
		Vegetables1 transgeneRootVegetables = plantTransgeniPlants.growingRootVegetables();
		Vegetables1 transgeneStemVegetables = plantTransgeniPlants.growingStemVegetables();
		
		Vegetables1 noTransgeneRootVegetables = plantNoTransgeniPlants.growingRootVegetables();
		Vegetables1 noTransgeneStemVegetables = plantNoTransgeniPlants.growingStemVegetables();
		
		transgeneRootVegetables.sow();
		transgeneRootVegetables.growUp();
		transgeneRootVegetables.fruit();
		System.out.println();
		transgeneStemVegetables.sow();
		transgeneStemVegetables.growUp();
		transgeneStemVegetables.fruit();
		System.out.println();
		noTransgeneRootVegetables.sow();
		noTransgeneRootVegetables.growUp();
		noTransgeneRootVegetables.fruit();
		System.out.println();
		noTransgeneStemVegetables.sow();
		noTransgeneStemVegetables.growUp();
		noTransgeneStemVegetables.fruit();
	}
}
//�������߲�
interface Vegetables1{
	// ����
	void sow();
	// �ɳ�
	void growUp();
	// ��ʵ
	void fruit();
}

//����
interface RootVegetable1 extends Vegetables1{}
//����
interface StemVegetables1 extends Vegetables1{}

//ת�������
class TransgeneRootVegetables implements RootVegetable1{
	@Override
	public void sow() {
		System.out.println("�ֲ˹�������ת�������");
	}
	@Override
	public void growUp() {
		System.out.println("ת����������ڳɳ�");	
	}
	@Override
	public void fruit() {
		System.out.println("ת��������Ѿ������ˣ��Ѿ��й�ʵ������");
	}
}
//��ת�������
class NoTransgeneRootVegetables implements RootVegetable1{
	@Override
	public void sow() {
		System.out.println("�ֲ˹������˷�ת�������");
	}
	@Override
	public void growUp() {
		System.out.println("��ת����������ڳɳ�");	
	}
	@Override
	public void fruit() {
		System.out.println("��ת��������Ѿ������ˣ��Ѿ��й�ʵ������");
	}
}
//ת���򾥲�
class TransgeneStemVegetables implements RootVegetable1{
	@Override
	public void sow() {
		System.out.println("�ֲ˹�������ת���򾥲�");
	}
	@Override
	public void growUp() {
		System.out.println("ת���򾥲����ڳɳ�");	
	}
	@Override
	public void fruit() {
		System.out.println("ת���򾥲��Ѿ������ˣ��Ѿ��й�ʵ������");
	}
}
//��ת���򾥲�
class NoTransgeneStemVegetables implements RootVegetable1{
	@Override
	public void sow() {
		System.out.println("�ֲ˹������˷�ת���򾥲�");
	}
	@Override
	public void growUp() {
		System.out.println("��ת���򾥲����ڳɳ�");	
	}
	@Override
	public void fruit() {
		System.out.println("��ת���򾥲��Ѿ������ˣ��Ѿ��й�ʵ������");
	}
}



//�߲˹���
interface Vegetablesfactory1{
	Vegetables1 growingRootVegetables();
	Vegetables1 growingStemVegetables();
}
//��ֲת���򹤳�
class PlantTransgeniPlants implements Vegetablesfactory1{
	@Override
	public Vegetables1 growingRootVegetables() {
		return new TransgeneRootVegetables();
	}

	@Override
	public Vegetables1 growingStemVegetables() {
		return new TransgeneStemVegetables();
	}
}
//��ֲ��ת���򹤳�
class PlantNoTransgeniPlants implements Vegetablesfactory1{
	@Override
	public Vegetables1 growingRootVegetables() {
		return new NoTransgeneRootVegetables();
	}

	@Override
	public Vegetables1 growingStemVegetables() {
		return new NoTransgeneStemVegetables();
	}
}