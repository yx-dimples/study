/**
 * ����һ��Ϊ��������ͼ��д���򵥹������������������󹤳���ʵ�ʴ���
 * 		1.�򵥹���
 * @author Moppet
 * @since JDk 1.8.0
 * @data 2021/4/8
 * @version V1.0.0
 */

public class Question1 {
	public static void main(String[] args) {
		RootVegetablesfactory rootVegetablesFactory = new RootVegetablesfactory();	
		RootVegetables potato = rootVegetablesFactory.getVegetable("potato"); 
		potato.sow();
		potato.growUp();
		potato.fruit();
		System.out.println("");
		RootVegetables turnip = rootVegetablesFactory.getVegetable("turnip"); 
		turnip.sow();
		turnip.growUp();
		turnip.fruit();
		System.out.println("");
		RootVegetables carrot = rootVegetablesFactory.getVegetable("carrot"); 
		carrot.sow();
		carrot.growUp();
		carrot.fruit();
		System.out.println("");
		RootVegetables radish = rootVegetablesFactory.getVegetable("radish"); 
		radish.sow();
		radish.growUp();
		radish.fruit();
		System.out.println("");
	}
}
//�������߲�
interface RootVegetables{
	// ����
	void sow();
	// �ɳ�
	void growUp();
	// ��ʵ
	void fruit();
}

//����
class BeanPotato implements RootVegetables{
	@Override
	public void sow() {
		System.out.println("�ֲ˹������˶���");
	}
	@Override
	public void growUp() {
		System.out.println("�������ڳɳ�");	
	}
	@Override
	public void fruit() {
		System.out.println("�����Ѿ������ˣ��Ѿ��й�ʵ������");
	}
}
//��ͷ��
class ATurnip implements RootVegetables{
	@Override
	public void sow() {
		System.out.println("�ֲ˹������˴�ͷ��");
	}
	@Override
	public void growUp() {
		System.out.println("��ͷ�����ڳɳ�");	
	}
	@Override
	public void fruit() {
		System.out.println("��ͷ���Ѿ������ˣ��Ѿ��й�ʵ������");
	}
}
//���ܲ�
class Carrot implements RootVegetables{
	@Override
	public void sow() {
		System.out.println("�ֲ˹������˺��ܲ�");
	}
	@Override
	public void growUp() {
		System.out.println("���ܲ����ڳɳ�");	
	}
	@Override
	public void fruit() {
		System.out.println("���ܲ��Ѿ������ˣ��Ѿ��й�ʵ������");
	}
}
//�ܲ�
class Radish implements RootVegetables{
	@Override
	public void sow() {
		System.out.println("�ֲ˹��������ܲ�");
	}
	@Override
	public void growUp() {
		System.out.println("�ܲ����ڳɳ�");	
	}
	@Override
	public void fruit() {
		System.out.println("�ܲ��Ѿ������ˣ��Ѿ��й�ʵ������");
	}
}
//�ָ������߲˹���
class RootVegetablesfactory {
	public RootVegetables getVegetable(String type) {
		if(type.equalsIgnoreCase("potato")) {
			return new BeanPotato ();
		}
		if(type.equalsIgnoreCase("turnip")) {
			return new ATurnip();
		}
		if(type.equalsIgnoreCase("carrot")) {
			return new Carrot();
		}
		if(type.equalsIgnoreCase("radish")) {
			return new Radish();
		}
		return null;
	}
}

