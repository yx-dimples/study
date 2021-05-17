/**
* <p>任务一</p>
* 	2. P41的4题
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
* <p>产品的抽象接口</p>
*/
abstract class  Person {
	/*
	* 产品的抽象方法，由具体的产品类去实现
	*/
	public void Speak() {};
}
/*
 * 男人实现女娲抽象类
 */
class Man extends Person{
	/*
	 * 实现方法
	 */
	public void Speak() {
		System.out.println("女娲造了男人,我是一个男人");
	};
}
/*
 * 女人实现女娲抽象类
 */
class Woman extends Person{
	/*
	 * 实现方法
	 */
	public void Speak() {
		System.out.println("女娲造了女人,我是一个女人");
	};
}
/*
 * 机器人实现女娲抽象类
 */
class Robot extends Person{
	/*
	 * 实现方法
	 */
	public void Speak() {
		System.out.println("女娲造了机器人,我是一个机器人");
	};
}
/*
 * 女娲造人工厂类
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

