/**
 * 任务一：为以下三个图，写出简单工厂，工厂方法，抽象工厂的实际代码
 * 		1.简单工厂
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
//根菜类蔬菜
interface RootVegetables{
	// 播种
	void sow();
	// 成长
	void growUp();
	// 果实
	void fruit();
}

//豆薯
class BeanPotato implements RootVegetables{
	@Override
	public void sow() {
		System.out.println("种菜工人种了豆薯");
	}
	@Override
	public void growUp() {
		System.out.println("豆薯正在成长");	
	}
	@Override
	public void fruit() {
		System.out.println("豆薯已经长大了，已经有果实啦！！");
	}
}
//大头菜
class ATurnip implements RootVegetables{
	@Override
	public void sow() {
		System.out.println("种菜工人种了大头菜");
	}
	@Override
	public void growUp() {
		System.out.println("大头菜正在成长");	
	}
	@Override
	public void fruit() {
		System.out.println("大头菜已经长大了，已经有果实啦！！");
	}
}
//胡萝卜
class Carrot implements RootVegetables{
	@Override
	public void sow() {
		System.out.println("种菜工人种了胡萝卜");
	}
	@Override
	public void growUp() {
		System.out.println("胡萝卜正在成长");	
	}
	@Override
	public void fruit() {
		System.out.println("胡萝卜已经长大了，已经有果实啦！！");
	}
}
//萝卜
class Radish implements RootVegetables{
	@Override
	public void sow() {
		System.out.println("种菜工人种了萝卜");
	}
	@Override
	public void growUp() {
		System.out.println("萝卜正在成长");	
	}
	@Override
	public void fruit() {
		System.out.println("萝卜已经长大了，已经有果实啦！！");
	}
}
//种根菜类蔬菜工厂
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

