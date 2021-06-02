import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * ���е��̼Ҳ˵�ϵͳ�Ĳ˵���Menu���ʾ����Ҫ����Ϊ������۸񣬲˵���������������Ҫ��4�����ݽṹʵ�֣���ͳ���飬arrayList, List, Map��
 * �ּ���Ҫʵ��һ�����ţ���ϵͳҪ�Խ����е��̼Ҳ˵�ϵͳ�����ֲ��ܸ������е��̼Ҳ˵�ϵͳ����ʹ�õ�����ģʽ������̼�ϵͳ�ĶԽӡ�
 */
/*
 * �˵�����
 */
class Menu {
	private String name; // �˵���
	private double price; // ����۸�
	private String description; // ����
	
	public Menu(String name, double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}
}

/*
 * �˵�ϵͳ������
 */
interface Iterator {
	// �жϵ�ǰԪ���Ƿ����
	boolean hasNext();
	
	// ��ȡ��ǰ���ڵ�Ԫ�أ���Ԫ��ָ��ָ����һ��
	Object next();
}

/*
 * �ɹ�������
 */
class DrypanIterator implements Iterator {
	
	List<Menu> dryPan;
	
	int posittion = 0;

	public DrypanIterator(List<Menu> dryPan) {
		this.dryPan = dryPan;
	}

	@Override
	public boolean hasNext() {
		if (dryPan.size() != 0 && posittion < dryPan.size() && dryPan.get(posittion) != null) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		return dryPan.get(posittion++);
	}
}

/*
 * ���������
 */
class HotpotIterator implements Iterator {

	ArrayList<Menu> hotPot;

    int posittion = 0;

    public HotpotIterator(ArrayList<Menu> hotPot) {
        this.hotPot = hotPot;
    }

	@Override
	public boolean hasNext() {
		return false;
		
	}

	@Override
	public Object next() {
		return hotPot;
		
	}
	
}

/*
 * ���������
 */
class BarbecueIterator implements Iterator {

	Menu[] barbecue;

    int posittion = 0;

    public BarbecueIterator(Menu[] barbecue) {
        this.barbecue = barbecue;
    }

	@Override
	public boolean hasNext() {
		if (posittion < barbecue.length && barbecue[posittion] != null ){
            return true;
        }
		return false;
	}

	@Override
	public Object next() {
		return barbecue[posittion++];
	}
	
}

/*
 * �����Ʒ������
 */
class DessertDrinksIterator implements Iterator {

	Map<String, Menu> dessertDrinks;
	
	java.util.Iterator<Map.Entry<String, Menu>> it ;
	
	@SuppressWarnings("rawtypes")
	Map.Entry entry;

	public DessertDrinksIterator(Map<String, Menu> dessertDrinks) {
		this.dessertDrinks = dessertDrinks;
		it = dessertDrinks.entrySet().iterator();
	}

	@Override
	public boolean hasNext() {
		return it.hasNext();
	}

	@Override
	public Object next() {
		Map.Entry<String, Menu> entry = it.next();
		return entry.getValue();	}
}



/*
 * �ɹ�
 */
class DryPan {
	List<Menu> dryPan = new LinkedList<Menu>();
    
    public void addMenu(String name, String describe, double price) {
		dryPan.add(new Menu(name, price, describe));
	}

    public Iterator createIterator() {
		return new DrypanIterator(dryPan);
	}
}

/*
 * ���
 */
class HotPot {
	ArrayList<Menu> hotPot = new ArrayList<Menu>();

	 public void addMenu(String name, String describe, double price) {
		hotPot.add(new Menu(name, price, describe));
	}

    public Iterator createIterator() {
		return new HotpotIterator(hotPot);
	}
}


/*
 * ����
 */
class Barbecue{

	// ����˵���Ʒ�������
	private static final Integer MENU_ITEM_MAX = 10;
	
	int numberOfItems = 0; 
	
	// ����˵�
	Menu[] barbecue = new Menu[MENU_ITEM_MAX];

    public void addMenu(String name, String description, double price) {
		if(numberOfItems < MENU_ITEM_MAX) {
			barbecue[numberOfItems++] = new Menu(name, price, description);
		}
	}

    public Iterator createIterator() {
		return new BarbecueIterator(barbecue);
	}
}

/*
 * �����Ʒ
 */
class DessertDrinks{
	Map<String, Menu> dessertDrinks = new HashMap<String, Menu>();
    
    public void addMenu(String name, String description, double price) {
    	dessertDrinks.put(UUID.randomUUID().toString(), new Menu(name, price, description));
	}
    
    public Iterator createIterator() {
		return new DessertDrinksIterator(dessertDrinks);
	}
}

class Meituan {
    DryPan dryPan;
    HotPot hotPot;
    Barbecue barbecue;
    DessertDrinks dessertDrinks;

    public Meituan(DryPan dryPan, HotPot hotPot, Barbecue barbecue, DessertDrinks dessertDrinks){
        this.dryPan = dryPan;
        this.hotPot = hotPot;
        this.barbecue = barbecue;
        this.dessertDrinks = dessertDrinks;
    }
    
    public Meituan(DryPan dryPan) {
    	this.dryPan = dryPan;
    }
    
    public Meituan(HotPot hotPot) {
    	this.hotPot = hotPot;
    }
    
    public Meituan(Barbecue barbecue) {
    	this.barbecue = barbecue;
    }
    
    public Meituan(DessertDrinks siChuanRestaurant) {
    	this.dessertDrinks = siChuanRestaurant;
    }
    

    public void printMenu() {
    	
    	Iterator dryPanIterator = dryPan.createIterator();
    	Iterator hotPotIterator = hotPot.createIterator();
    	Iterator barbecueIterator = barbecue.createIterator();
    	Iterator dessertDrinksIterator = dessertDrinks.createIterator();
    	
    	printMenuItem(dryPanIterator);
    	printMenuItem(hotPotIterator);
    	printMenuItem(barbecueIterator);
    	printMenuItem(dessertDrinksIterator);
    	
    }

    private void printMenuItem(Iterator menuItertor) {
		while (menuItertor.hasNext()) {
			Menu next = (Menu) menuItertor.next();
			System.out.print(next.getName() + " " + next.getDescription() + " �۸�"
					+ next.getPrice() + "\n");
		}
		System.out.println();
    }

}

public class IteratorTest {

	public static void main(String[] args) {
		// �ɹ��˵�
		DryPan dryPan = new DryPan();
		dryPan.addMenu("�ɹ�Ѽ��", "Ŵ��ζ����Ѽ��", 56.00);
		dryPan.addMenu("�ɹ�Ϻ", "���ʵ�Ϻ", 45.00);
		dryPan.addMenu("�ɹ��Ź�", "�����Ź�", 50.00);
		
		// ����˵�
		HotPot hotPot = new HotPot();
		hotPot.addMenu("99Ԫ˫���ײ�", "����ţ�⡢ǧ��ǡ���ţ������ţ��...", 99.00);
		hotPot.addMenu("��������4�˲�", "��������ըţ�⡢��ը�廨�⡢����...", 143.00);
		hotPot.addMenu("1Ԫ���˲�", "��ѩ����Բ", 0.70);
		
		// ����˵�
		Barbecue barbecue = new Barbecue();
		barbecue.addMenu("��ɫ��������", "�п����࣬�����࣬��˾�࣬���и����زˡ���ƷŶ", 67.00);
		barbecue.addMenu("���4��2С", "�п����࣬�����࣬��˾�࣬���и����زˡ���ƷŶ", 288.00);
		barbecue.addMenu("��Ʒ���˺�������", "�п����࣬�����࣬��˾�࣬���и����زˡ���ƷŶ", 73.00);
		
		// �����Ʒ�˵�
		DessertDrinks dessertDrinks = new DessertDrinks();
		dessertDrinks.addMenu("ˮ������", "��6Ӣ�磬Բ��", 98.00);
		dessertDrinks.addMenu("���ɲ�", "�󱭣���������", 9.90);
		dessertDrinks.addMenu("֥ʿâ�����", "������Ʒ��Ī�����ȵ�", 18.00);
		
		
		Meituan meituan = new Meituan(dryPan, hotPot, barbecue, dessertDrinks);
		meituan.printMenu();
		
	}
	
}