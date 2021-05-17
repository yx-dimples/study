/**
* <p>任务一</p>
* 	1、参考简单工厂通用UML图，给出代码框架（基本代码框架）
* @since JDk 1.8.0
* @data 2021/3/21
 * @version V1.0.0
 */
public class Test01 {
	public static void main(String[] args) {
		/*
		 * Test：
		 * 	简单工厂创建对象测试
		 * 	1. 声明产品对象等待接收 想要得到的产品对象
		 * 	2. 通过工厂类中的getProduct("ProductA")方法获取具体产品对象
		 * 	3. getProduct("ProductA")方法中传入指定需要的对象ProductA
		 * 	4， 通过多态返回得到ProductA具体对象
		 */
		AbstractProduct product;
		product = Factory.getProduct("Product");
		product.methdDiff();
	}

}
/*
 * <p> 产品抽象，如果需要不同的产品，实现产品抽象接口即可 </p> 
 */
abstract class AbstractProduct{
	/*
	 * 抽象产品中的抽象方法   
	 */
	public abstract void methdDiff();
}

/*
 * ProductA 产品实现抽象产品 得到具体的ProductA
 */
class Product extends AbstractProduct{

	/*   
	 * Product 具体实现抽象方法，表明自身产品类别	
	 */
	public void methdDiff() {
		System.out.println("This is Product");
	}
}

/*
 * 简单工厂类，复制生成需要的产品对象
 *简单工厂类提供一个获取具体产品对象的静态方法getProduct(),通过getProduct()得到需要的产品对象
 */
class Factory{
	/*
	 * 获取指定产品对象
	 */
	public static AbstractProduct getProduct(String productType) {
		AbstractProduct abstractProduct = null;
		if(productType.equalsIgnoreCase("Product")) {
			abstractProduct = new Product();
			}
		return abstractProduct;
	}
}