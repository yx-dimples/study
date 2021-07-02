/**
 * 1、理解观察者模式，根据UML图还原原始代码
 */
package com.test.seven;

import java.util.ArrayList;

// 主题
interface Subject{
	public void registerObserver(Observer observer);
	public void removeObserver(Observer obserber);
	public void notifyObservers();
}
// 具体主题
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
        System.out.println("天气服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObservers();
    }
}

// 观察者
interface Observer{
	public void update(String message);
}
// 具体观察者
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
        System.out.println(name + " 收到推送消息： " + message);
    }
}
// 测试
public class ObserverTest01 {
	public static void main(String[] args) {
	
		ConcreteSubject concreteSubject = new ConcreteSubject();
		
		ConcreteObserver zhangObserver = new ConcreteObserver("张三");
		ConcreteObserver liObserver = new ConcreteObserver("李四");
		ConcreteObserver wangObserver = new ConcreteObserver("王俊");
		
		concreteSubject.registerObserver(zhangObserver);
		concreteSubject.registerObserver(liObserver);
		concreteSubject.registerObserver(wangObserver);
		concreteSubject.setInfomation("今天的太阳真大！！！");
		
		System.out.println("======================");
		concreteSubject.removeObserver(liObserver);
		concreteSubject.setInfomation("今天不适合旅游，容易中暑");
	}
	
	
	
	
}
