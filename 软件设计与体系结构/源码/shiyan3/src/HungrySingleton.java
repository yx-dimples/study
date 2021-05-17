/**
 * 参考课件，自己编写并实现单例模式的两种样式（静态单例版本和普通单例版本）
 * 2.普通单例版本---饿汉式
 * @author Moppet
 * @since JDk 1.8.0
 * @data 2021/4/8
 * @version V1.0.0
 *	饿汉式：
 *		优点：简单方便
 *		缺点：不管程序中是否使用到了单例对象，都会生成单例对象，并且由于静态对象是否在类加载时就需要生成，会降低应用的启动速度
 *		使用场景：类对象功能简单，占用内存较小，使用频繁
 *		不适用：类对象功能赋值，占用内存大，使用概率较低
 */
public class HungrySingleton {
	//设立静态变量，直接创建实例
	private static HungrySingleton hungrySingleton = new HungrySingleton();
	 
	private HungrySingleton(){
		//私有化构造函数
		System.out.println("-->饿汉式单例模式开始调用构造函数");
	}
		
	//开放一个公有方法，判断是否已经存在实例，有返回，没有新建一个在返回
	public static HungrySingleton getInstance(){
		System.out.println("-->饿汉式单例模式开始调用公有方法返回实例");
		return hungrySingleton;
	}
	//测试
	public static void main(String[] args) {
		HungrySingleton s1 = HungrySingleton.getInstance();
		HungrySingleton s2 = HungrySingleton.getInstance();
		
		if(s1==s2) {
			System.out.println("s1和s2为一个实例");
		}
		System.out.println();
	}
}
