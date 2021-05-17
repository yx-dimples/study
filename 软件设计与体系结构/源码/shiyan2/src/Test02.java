/**
* <p>����һ</p>
* 	2. P41��4��
* @since JDk 1.8.0
* @data 2021/3/21
* @version V1.0.0
*/
public class Test02 {
	public static void main(String[] args) {
		Person manPerson = Nvwa.createPenson("M");
		Person womanPerson = Nvwa.createPenson("W");
		Person robotPerson = Nvwa.createPenson("R");
		manPerson.Speak();
		womanPerson.Speak();
		robotPerson.Speak();
	}

}
/*
* <p>��Ʒ�ĳ���ӿ�</p>
*/
abstract class  Person {
	/*
	* ��Ʒ�ĳ��󷽷����ɾ���Ĳ�Ʒ��ȥʵ��
	*/
	public void Speak() {};
}
/*
 * ����ʵ��Ů洳�����
 */
class Man extends Person{
	/*
	 * ʵ�ַ���
	 */
	public void Speak() {
		System.out.println("Ů���������,����һ������");
	};
}
/*
 * Ů��ʵ��Ů洳�����
 */
class Woman extends Person{
	/*
	 * ʵ�ַ���
	 */
	public void Speak() {
		System.out.println("Ů�����Ů��,����һ��Ů��");
	};
}
/*
 * ������ʵ��Ů洳�����
 */
class Robot extends Person{
	/*
	 * ʵ�ַ���
	 */
	public void Speak() {
		System.out.println("Ů����˻�����,����һ��������");
	};
}
/*
 * Ů����˹�����
 */
class Nvwa {
	public static Person createPenson(String type) {
		Person person = null;
		if(type.equalsIgnoreCase("M")) {
			person = new Man();
		}
		if(type.equalsIgnoreCase("W")) {
			person = new Woman();
		}
		if(type.equalsIgnoreCase("R")) {
			person = new Robot();
		}
		return person;
	}
}

