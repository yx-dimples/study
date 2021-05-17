/**  
 * <p> 任务二 </p> 
 *	1. P55页第4题
* @since JDk 1.8.0
* @data 2021/3/21
 * @version V1.0.0
 */
public class Test05 {
	public static void main(String[] args) {
		/*
		 * Test:
		 * 	1. 通过具体汽车工厂生产对应的汽车
		 * 	2. 生产成功的汽车品牌进行测试
		 */
		Car bmwCar = new BMWFactory().getCar();
		Car benzCar = new BenzFactory().getCar();
		bmwCar.play();
		benzCar.play();
	}
}

/*
 *Car抽象类  
 */
abstract class Car{
	
	/*
	 *  抽象测试方法
	 */
	public abstract void play();
}

/*
 *  宝马车  
 */
class BMW extends Car{
	public void play() {
		System.out.println("BMW 生产成功");
	}
}

/*
 * 奔驰 
 */
class Benz extends Car{

	public void play() {
		System.out.println("Benz 生产成功");
	}
} 

/*
 * 汽车工厂抽象类 
 */
abstract class CarFactory{
	
	/*
	 *获取car对象抽象方法 
	 */
	public abstract Car getCar();
}

/*
 *BMW工厂类
 */
class BMWFactory extends CarFactory{
	public Car getCar() {
		return new BMW();
	}
}

/*
 * Benz工厂类 
 *
 */
class BenzFactory extends CarFactory{
	
	public Car getCar() {
		return new Benz();
	}
}