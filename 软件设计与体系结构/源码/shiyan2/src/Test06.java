/**  
 * <p> 任务二 </p> 
 *	1. P55页第5题
* @since JDk 1.8.0
* @data 2021/3/21
 * @version V1.0.0
 */
public class Test06 {
	public static void main(String[] args) {
		/*
		 * Test:
		 * 	1. 通过具体图像生成器获取对应图形对象
		 * 	2. 用得到图形生成器进行绘制
		 */
		Chart lineChart = new LineChartFactory().getChart();
		Chart berChar = new BarChartFactory().getChart();
		lineChart.draw();
		berChar.draw();
	}
}

/**
 * <p> 图像抽象类 </p> 
 * @ClassName:Chart   
 * @author: WEI.ZHOU
 * @date: 2021-03-25 22:41
 * @since: JDK1.8
 * @version V1.0.0
 */
abstract class Chart{
	
	/*
	 * <p> 绘图抽象方法 
	 */
	public abstract void draw();
}

/*
 * 柱状图 
 */
class LineChart extends Chart{

	/*
	 * 绘制柱状图 
	*/
	public void draw() {
		System.out.println("绘制柱状图");
	}
}

/*
 * 曲线生成器 

 */
class BarChart extends Chart{

	/*   
	 *  绘制曲线图 
	*/

	public void draw() {
		System.out.println("绘制曲线图");
	}
}

/*
 * chart 抽象工厂 
 */
abstract class ChartFcatory{
	
	/*
	 * 获取具体Chart对象
	 */
	public abstract Chart getChart();
}

/*
 * 直线生成器工厂 
 */
class LineChartFactory extends ChartFcatory{

	/*  
	 * 获取直线生成器对象 
	 */
	public Chart getChart() {
		return new LineChart();
	}
}

/*
 * 曲线生成器工厂
 */
class BarChartFactory extends ChartFcatory{

	/*   
	 *获取曲线生成器对象 
	*/
	public Chart getChart() {
		return new BarChart();
	}
}