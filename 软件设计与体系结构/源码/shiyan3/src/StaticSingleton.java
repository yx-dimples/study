/**
 * 参考课件，自己编写并实现单例模式的两种样式（静态单例版本和普通单例版本）
 * 1.静态单例版本
 * @author Moppet
 * @since JDk 1.8.0
 * @data 2021/4/8
 * @version V1.0.0
 */
public class StaticSingleton {
	//静态内部类
	private static class SingletonHolder {
		//静态初始化器机制初始化本数据（保证了同步控制，线程安全）
		private static StaticSingleton instance = new StaticSingleton();
	}
	//私有构造方法
	private StaticSingleton() {}
	//获取对象实例
	public static StaticSingleton getInstance() {
		return SingletonHolder.instance;
	}
	//测试
	public static void main(String[] args) {
		System.out.println("测试"+SingletonHolder.instance);
	}
}