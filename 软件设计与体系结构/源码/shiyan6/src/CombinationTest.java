import java.util.ArrayList;
import java.util.List;

/**
 * 现代计算机一般分为具有以下部件：键盘、显示器、机箱、鼠标。而机箱内部包括了主板、硬盘、电源等。
 * 主板是主机的心脏，其上面一般又插入了CPU,内存，显卡等设备，请用组合模式描述一台计算机，并尝试根据自己的对游戏的知识，实现一台电脑，能进行“绝地求生”游戏。
 * @author Moppet
 *
 */
abstract class Component{
	protected String name;
	abstract void add(Component component);
	abstract void print();
	
	
}

class Composite extends Component {
	
	public Composite(String name) {
		this.name = name;
	}
	List<Component> compositeList = new ArrayList<Component>();
	
	@Override
	void add(Component component) {
		compositeList.add(component);
		
	}
	@Override
	void print() {
		System.out.println(name);
		for(Component item: compositeList) {
			item.print();
		}
	}	
}

class Leaf extends Component {
	
	public Leaf(String name) {
		this.name = name;
	}
	List<Component> compositeList = new ArrayList<Component>();
	
	@Override
	void add(Component component) {}
	
	@Override
	void print() {
		System.out.println(name);
		for(Component item: compositeList) {
			item.print();
		}
	}	
}

public class CombinationTest {

	public static void main(String[] args) {
		Composite games = new Composite("玩绝地求生游戏的配置:");
		Leaf keyboard = new Leaf("键盘: 北通K1键盘");
		Leaf monitor = new Leaf("显示器: 飞利浦（PHILIPS） 278M6FJMB 27英寸 曲面屏2K/144Hz电竞显示器");
		Composite chassis = new Composite("机箱: 航嘉MVP2机箱");
		Leaf mouse = new Leaf("鼠标: 罗技GPW无线鼠标");
		
		Composite motherboard = new Composite("主板: 华硕Z390-PLUS GAMING主板");
		Leaf harddisk = new Leaf("硬盘: 三星750EVO 250G SATA3 SSD固态硬盘");
		Leaf powersupply = new Leaf("电源:  1200w");
		
		Leaf cpu = new Leaf("CPU: Intel Core i3-4340 / AMD FX-6300");
		Leaf graphicscard = new Leaf("显卡: 索泰Geforce GTX1060-6GD5 X-GAMING OC");
		Leaf networkcard = new Leaf("网卡: 基于PCI的无线网卡");
		
		games.add(keyboard);
		games.add(monitor);
		games.add(chassis);
		games.add(mouse);
		
		chassis.add(motherboard);
		chassis.add(harddisk);
		chassis.add(powersupply);
		motherboard.add(cpu);
		motherboard.add(graphicscard);
		motherboard.add(networkcard);
		
		games.print();
		
	}

}
 