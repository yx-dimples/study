/**
 * 1�����۲���ģʽ������UMLͼ��ԭԭʼ����
 */
package com.test.seven;

import java.util.ArrayList;

// ����
interface Subject{
	public void registerObserver(Observer observer);
	public void removeObserver(Observer obserber);
	public void notifyObservers();
}
// ��������
class ConcreteSubject implements Subject{
	
	private ArrayList<Observer> list;
	
	private String message;
	
	public ConcreteSubject() {
		list = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		list.add(observer);
	}

	@Override
	public void removeObserver(Observer obserber) {
		if(!list.isEmpty()) {
			list.remove(obserber);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < list.size(); i++) {
			Observer obserber = list.get(i);
			obserber.update(message);
		}
	}
	public void setInfomation(String s) {
        this.message = s;
        System.out.println("�������������Ϣ�� " + s);
        //��Ϣ���£�֪ͨ���й۲���
        notifyObservers();
    }
}

// �۲���
interface Observer{
	public void update(String message);
}
// ����۲���
class ConcreteObserver implements Observer{
	
	private String name;
	private String message;

	public ConcreteObserver(String name) {
		super();
		this.name = name;
	}



	@Override
	public void update(String message) {
		this.message = message;
		read();
	}
	
	public void read() {
        System.out.println(name + " �յ�������Ϣ�� " + message);
    }
}
// ����
public class ObserverTest01 {
	public static void main(String[] args) {
	
		ConcreteSubject concreteSubject = new ConcreteSubject();
		
		ConcreteObserver zhangObserver = new ConcreteObserver("����");
		ConcreteObserver liObserver = new ConcreteObserver("����");
		ConcreteObserver wangObserver = new ConcreteObserver("����");
		
		concreteSubject.registerObserver(zhangObserver);
		concreteSubject.registerObserver(liObserver);
		concreteSubject.registerObserver(wangObserver);
		concreteSubject.setInfomation("�����̫����󣡣���");
		
		System.out.println("======================");
		concreteSubject.removeObserver(liObserver);
		concreteSubject.setInfomation("���첻�ʺ����Σ���������");
	}
	
	
	
	
}
