/**
 * �ο��μ����Լ���д��ʵ�ֵ���ģʽ��������ʽ����̬�����汾����ͨ�����汾��
 * 1.��̬�����汾
 * @author Moppet
 * @since JDk 1.8.0
 * @data 2021/4/8
 * @version V1.0.0
 */
public class StaticSingleton {
	//��̬�ڲ���
	private static class SingletonHolder {
		//��̬��ʼ�������Ƴ�ʼ�������ݣ���֤��ͬ�����ƣ��̰߳�ȫ��
		private static StaticSingleton instance = new StaticSingleton();
	}
	//˽�й��췽��
	private StaticSingleton() {}
	//��ȡ����ʵ��
	public static StaticSingleton getInstance() {
		return SingletonHolder.instance;
	}
	//����
	public static void main(String[] args) {
		System.out.println("����"+SingletonHolder.instance);
	}
}