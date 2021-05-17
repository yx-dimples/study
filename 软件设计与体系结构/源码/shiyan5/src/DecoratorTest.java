/**
 * 实验一：理解装饰器模式，根据UML图写出通用代码
 * @author Moppet
 */
/*
 * 产品抽象接口
 */
interface Component {
	// 产品对应的方法：价格
	Double opration();
}
/*
 * 具体的产品
 */
class ConcreateComponent implements Component {

	@Override
	public Double opration() {
		return 30.00;
	}
	
}
/*
 * 装饰器接口
 */
abstract class Decorator implements Component{
	protected Component component;
}
/*
 * 具体的装饰器
 */
class ConcreateDecorator extends Decorator {
	public ConcreateDecorator(Component component) {
		this.component = component;
	}

	@Override
	public Double opration() {
		return component.opration() + 10.00;
	}
	
}
/*
 * 测试
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Component com = new ConcreateComponent();
		ConcreateDecorator con = new ConcreateDecorator(com);
		System.out.println("价格:" + con.opration());
	}

}
