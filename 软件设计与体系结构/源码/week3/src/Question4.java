/**
 * �������P70ҳ ��4�⣬�ṩϵͳ��UMLͼ�ʹ�����
 * @author Moppet
 * @since JDk 1.8.0
 * @data 2021/4/8
 * @version V1.0.0
 */
public class Question4 {
	public static void main(String[] args) {
		System.out.println("Haier��������");
		//����Haier��������
		Factory haierFactort = new HaierFactory();
		//ͨ��Haier��������Haier�յ�
		AirConditioner haierAir = haierFactort.getAirConditioner();
		haierAir.use();
		//ͨ��Haier��������Haier����
		Television haierTV = haierFactort.getTelevision();
		haierTV.use();
		System.out.println();
		System.out.println("TCL��������");
		//����TCL��������
		Factory tclFactort = new TCLFactory();
		//ͨ��TCL��������TCL�յ�
		AirConditioner tclAir = tclFactort.getAirConditioner();
		tclAir.use();
		//ͨ��TCL��������TCL����
		Television tclTV = tclFactort.getTelevision();
		tclTV.use();
		
	}
}
//����
interface ElectricAppliance {
	void use();
}
//�յ�
interface AirConditioner extends ElectricAppliance {}
//���Ӿ�
interface Television extends ElectricAppliance {}
//Haier�յ�
class HaierAir implements AirConditioner {
	@Override
	public void use() {
		System.out.println("�����յ�����ʹ��...");
	}
}
//TCL�յ�
class TClAir implements AirConditioner {
	@Override
	public void use() {
		System.out.println("TCL�յ�����ʹ��...");
	}
}
//Haier����
class HaierTV implements Television {
	@Override
	public void use() {
		System.out.println("������������ʹ��...");
	}
}
//TCL����
class TCLTV implements Television {
	@Override
	public void use() {
		System.out.println("TCL��������ʹ��...");
	}
}
//����
interface Factory {
	AirConditioner getAirConditioner();
	Television getTelevision();
}
//Haier����
class HaierFactory implements Factory {
	@Override
	public AirConditioner getAirConditioner() {
		return new HaierAir();
	}
	@Override
	public Television getTelevision() {
		return new HaierTV();
	}
}
//TCL����
class TCLFactory implements Factory {
	@Override
	public AirConditioner getAirConditioner() {
		return new TClAir();
	}
	@Override
	public Television getTelevision() {
		return new TCLTV();
	}
}