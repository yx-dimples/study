package com.test.mode.graduate;

public class Graduate {
	/*
	 * 学生证
	 */
	private String studentID;
	
	/*
	 * 身份证
	 */
	private String identityCard;
	
	/*
	 * 毕业证
	 */
	private String diploma;
	
	/*
	 *学位证
	 */
	private String certificateOfDegree;
	
	/*
	 * 派遣证
	 */
	private String dispatchCertificate;
	/*
	 * 饭卡
	 */
	private String mealCard;
	/*
	 * 饭卡余额  
	 */
	private String mealCardBalance;
	/*
	 * 借卡证
	 */
	private String libraryCard;
	/*
	 * 借书证押金
	 */
	private String libraryCardDeposit;
	
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getLibraryCard() {
		return libraryCard;
	}
	public void setLibraryCard(String libraryCard) {
		this.libraryCard = libraryCard;
	}
	public String getMealCard() {
		return mealCard;
	}
	public void setMealCard(String mealCard) {
		this.mealCard = mealCard;
	}
	public String getDiploma() {
		return diploma;
	}
	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}
	public String getCertificateOfDegree() {
		return certificateOfDegree;
	}
	public void setCertificateOfDegree(String certificateOfDegree) {
		this.certificateOfDegree = certificateOfDegree;
	}
	public String getDispatchCertificate() {
		return dispatchCertificate;
	}
	public void setDispatchCertificate(String dispatchCertificate) {
		this.dispatchCertificate = dispatchCertificate;
	}
	public String getMealCardBalance() {
		return mealCardBalance;
	}
	public void setMealCardBalance(String mealCardBalance) {
		this.mealCardBalance = mealCardBalance;
	}
	public String getLibraryCardDeposit() {
		return libraryCardDeposit;
	}
	public void setLibraryCardDeposit(String libraryCardDeposit) {
		this.libraryCardDeposit = libraryCardDeposit;
	}
	@Override
	public String toString() {
		return "学生证:" + studentID + ", 身份证:" + identityCard + ", 借书证:" + libraryCard
				+ ", 饭卡:" + mealCard + ", 毕业证 :" + diploma + ", 学位证:" + certificateOfDegree
				+ ", 派遣证:" + dispatchCertificate + ", 饭卡余额:" + mealCardBalance
				+ ", 借书证押金:" + libraryCardDeposit + "";
	}
	
	
	
}
