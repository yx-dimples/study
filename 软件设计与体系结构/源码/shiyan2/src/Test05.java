/**  
 * <p> ����� </p> 
 *	1. P55ҳ��4��
* @since JDk 1.8.0
* @data 2021/3/21
 * @version V1.0.0
 */
public class Test05 {
	public static void main(String[] args) {
		/*
		 * Test:
		 * 	1. ͨ��������������������Ӧ������
		 * 	2. �����ɹ�������Ʒ�ƽ��в���
		 */
		Car bmwCar = new BMWFactory().getCar();
		Car benzCar = new BenzFactory().getCar();
		bmwCar.play();
		benzCar.play();
	}
}

/*
 *Car������  
 */
abstract class Car{
	
	/*
	 *  ������Է���
	 */
	public abstract void play();
}

/*
 *  ����  
 */
class BMW extends Car{
	public void play() {
		System.out.println("BMW �����ɹ�");
	}
}

/*
 * ���� 
 */
class Benz extends Car{

	public void play() {
		System.out.println("Benz �����ɹ�");
	}
} 

/*
 * �������������� 
 */
abstract class CarFactory{
	
	/*
	 *��ȡcar������󷽷� 
	 */
	public abstract Car getCar();
}

/*
 *BMW������
 */
class BMWFactory extends CarFactory{
	public Car getCar() {
		return new BMW();
	}
}

/*
 * Benz������ 
 *
 */
class BenzFactory extends CarFactory{
	
	public Car getCar() {
		return new Benz();
	}
}