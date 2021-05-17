/**
 * �ο��μ����Լ���д��ʵ�ֵ���ģʽ��������ʽ����̬�����汾����ͨ�����汾��
 * 2.��ͨ�����汾---����ʽ
 * @author Moppet
 * @since JDk 1.8.0
 * @data 2021/4/8
 * @version V1.0.0
 *	����ʽ��
 *		�ŵ㣺�򵥷���
 *		ȱ�㣺���ܳ������Ƿ�ʹ�õ��˵������󣬶������ɵ������󣬲������ھ�̬�����Ƿ��������ʱ����Ҫ���ɣ��ή��Ӧ�õ������ٶ�
 *		ʹ�ó�����������ܼ򵥣�ռ���ڴ��С��ʹ��Ƶ��
 *		�����ã�������ܸ�ֵ��ռ���ڴ��ʹ�ø��ʽϵ�
 */
public class HungrySingleton {
	//������̬������ֱ�Ӵ���ʵ��
	private static HungrySingleton hungrySingleton = new HungrySingleton();
	 
	private HungrySingleton(){
		//˽�л����캯��
		System.out.println("-->����ʽ����ģʽ��ʼ���ù��캯��");
	}
		
	//����һ�����з������ж��Ƿ��Ѿ�����ʵ�����з��أ�û���½�һ���ڷ���
	public static HungrySingleton getInstance(){
		System.out.println("-->����ʽ����ģʽ��ʼ���ù��з�������ʵ��");
		return hungrySingleton;
	}
	//����
	public static void main(String[] args) {
		HungrySingleton s1 = HungrySingleton.getInstance();
		HungrySingleton s2 = HungrySingleton.getInstance();
		
		if(s1==s2) {
			System.out.println("s1��s2Ϊһ��ʵ��");
		}
		System.out.println();
	}
}
