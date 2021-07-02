/**
 * ����Ҫʵ��һ���ҹ������н���վ���н���վ��ְ��������ְ��ע�ᣬȻ�����ʺϵĹ�����ʱ�򣬷���֪ͨ����Ӧ����ְ�ߡ�
 * ���蹤������Ϊ�����������Ա��Ӳ��������Ա��UI�����Ա�������ù۲���ģʽ��ʵ������н���վ�Ŀ�ܴ��롣
 */
package com.test.seven;

import java.util.ArrayList;
//����
interface JobSubject{
	public void registerObserver(UserObserver o);
	public void removeObserver(UserObserver o);
	public void notifyObservers();
}


//���������Ա����
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
		StringBuffer jobsString = new StringBuffer("��������¸�λ�� ");
		for(String j: jobs){
			jobsString.append(j + ", ");
		}
		return jobsString.toString();
	}

	
}
//Ӳ��������Ա���� 
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
		StringBuffer jobsString = new StringBuffer("Ӳ�������¸�λ�� ");
		for(String j: jobs){
			jobsString.append(j + ", ");
		}
		return jobsString.toString();
	}
}
//UI�����Ա����
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
		StringBuffer jobsString = new StringBuffer("UI�¸�λ�� ");
		for(String j: jobs){
			jobsString.append(j + ", ");
		}
		return jobsString.toString();
	}
}

//�۲���
interface UserObserver{

	public void update(JobSubject s);
}
//����۲���
class User implements UserObserver{

	private String name;

	public User(String name) {
		super();
		this.name = name;
	}



	@Override
	public void update(JobSubject s) {
		System.out.println(name + "�յ���Ϣ��" + s.toString());
		
	}
	
	
}
// ����
public class ObserverTest03 {
	public static void main(String[] args) {
	
		SoftwareDevelopers soft = new SoftwareDevelopers();
		HardwareDevelopers hard = new HardwareDevelopers();
		UIDesigners ui = new UIDesigners();
		
		soft.registerObserver(new User("����"));
		hard.registerObserver(new User("����"));
		ui.registerObserver(new User("����"));
		
		soft.addJob("���������Ա");
		hard.addJob("Ӳ��������Ա");
		ui.addJob("UI�����Ա");
		
	}
}
