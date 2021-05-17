/**  
 * <p> ����� </p> 
 *	1. P55ҳ��5��
* @since JDk 1.8.0
* @data 2021/3/21
 * @version V1.0.0
 */
public class Test06 {
	public static void main(String[] args) {
		/*
		 * Test:
		 * 	1. ͨ������ͼ����������ȡ��Ӧͼ�ζ���
		 * 	2. �õõ�ͼ�����������л���
		 */
		Chart lineChart = new LineChartFactory().getChart();
		Chart berChar = new BarChartFactory().getChart();
		lineChart.draw();
		berChar.draw();
	}
}

/**
 * <p> ͼ������� </p> 
 * @ClassName:Chart   
 * @author: WEI.ZHOU
 * @date: 2021-03-25 22:41
 * @since: JDK1.8
 * @version V1.0.0
 */
abstract class Chart{
	
	/*
	 * <p> ��ͼ���󷽷� 
	 */
	public abstract void draw();
}

/*
 * ��״ͼ 
 */
class LineChart extends Chart{

	/*
	 * ������״ͼ 
	*/
	public void draw() {
		System.out.println("������״ͼ");
	}
}

/*
 * ���������� 

 */
class BarChart extends Chart{

	/*   
	 *  ��������ͼ 
	*/

	public void draw() {
		System.out.println("��������ͼ");
	}
}

/*
 * chart ���󹤳� 
 */
abstract class ChartFcatory{
	
	/*
	 * ��ȡ����Chart����
	 */
	public abstract Chart getChart();
}

/*
 * ֱ������������ 
 */
class LineChartFactory extends ChartFcatory{

	/*  
	 * ��ȡֱ������������ 
	 */
	public Chart getChart() {
		return new LineChart();
	}
}

/*
 * ��������������
 */
class BarChartFactory extends ChartFcatory{

	/*   
	 *��ȡ�������������� 
	*/
	public Chart getChart() {
		return new BarChart();
	}
}