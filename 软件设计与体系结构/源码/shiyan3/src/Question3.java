/**
 * 任务一：为以下三个图，写出简单工厂，工厂方法，抽象工厂的实际代码
 * 		3.抽象工厂
 * @author Moppet
 * @since JDk 1.8.0
 * @data 2021/4/8
 * @version V1.0.0
 */

public class Question3 {
	public static void main(String[] args) {
		Vegetablesfactory1 plantTransgeniPlants = new PlantTransgeniPlants();
		Vegetablesfactory1 plantNoTransgeniPlants = new PlantNoTransgeniPlants();
		
		Vegetables1 transgeneRootVegetables = plantTransgeniPlants.growingRootVegetables();
		Vegetables1 transgeneStemVegetables = plantTransgeniPlants.growingStemVegetables();
		
		Vegetables1 noTransgeneRootVegetables = plantNoTransgeniPlants.growingRootVegetables();
		Vegetables1 noTransgeneStemVegetables = plantNoTransgeniPlants.growingStemVegetables();
		
		transgeneRootVegetables.sow();
		transgeneRootVegetables.growUp();
		transgeneRootVegetables.fruit();
		System.out.println();
		transgeneStemVegetables.sow();
		transgeneStemVegetables.growUp();
		transgeneStemVegetables.fruit();
		System.out.println();
		noTransgeneRootVegetables.sow();
		noTransgeneRootVegetables.growUp();
		noTransgeneRootVegetables.fruit();
		System.out.println();
		noTransgeneStemVegetables.sow();
		noTransgeneStemVegetables.growUp();
		noTransgeneStemVegetables.fruit();
	}
}
//根菜类蔬菜
interface Vegetables1{
	// 播种
	void sow();
	// 成长
	void growUp();
	// 果实
	void fruit();
}

//根菜
interface RootVegetable1 extends Vegetables1{}
//茎菜
interface StemVegetables1 extends Vegetables1{}

//转基因根菜
class TransgeneRootVegetables implements RootVegetable1{
	@Override
	public void sow() {
		System.out.println("种菜工人种了转基因根菜");
	}
	@Override
	public void growUp() {
		System.out.println("转基因根菜正在成长");	
	}
	@Override
	public void fruit() {
		System.out.println("转基因根菜已经长大了，已经有果实啦！！");
	}
}
//非转基因根菜
class NoTransgeneRootVegetables implements RootVegetable1{
	@Override
	public void sow() {
		System.out.println("种菜工人种了非转基因根菜");
	}
	@Override
	public void growUp() {
		System.out.println("非转基因根菜正在成长");	
	}
	@Override
	public void fruit() {
		System.out.println("非转基因根菜已经长大了，已经有果实啦！！");
	}
}
//转基因茎菜
class TransgeneStemVegetables implements RootVegetable1{
	@Override
	public void sow() {
		System.out.println("种菜工人种了转基因茎菜");
	}
	@Override
	public void growUp() {
		System.out.println("转基因茎菜正在成长");	
	}
	@Override
	public void fruit() {
		System.out.println("转基因茎菜已经长大了，已经有果实啦！！");
	}
}
//非转基因茎菜
class NoTransgeneStemVegetables implements RootVegetable1{
	@Override
	public void sow() {
		System.out.println("种菜工人种了非转基因茎菜");
	}
	@Override
	public void growUp() {
		System.out.println("非转基因茎菜正在成长");	
	}
	@Override
	public void fruit() {
		System.out.println("非转基因茎菜已经长大了，已经有果实啦！！");
	}
}



//蔬菜工厂
interface Vegetablesfactory1{
	Vegetables1 growingRootVegetables();
	Vegetables1 growingStemVegetables();
}
//种植转基因工厂
class PlantTransgeniPlants implements Vegetablesfactory1{
	@Override
	public Vegetables1 growingRootVegetables() {
		return new TransgeneRootVegetables();
	}

	@Override
	public Vegetables1 growingStemVegetables() {
		return new TransgeneStemVegetables();
	}
}
//种植非转基因工厂
class PlantNoTransgeniPlants implements Vegetablesfactory1{
	@Override
	public Vegetables1 growingRootVegetables() {
		return new NoTransgeneRootVegetables();
	}

	@Override
	public Vegetables1 growingStemVegetables() {
		return new NoTransgeneStemVegetables();
	}
}