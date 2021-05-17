/**
 * 完成书上P70页 第4题，提供系统的UML图和代码框架
 * @author Moppet
 * @since JDk 1.8.0
 * @data 2021/4/8
 * @version V1.0.0
 */
public class Question4 {
	public static void main(String[] args) {
		System.out.println("Haier工厂测试");
		//创建Haier工厂对象
		Factory haierFactort = new HaierFactory();
		//通过Haier工厂创建Haier空调
		AirConditioner haierAir = haierFactort.getAirConditioner();
		haierAir.use();
		//通过Haier工厂创建Haier电视
		Television haierTV = haierFactort.getTelevision();
		haierTV.use();
		System.out.println();
		System.out.println("TCL工厂测试");
		//创建TCL工厂对象
		Factory tclFactort = new TCLFactory();
		//通过TCL工厂创建TCL空调
		AirConditioner tclAir = tclFactort.getAirConditioner();
		tclAir.use();
		//通过TCL工厂创建TCL电视
		Television tclTV = tclFactort.getTelevision();
		tclTV.use();
		
	}
}
//电器
interface ElectricAppliance {
	void use();
}
//空调
interface AirConditioner extends ElectricAppliance {}
//电视剧
interface Television extends ElectricAppliance {}
//Haier空调
class HaierAir implements AirConditioner {
	@Override
	public void use() {
		System.out.println("海尔空调正在使用...");
	}
}
//TCL空调
class TClAir implements AirConditioner {
	@Override
	public void use() {
		System.out.println("TCL空调正在使用...");
	}
}
//Haier电视
class HaierTV implements Television {
	@Override
	public void use() {
		System.out.println("海尔电视正在使用...");
	}
}
//TCL电视
class TCLTV implements Television {
	@Override
	public void use() {
		System.out.println("TCL电视正在使用...");
	}
}
//工厂
interface Factory {
	AirConditioner getAirConditioner();
	Television getTelevision();
}
//Haier工厂
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
//TCL工厂
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