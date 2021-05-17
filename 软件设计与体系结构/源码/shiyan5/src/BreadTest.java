/**
 * 实验二：现假设要实现一个面包店的应用程序，其基本类为面包，现假设基础面包类实现如下：
*public abstract class Bread{
*        public double cost();      //计算面包的价格
*        public string getDescription();  //获取面包的描述
*}
*通过该基础面包类，可以得到3种基本面包类型：日式面包，法式面包，美式面包，现基础面包的情况下，请根据自己日常情况，加入6-10种调料，可以形成对应的面包品种，请利用装饰器模式实现这个功能
 * @author Moppet
 */

abstract class Bread{
	//计算面包的价格
	public abstract double cost();  
	//获取面包的描述
	public abstract String getDescription();  
}

/*
 * 日式面包
 */
class JapaneseBread extends Bread {

	@Override
	public double cost() {
		return 12;
	}

	@Override
	public String getDescription() {
		return "日式面包";
	}
	
}

/*
 * 法式面包
 */
class FrenchBread extends Bread {

	@Override
	public double cost() {
		return 10;
	}

	@Override
	public String getDescription() {
		return "法式面包";
	}
	
}

/*
 * 美式面包
 */
class AmericanBread extends Bread {

	@Override
	public double cost() {
		return 15;
	}

	@Override
	public String getDescription() {
		return "美式面包";
	}
	
}

/*
 * 装饰器接口
 */
class BreadDecorator extends Bread{
	public Bread bread;

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}

/*
 * 芝麻 sesame
 */
class Sesame extends BreadDecorator {
	public Sesame(Bread bread) {
		this.bread = bread;
	}

	@Override
	public double cost() {
		return bread.cost() + 1.5;
	}

	@Override
	public String getDescription() {
		return bread.getDescription() + "芝麻馅";
	}
	
}

/*
 *花生 peanut
 */
class Peanut extends BreadDecorator {
	public Peanut(Bread bread) {
		this.bread = bread;
	}

	@Override
	public double cost() {
		return bread.cost() + 4;
	}

	@Override
	public String getDescription() {
		return bread.getDescription() + "花生馅";
	}
	
}

/*
 * 奶黄CreamYellow
 */
class CreamYellow extends BreadDecorator {
	public CreamYellow(Bread bread) {
		this.bread = bread;
	}

	@Override
	public double cost() {
		return bread.cost() + 1;
	}

	@Override
	public String getDescription() {
		return bread.getDescription() + "奶黄馅";
	}
	
}

/*
 * 奶椰 MilkCoconut
 */
class MilkCoconut extends BreadDecorator {
	public MilkCoconut(Bread bread) {
		this.bread = bread;
	}

	@Override
	public double cost() {
		return bread.cost() + 3;
	}

	@Override
	public String getDescription() {
		return bread.getDescription() + "奶椰馅";
	}
	
}

/*
 * 奶酥 Pastry
 */
class Pastry extends BreadDecorator {
	public Pastry(Bread bread) {
		this.bread = bread;
	}

	@Override
	public double cost() {
		return bread.cost() + 2;
	}

	@Override
	public String getDescription() {
		return bread.getDescription() + "奶酥馅";
	}
	
}

/*
 *提子吉士 Tizijishi
 */
class Tizijishi extends BreadDecorator {
	public Tizijishi(Bread bread) {
		this.bread = bread;
	}

	@Override
	public double cost() {
		return bread.cost() + 5;
	}

	@Override
	public String getDescription() {
		return bread.getDescription() + "提子吉士馅";
	}
	
}


public class BreadTest {

	public static void main(String[] args) {
		// 日式面包芝麻馅的价格：13.5元
		Bread bread = new JapaneseBread();
		BreadDecorator breadDecorator = new Sesame(bread);
		System.out.println(breadDecorator.getDescription() + "的价格：" + breadDecorator.cost() + "元");
		// 美式面包奶椰馅的价格18.0元
		Bread bread2 = new AmericanBread();
		BreadDecorator breadDecorator2 = new MilkCoconut(bread2);
		System.out.println(breadDecorator2.getDescription() + "的价格" + breadDecorator2.cost() + "元");
		// 法式面包提子吉士馅的价格：15.0元
		Bread bread3 = new FrenchBread();
		BreadDecorator breadDecorator3 = new Tizijishi(bread3);
		System.out.println(breadDecorator3.getDescription() + "的价格：" + breadDecorator3.cost() + "元");
	}

}
