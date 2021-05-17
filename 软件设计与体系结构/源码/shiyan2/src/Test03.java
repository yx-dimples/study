/**
* <p>����һ</p>
* 	2. P41��4��
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
		System.out.println("*****������ʾ*****");
		Shape otherShape = ShapeFactor.createShape("star");
		otherShape.draw();
	}
}

/*
 *��ͼ���߳�����  
 */
abstract class Shape{
	
	/*
	 *��ͼ���󷽷�
	 */
	public abstract void draw();
	
	/*
	 *��ͼ���󷽷�
	 */
	public abstract void erase();
}

class Circle extends Shape{
	/*
	 * ʵ�ֻ�ͼ�ľ���������� 
	 */
	public void draw() {
		System.out.println("���ڻ�Բ��");
	}
	/* 
	 * ʵ�ֲ�ͼ�ľ��巽��
	 */
	public void erase() {
		System.out.println("���ڲ���Բ��");
	}
}

class Rectangle extends Shape{

	/* 
	 *ʵ�ֻ�ͼ�ľ���������� 
	 */
	public void draw() {
		System.out.println("���ڻ�����");
	}
	/*
	 *ʵ�ֲ�ͼ�ľ��巽��
	*/
	public void erase() {
		System.out.println("���ڲ�������");
	}
}

class Triangle extends Shape{

	/* 
	 * ʵ�ֻ�ͼ�ľ����������
	 */
	public void draw() {
		System.out.println("���ڻ�������");
	}

	/*  
	 * ʵ�ֲ�ͼ�ľ��巽��
	*/
	public void erase() {
		System.out.println("���ڲ���������");
	}
}

/*
 * ͼ�񴴽������� 
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
				throw new UnsupportedShapeException("��֧�ֻ���" + drawType + "ͼ��");
			}
		} catch (UnsupportedShapeException e) {
			System.out.println(e.getMessage());
		}
		return shap;
	}
}
/*
 * <p> �Զ����ͼ����ͼ�β�֧���쳣 </p> 
 */
class UnsupportedShapeException extends Exception{

	private static final long serialVersionUID = 1L;

	public UnsupportedShapeException(String massage) {
		super(massage);
	}
}