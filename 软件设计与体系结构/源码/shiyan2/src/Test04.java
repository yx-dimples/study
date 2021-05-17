
/**  
 * <p> ����� </p> 
 *	1. ��������UMLͼ������
* @since JDk 1.8.0
* @data 2021/3/21
 * @version V1.0.0
 */
public class Test04 {
	public static void main(String[] args) {
		/*
		 * Test:
		 * 	1. ������Ʒ�������ڽ���ͨ������ģʽ�����ľ����Ʒ����
		 * 	2. ͨ�������Ʒ�������ȡ�����Ʒ�Ķ���
		 * 	3. ��Ʒ���ò��Է���������֤
		 */
		IProduct iProduct;
		IFactory iFactory = new ConcreteFactory();
		iProduct = iFactory.FactoryMethod();
		iProduct.play();
	}
}

/*
 *�������IProduct��
 */
abstract class IProduct{
	/*
	 * ����һ�����󷽷�
	 */
	public abstract void play();
}

/*
 * ����ʵ��ConreteProduct����
 */
class ConreteProduct extends IProduct{

	/*
	 *ʵ�ֳ��󷽷����в���    
	 */
	@Override
	public void play() {
		System.out.println("This is ConreteProduct");
	}
}

/*
 * ������������������ 
 */
abstract class IFactory{
	
	/*
	 * ���ɻ�ȡProduct���� 
	 */
	public abstract IProduct FactoryMethod();
}

/*
 * ��Ʒ����Ĺ���ģʽ  
 */
class ConcreteFactory extends IFactory{

	/*  
	 *  ��ȡ�����Ʒ����
	 */
	public IProduct FactoryMethod() {
		return new ConreteProduct();
	}
	
}