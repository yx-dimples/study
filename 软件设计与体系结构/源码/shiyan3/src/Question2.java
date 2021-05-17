/**
 * ����һ��Ϊ��������ͼ��д���򵥹������������������󹤳���ʵ�ʴ���
 * 		2.��������
 * @author Moppet
 * @since JDk 1.8.0
 * @data 2021/4/8
 * @version V1.0.0
 */

public class Question2 {
	public static void main(String[] args) {
		PlantRootVegetableFactory plantRootVegetableFactory = new PlantRootVegetableFactory();	
		Vegetables plantRootVegetable = plantRootVegetableFactory.growingVegetables();
		plantRootVegetable.sow();
		plantRootVegetable.growUp();
		plantRootVegetable.fruit();
		System.out.println("");
		PlantStemVegetableFactory plantStemVegetableFactory = new PlantStemVegetableFactory();
		Vegetables plantStemVegetable = plantStemVegetableFactory.growingVegetables();
		plantStemVegetable.sow();
		plantStemVegetable.growUp();
		plantStemVegetable.fruit();
	}
}
//�������߲�
interface Vegetables{
	// ����
	void sow();
	// �ɳ�
	void growUp();
	// ��ʵ
	void fruit();
}

//�������߲�
class RootVegetable implements Vegetables{
	@Override
	public void sow() {
		System.out.println("�ֲ˹������˸������߲�");
	}
	@Override
	public void growUp() {
		System.out.println("�������߲����ڳɳ�");	
	}
	@Override
	public void fruit() {
		System.out.println("�������߲��Ѿ������ˣ��Ѿ��й�ʵ������");
	}
}
//�������߲�
class StemVegetables implements Vegetables{
	@Override
	public void sow() {
		System.out.println("�ֲ˹������˾������߲�");
	}
	@Override
	public void growUp() {
		System.out.println("�������߲����ڳɳ�");	
	}
	@Override
	public void fruit() {
		System.out.println("�������߲��Ѿ������ˣ��Ѿ��й�ʵ������");
	}
}


//�߲˹���
interface Vegetablesfactory {
	Vegetables growingVegetables();
}
//��ֲ���˹���
class PlantRootVegetableFactory implements Vegetablesfactory{
	@Override
	public Vegetables growingVegetables() {
		return new RootVegetable();
	}
}
//��ֲ���˹���
class PlantStemVegetableFactory implements Vegetablesfactory{
	@Override
	public Vegetables growingVegetables() {
		return new StemVegetables();
	}
}
