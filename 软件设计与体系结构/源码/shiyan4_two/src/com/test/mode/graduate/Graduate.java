package com.test.mode.graduate;

public class Graduate {
	/*
	 * ѧ��֤
	 */
	private String studentID;
	
	/*
	 * ���֤
	 */
	private String identityCard;
	
	/*
	 * ��ҵ֤
	 */
	private String diploma;
	
	/*
	 *ѧλ֤
	 */
	private String certificateOfDegree;
	
	/*
	 * ��ǲ֤
	 */
	private String dispatchCertificate;
	/*
	 * ����
	 */
	private String mealCard;
	/*
	 * �������  
	 */
	private String mealCardBalance;
	/*
	 * �迨֤
	 */
	private String libraryCard;
	/*
	 * ����֤Ѻ��
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
		return "ѧ��֤:" + studentID + ", ���֤:" + identityCard + ", ����֤:" + libraryCard
				+ ", ����:" + mealCard + ", ��ҵ֤ :" + diploma + ", ѧλ֤:" + certificateOfDegree
				+ ", ��ǲ֤:" + dispatchCertificate + ", �������:" + mealCardBalance
				+ ", ����֤Ѻ��:" + libraryCardDeposit + "";
	}
	
	
	
}
