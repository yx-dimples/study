import java.util.Scanner;

// 订餐系统
public class OrderFoodSys {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = -1;
		System.out.println("欢迎使用XXX订餐系统");
		
		do {
			System.out.println("*******************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看福袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("*******************");
			System.out.println("请选择：");
			int choose = input.nextInt();
			
			switch (choose) {
			case 1:
				System.out.println("********我要订餐********");
				break;
			case 2:
				System.out.println("********查看福袋********");
				break;
			case 3:
				System.out.println("********签收订单********");
				break;
			case 4:
				System.out.println("********删除订单********");
				break;
			case 5:
				System.out.println("********我要点赞********");
				break;
			case 6:
				break;
			default:
				break;
			}
			System.out.println("请输入0返回");
			num = input.nextInt();
		} while(num==0);
		System.out.println("谢谢使用，欢迎下次光临！");
	}
}
