
/**  
 * <p> 任务二 </p> 
 *	1. 工厂方法UML图代码框架
* @since JDk 1.8.0
* @data 2021/3/21
 * @version V1.0.0
 */
public class Test04 {
	public static void main(String[] args) {
		/*
		 * Test:
		 * 	1. 声明产品对象用于接收通过工厂模式创建的具体产品对象、
		 * 	2. 通过具体产品工厂类获取具体产品的对象
		 * 	3. 产品调用测试方法进行验证
		 */
		IProduct iProduct;
		IFactory iFactory = new ConcreteFactory();
		iProduct = iFactory.FactoryMethod();
		iProduct.play();
	}
}

/*
 *定义抽象IProduct类
 */
abstract class IProduct{
	/*
	 * 定义一个抽象方法
	 */
	public abstract void play();
}

/*
 * 具体实现ConreteProduct的类
 */
class ConreteProduct extends IProduct{

	/*
	 *实现抽象方法进行测试    
	 */
	@Override
	public void play() {
		System.out.println("This is ConreteProduct");
	}
}

/*
 * 工厂方法工厂抽象类 
 */
abstract class IFactory{
	
	/*
	 * 生成获取Product对象 
	 */
	public abstract IProduct FactoryMethod();
}

/*
 * 产品具体的工厂模式  
 */
class ConcreteFactory extends IFactory{

	/*  
	 *  获取具体产品对象
	 */
	public IProduct FactoryMethod() {
		return new ConreteProduct();
	}
	
}