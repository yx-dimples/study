import java.util.Scanner;

// ����ϵͳ
public class OrderFoodSys {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = -1;
		System.out.println("��ӭʹ��XXX����ϵͳ");
		
		do {
			System.out.println("*******************");
			System.out.println("1����Ҫ����");
			System.out.println("2���鿴����");
			System.out.println("3��ǩ�ն���");
			System.out.println("4��ɾ������");
			System.out.println("5����Ҫ����");
			System.out.println("6���˳�ϵͳ");
			System.out.println("*******************");
			System.out.println("��ѡ��");
			int choose = input.nextInt();
			
			switch (choose) {
			case 1:
				System.out.println("********��Ҫ����********");
				break;
			case 2:
				System.out.println("********�鿴����********");
				break;
			case 3:
				System.out.println("********ǩ�ն���********");
				break;
			case 4:
				System.out.println("********ɾ������********");
				break;
			case 5:
				System.out.println("********��Ҫ����********");
				break;
			case 6:
				break;
			default:
				break;
			}
			System.out.println("������0����");
			num = input.nextInt();
		} while(num==0);
		System.out.println("ллʹ�ã���ӭ�´ι��٣�");
	}
}
