/**
* <p>任务一</p>
* 	2. P41的4题
* @since JDk 1.8.0
* @data 2021/3/21
 * @version V1.0.0
 */
public class Test03 {
	public static void main(String[] args) {
		Shape circleShape = ShapeFactor.createShape("Circle");
		Shape rectangleShape = ShapeFactor.createShape("Rectangle");
		Shape triangleShape = ShapeFactor.createShape("Triangle");
		circleShape.draw();
		circleShape.erase();
		rectangleShape.draw();
		rectangleShape.erase();
		triangleShape.draw();
		triangleShape.erase();
		System.out.println();
		System.out.println("*****错误演示*****");
		Shape otherShape = ShapeFactor.createShape("star");
		otherShape.draw();
	}
}

/*
 *绘图工具抽象类  
 */
abstract class Shape{
	
	/*
	 *画图抽象方法
	 */
	public abstract void draw();
	
	/*
	 *擦图抽象方法
	 */
	public abstract void erase();
}

class Circle extends Shape{
	/*
	 * 实现画图的具体操作方法 
	 */
	public void draw() {
		System.out.println("正在画圆形");
	}
	/* 
	 * 实现擦图的具体方法
	 */
	public void erase() {
		System.out.println("正在擦掉圆形");
	}
}

class Rectangle extends Shape{

	/* 
	 *实现画图的具体操作方法 
	 */
	public void draw() {
		System.out.println("正在画矩形");
	}
	/*
	 *实现擦图的具体方法
	*/
	public void erase() {
		System.out.println("正在擦掉矩形");
	}
}

class Triangle extends Shape{

	/* 
	 * 实现画图的具体操作方法
	 */
	public void draw() {
		System.out.println("正在画三角形");
	}

	/*  
	 * 实现擦图的具体方法
	*/
	public void erase() {
		System.out.println("正在擦掉三角形");
	}
}

/*
 * 图像创建工厂类 
 */
class ShapeFactor{
	public static Shape createShape(String drawType) {
		Shape shap = null;
		try {
			if (drawType.equalsIgnoreCase("Circle")) {
				shap = new Circle();
			} else if (drawType.equalsIgnoreCase("Rectangle")) {
				shap = new Rectangle();
			} else if (drawType.equalsIgnoreCase("Triangle")) {
				shap = new Triangle();
			} else {
				throw new UnsupportedShapeException("不支持绘制" + drawType + "图形");
			}
		} catch (UnsupportedShapeException e) {
			System.out.println(e.getMessage());
		}
		return shap;
	}
}
/*
 * <p> 自定义绘图几何图形不支持异常 </p> 
 */
class UnsupportedShapeException extends Exception{

	private static final long serialVersionUID = 1L;

	public UnsupportedShapeException(String massage) {
		super(massage);
	}
}