/**
 * 请使用观察者模式，实现更新UI的框架代码，即：主角属性是由服务器获取，然后分发给对应的面板，进行更新。
 */
package com.test.seven;
import java.util.ArrayList;
// 主角属性
class Attribute {
	// 姓名 
	private String name;
	// 头像
	private String imgurl;
	// 等级
	private int grade = 0;
	// 战斗力
	private int combateffectiveness = 0; 
	// 经验数
	private int experience = 0; 
	// 砖石数
	private int diamonds = 0; 
	// 金币数
	private int goldcoin = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public int getCombateffectiveness() {
		return combateffectiveness;
	}
	public void setCombateffectiveness(Integer combateffectiveness) {
		this.combateffectiveness = combateffectiveness;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	public int getDiamonds() {
		return diamonds;
	}
	public void setDiamonds(Integer diamonds) {
		this.diamonds = diamonds;
		heroLevel();
	}
	public int getGoldcoin() {
		return goldcoin;
	}
	public void setGoldcoin(Integer goldcoin) {
		this.goldcoin = goldcoin;
	}

	public Attribute(String name, String imgurl, int grade, int combateffectiveness, int experience) {
		super();
		this.name = name;
		this.imgurl = imgurl;
		this.grade = grade;
		this.combateffectiveness = combateffectiveness;
		this.experience = experience;
		heroLevel();
	}
	public Attribute(int diamonds, int goldcoin) {
		super();
		this.diamonds = diamonds;
		this.goldcoin = goldcoin;
		heroLevel();
	}
	@Override
	public String toString() {
		return "Attribute [name=" + name + ", imgurl=" + imgurl + ", grade=" + grade + ", combateffectiveness="
				+ combateffectiveness + ", experience=" + experience + ", diamonds=" + diamonds + ", goldcoin="
				+ goldcoin + "]";
	} 
	protected void heroLevel() {
		this.grade = this.experience / 1000 + (this.experience % 1000 != 0 ? 1 : 0);
	}
}

// 主题
interface GameSubject {
	public void registerObserver(GameplayerObserver o);
	public void removeObserver(GameplayerObserver o);
	public void notifyObservers();
}
// 具体主题
class RoleSubject implements GameSubject {

	private ArrayList<GameplayerObserver> gameList;
	private Attribute attribute;
	public RoleSubject(Attribute attribute) {
		super();
		gameList = new ArrayList<GameplayerObserver>();
		this.attribute = attribute;
	}
	@Override
	public void registerObserver(GameplayerObserver o) {
		int i = gameList.indexOf(o);
		if (null != o && i < 0) {
			gameList.add(o);
		}
	}
	@Override
	public void removeObserver(GameplayerObserver o) {
		int i = gameList.indexOf(o);
		if (i > 0) {
			gameList.remove(o);
		}
		
	}
	@Override
	public void notifyObservers() {
		for (int i = 0; i < gameList.size(); i++) {
			GameplayerObserver o = gameList.get(i);
			o.update(attribute);
		}
		
	}
	public void updataRole(String name, String imgurl, int combateffectiveness, int experience ) {
		this.attribute.setName(name);
		this.attribute.setImgurl(imgurl);
		this.attribute.setCombateffectiveness(combateffectiveness);
		this.attribute.setExperience(experience);;
		notifyObservers();
	}
	public void updataRole(int diamonds, int goldcoin) {
		this.attribute.setDiamonds(diamonds);
		this.attribute.setGoldcoin(goldcoin);
		notifyObservers();
	}
}
// 观察者
interface GameplayerObserver {
	void update(Attribute attribute);
}
// 具体观察者
class ColorObserver implements GameplayerObserver {

	private Attribute attribute;
	private String name;
		
	public ColorObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Attribute attribute) {
		System.out.println(name);
		System.out.println(attribute.getName() + "\t头像" + attribute.getImgurl());
		System.out.println("等级：" + attribute.getGrade() + "\t体力：" + attribute.getCombateffectiveness());
		System.out.println("经验数：" + attribute.getExperience());
		
	}
}

class PanelObserver implements GameplayerObserver {
	
	private Attribute attribute;
	private String name;
	
	public PanelObserver(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void update(Attribute attribute) {
		System.out.println(name);
		System.out.println("砖石数：" + attribute.getDiamonds() + "\t金币数：" + attribute.getGoldcoin());
	}
	
}

// 测试
public class ObserverTest02 {
	public static void main(String[] args) {
		Attribute attribute1 = new Attribute("suave", "https://7.dusays.com/2021/06/10/15050d2a12105.jpg", 1000, 1000, 1000);
		RoleSubject roleSubject = new RoleSubject(attribute1);
		ColorObserver colorObserver = new ColorObserver("面板1");
		roleSubject.registerObserver(colorObserver);
		roleSubject.updataRole("suave","https://7.dusays.com/2021/06/10/15050d2a12105.jpg",2467, 2123);
		
		System.out.println("----------------------------------------------------------------");
		
		Attribute attribute2 = new Attribute(1000, 1000);
		RoleSubject roleSubject2 = new RoleSubject(attribute2);
		PanelObserver panelObserver = new PanelObserver("面板2");
		roleSubject2.registerObserver(panelObserver);
		roleSubject2.updataRole(2123, 9810);
	}
}
