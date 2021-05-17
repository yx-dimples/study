package com.test.mode.department;

import com.test.mode.graduate.Graduate;

/*
 *  图书馆  
 *	图书馆根据学生的借书证，退还押金
 */

public class Library {
	/*
	 * 大学毕业生验证借书证并领取借书证押金
	 */
	public static Graduate checkingLibraryCard(Graduate graduate) {
		if(!graduate.getLibraryCard().isEmpty()) {
			return grantDeposit(graduate);
		}
		return notGrantDeposit(graduate);
	}
	/*
	 * 图书馆退还押金
	 */
	public static Graduate grantDeposit(Graduate graduate) {
		graduate.setLibraryCardDeposit("退还押金为100");
		return graduate;
	}
	
	/*
	 * 借书证丢失，不退还押金
	 */
	public static Graduate notGrantDeposit(Graduate graduate) {
		graduate.setLibraryCardDeposit("借书证丢失，不退还押金");
		return graduate;
	}
}
