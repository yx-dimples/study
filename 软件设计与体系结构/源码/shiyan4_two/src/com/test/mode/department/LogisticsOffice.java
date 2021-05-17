package com.test.mode.department;
import com.test.mode.graduate.Graduate;;

/*
 * 后勤处
 * 教务处给毕业生退还饭卡余额
 */
public class LogisticsOffice {
	/*
	 * 查看饭卡余额，退还余额
	 */
	public static Graduate checkingMealCardBalance(Graduate graduate) {
		if(!graduate.getMealCard().isEmpty()) {
			return grantBalance(graduate);
		}
		return notGrantBalance(graduate);
	}
	/*
	 * 完整退还饭卡余额10
	 */
	public static Graduate grantBalance(Graduate graduate) {
		graduate.setMealCardBalance("饭卡余额还剩10.0");
		return graduate;
	}
	
	/*
	 * 完整退还饭卡余额0
	 */
	public static Graduate notGrantBalance(Graduate graduate) {
		graduate.setMealCardBalance("饭卡余额还剩0.0");
		return graduate;
	}
}
