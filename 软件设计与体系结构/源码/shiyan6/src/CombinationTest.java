import java.util.ArrayList;
import java.util.List;

/**
 * �ִ������һ���Ϊ�������²��������̡���ʾ�������䡢��ꡣ�������ڲ����������塢Ӳ�̡���Դ�ȡ�
 * ���������������࣬������һ���ֲ�����CPU,�ڴ棬�Կ����豸���������ģʽ����һ̨������������Ը����Լ��Ķ���Ϸ��֪ʶ��ʵ��һ̨���ԣ��ܽ��С�������������Ϸ��
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
		Composite games = new Composite("�����������Ϸ������:");
		Leaf keyboard = new Leaf("����: ��ͨK1����");
		Leaf monitor = new Leaf("��ʾ��: �����֣�PHILIPS�� 278M6FJMB 27Ӣ�� ������2K/144Hz�羺��ʾ��");
		Composite chassis = new Composite("����: ����MVP2����");
		Leaf mouse = new Leaf("���: �޼�GPW�������");
		
		Composite motherboard = new Composite("����: ��˶Z390-PLUS GAMING����");
		Leaf harddisk = new Leaf("Ӳ��: ����750EVO 250G SATA3 SSD��̬Ӳ��");
		Leaf powersupply = new Leaf("��Դ:  1200w");
		
		Leaf cpu = new Leaf("CPU: Intel Core i3-4340 / AMD FX-6300");
		Leaf graphicscard = new Leaf("�Կ�: ��̩Geforce GTX1060-6GD5 X-GAMING OC");
		Leaf networkcard = new Leaf("����: ����PCI����������");
		
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
 