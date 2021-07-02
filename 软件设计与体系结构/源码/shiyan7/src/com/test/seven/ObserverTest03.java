/**
 * 假设要实现一个找工作的中介网站，中介网站的职责是让求职者注册，然后当有适合的工作的时候，发送通知给对应的求职者。
 * 假设工作类别分为：软件开发人员、硬件开发人员、UI设计人员。请利用观察者模式，实现这个中介网站的框架代码。
 */
package com.test.seven;

import java.util.ArrayList;
//主题
interface JobSubject{
	public void registerObserver(UserObserver o);
	public void removeObserver(UserObserver o);
	public void notifyObservers();
}


//软件开发人员主题
class SoftwareDevelopers implements JobSubject{
	
	private ArrayList<UserObserver> softlist;
	
	private ArrayList<String> jobs;
	
	
	public SoftwareDevelopers() {
		softlist = new ArrayList<UserObserver>();
		jobs = new ArrayList<String>();
	}
	
	@Override
	public void registerObserver(UserObserver o) {
		softlist.add(o);
	}

	@Override
	public void removeObserver(UserObserver o) {
		if(!softlist.isEmpty()) {
			softlist.remove(o);
		}
		
	}

	@Override
	public void notifyObservers() {
		if (null != softlist && softlist.size() > 0) {
			for (UserObserver o : softlist) {
				o.update(this);
			}
		}
	}
	
	public void addJob(String job) {
		this.jobs.add(job);
		notifyObservers();
	}
	
	public ArrayList<String> getJobs() {
		return jobs;
	}
	
	public String toString(){
		StringBuffer jobsString = new StringBuffer("软件开发新岗位： ");
		for(String j: jobs){
			jobsString.append(j + ", ");
		}
		return jobsString.toString();
	}

	
}
//硬件开发人员主题 
class HardwareDevelopers implements JobSubject{
	
	private ArrayList<UserObserver> softlist;
	
	private ArrayList<String> jobs;
	
	
	public HardwareDevelopers() {
		softlist = new ArrayList<UserObserver>();
		jobs = new ArrayList<String>();
	}
	
	@Override
	public void registerObserver(UserObserver o) {
		softlist.add(o);
	}

	@Override
	public void removeObserver(UserObserver o) {
		if(!softlist.isEmpty()) {
			softlist.remove(o);
		}
		
	}

	@Override
	public void notifyObservers() {
		if (null != softlist && softlist.size() > 0) {
			for (UserObserver o : softlist) {
				o.update(this);
			}
		}
	}
	
	public void addJob(String job) {
		this.jobs.add(job);
		notifyObservers();
	}
	
	public ArrayList<String> getJobs() {
		return jobs;
	}
	
	public String toString(){
		StringBuffer jobsString = new StringBuffer("硬件开发新岗位： ");
		for(String j: jobs){
			jobsString.append(j + ", ");
		}
		return jobsString.toString();
	}
}
//UI设计人员主题
class UIDesigners implements JobSubject{
	
	private ArrayList<UserObserver> softlist;
	
	private ArrayList<String> jobs;
	
	
	public UIDesigners() {
		softlist = new ArrayList<UserObserver>();
		jobs = new ArrayList<String>();
	}
	
	@Override
	public void registerObserver(UserObserver o) {
		softlist.add(o);
	}

	@Override
	public void removeObserver(UserObserver o) {
		if(!softlist.isEmpty()) {
			softlist.remove(o);
		}
		
	}

	@Override
	public void notifyObservers() {
		if (null != softlist && softlist.size() > 0) {
			for (UserObserver o : softlist) {
				o.update(this);
			}
		}
	}
	
	public void addJob(String job) {
		this.jobs.add(job);
		notifyObservers();
	}
	
	public ArrayList<String> getJobs() {
		return jobs;
	}
	
	public String toString(){
		StringBuffer jobsString = new StringBuffer("UI新岗位： ");
		for(String j: jobs){
			jobsString.append(j + ", ");
		}
		return jobsString.toString();
	}
}

//观察者
interface UserObserver{

	public void update(JobSubject s);
}
//具体观察者
class User implements UserObserver{

	private String name;

	public User(String name) {
		super();
		this.name = name;
	}



	@Override
	public void update(JobSubject s) {
		System.out.println(name + "收到消息：" + s.toString());
		
	}
	
	
}
// 测试
public class ObserverTest03 {
	public static void main(String[] args) {
	
		SoftwareDevelopers soft = new SoftwareDevelopers();
		HardwareDevelopers hard = new HardwareDevelopers();
		UIDesigners ui = new UIDesigners();
		
		soft.registerObserver(new User("张三"));
		hard.registerObserver(new User("李四"));
		ui.registerObserver(new User("王三"));
		
		soft.addJob("软件开发人员");
		hard.addJob("硬件开发人员");
		ui.addJob("UI设计人员");
		
	}
}
