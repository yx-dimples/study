/**
* <p>����һ</p>
* 	1���ο��򵥹���ͨ��UMLͼ�����������ܣ����������ܣ�
* @since JDk 1.8.0
* @data 2021/3/21
 * @version V1.0.0
 */
public class Test01 {
	public static void main(String[] args) {
		/*
		 * Test��
		 * 	�򵥹��������������
		 * 	1. ������Ʒ����ȴ����� ��Ҫ�õ��Ĳ�Ʒ����
		 * 	2. ͨ���������е�getProduct("ProductA")������ȡ�����Ʒ����
		 * 	3. getProduct("ProductA")�����д���ָ����Ҫ�Ķ���ProductA
		 * 	4�� ͨ����̬���صõ�ProductA�������
		 */
		AbstractProduct product;
		product = Factory.getProduct("Product");
		product.methdDiff();
	}

}
/*
 * <p> ��Ʒ���������Ҫ��ͬ�Ĳ�Ʒ��ʵ�ֲ�Ʒ����ӿڼ��� </p> 
 */
abstract class AbstractProduct{
	/*
	 * �����Ʒ�еĳ��󷽷�   
	 */
	public abstract void methdDiff();
}

/*
 * ProductA ��Ʒʵ�ֳ����Ʒ �õ������ProductA
 */
class Product extends AbstractProduct{

	/*   
	 * Product ����ʵ�ֳ��󷽷������������Ʒ���	
	 */
	public void methdDiff() {
		System.out.println("This is Product");
	}
}

/*
 * �򵥹����࣬����������Ҫ�Ĳ�Ʒ����
 *�򵥹������ṩһ����ȡ�����Ʒ����ľ�̬����getProduct(),ͨ��getProduct()�õ���Ҫ�Ĳ�Ʒ����
 */
class Factory{
	/*
	 * ��ȡָ����Ʒ����
	 */
	public static AbstractProduct getProduct(String productType) {
		AbstractProduct abstractProduct = null;
		if(productType.equalsIgnoreCase("Product")) {
			abstractProduct = new Product();
			}
		return abstractProduct;
	}
}