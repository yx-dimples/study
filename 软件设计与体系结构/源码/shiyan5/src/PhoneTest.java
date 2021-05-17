/**
 * 实验三：简单的手机(SimplePhone)在接收到来电的时候，会发出声音来提醒主人;而现在我们需要为该手机添加一项功能，
 * 在接收来电的时候，除了有声音还能产生振动(JarPhone);
 * 还可以得到更加高级的手机(ComplexPhone),来电时它不仅能够发声,产生振动，而且有灯光闪烁提示。
 * 现用装饰模式来模拟手机功能的升级过程,要求绘制类图并编程模拟实现。
 * @author Moppet
 *
 */
/*
 * 手机
 */
abstract class Phone {
	// 基础提示
	public abstract void basicTips();
}
/*
 * 简单的手机(SimplePhone)
 */
class SimplePhone extends Phone{

	@Override
	public void basicTips() {
		System.out.print("手机铃声响了 + ");
		
	}
}
/*
 * 手机装饰器
 */

abstract class PhoneDecorator extends Phone{
	public Phone phone;
}

/*
 * 产生振动(JarPhone)
 */
class JarPhone extends PhoneDecorator {

	public JarPhone(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void basicTips() {
		phone.basicTips();
		System.out.print("手机振动 + ");
	}
}

/*
 * 灯光闪烁提示(ComplexPhone)
 */
class ComplexPhone extends PhoneDecorator {
	
	public ComplexPhone(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void basicTips() {
		phone.basicTips();
		System.out.println("灯光闪烁提示");
	}
}

/*
 * 手机来电测试
 */
public class PhoneTest {

	public static void main(String[] args) {
		Phone phone = new SimplePhone();
		JarPhone jarPhone = new JarPhone(phone);
		ComplexPhone complexPhone = new ComplexPhone(jarPhone);
		complexPhone.basicTips();

	}

}
