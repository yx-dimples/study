/**
 * 任务一：为以下三个图，写出简单工厂，工厂方法，抽象工厂的实际代码
 * 		2.工厂方法
 * @author Moppet
 * @since JDk 1.8.0
 * @data 2021/4/8
 * @version V1.0.0
 */

public class Question2 {
	public static void main(String[] args) {
		PlantRootVegetableFactory plantRootVegetableFactory = new PlantRootVegetableFactory();	
		Vegetables plantRootVegetable = plantRootVegetableFactory.growingVegetables();
		plantRootVegetable.sow();
		plantRootVegetable.growUp();
		plantRootVegetable.fruit();
		System.out.println("");
		PlantStemVegetableFactory plantStemVegetableFactory = new PlantStemVegetableFactory();
		Vegetables plantStemVegetable = plantStemVegetableFactory.growingVegetables();
		plantStemVegetable.sow();
		plantStemVegetable.growUp();
		plantStemVegetable.fruit();
	}
}
//根菜类蔬菜
interface Vegetables{
	// 播种
	void sow();
	// 成长
	void growUp();
	// 果实
	void fruit();
}

//根菜类蔬菜
class RootVegetable implements Vegetables{
	@Override
	public void sow() {
		System.out.println("种菜工人种了根菜类蔬菜");
	}
	@Override
	public void growUp() {
		System.out.println("根菜类蔬菜正在成长");	
	}
	@Override
	public void fruit() {
		System.out.println("根菜类蔬菜已经长大了，已经有果实啦！！");
	}
}
//茎菜类蔬菜
class StemVegetables implements Vegetables{
	@Override
	public void sow() {
		System.out.println("种菜工人种了茎菜类蔬菜");
	}
	@Override
	public void growUp() {
		System.out.println("茎菜类蔬菜正在成长");	
	}
	@Override
	public void fruit() {
		System.out.println("茎菜类蔬菜已经长大了，已经有果实啦！！");
	}
}


//蔬菜工厂
interface Vegetablesfactory {
	Vegetables growingVegetables();
}
//种植根菜工厂
class PlantRootVegetableFactory implements Vegetablesfactory{
	@Override
	public Vegetables growingVegetables() {
		return new RootVegetable();
	}
}
//种植茎菜工厂
class PlantStemVegetableFactory implements Vegetablesfactory{
	@Override
	public Vegetables growingVegetables() {
		return new StemVegetables();
	}
}
