package com.wtu;

public class Customer {
	public String ssn;
	public String name;
	CheckingAccount checkAccount;
	SavingAccount savingAccount;
	
	public CheckingAccount getCheckAccount() {
		return checkAccount;
	}
	public void setCheckAccount(CheckingAccount checkAccount) {
		this.checkAccount = checkAccount;
	}
	public SavingAccount getSavingAccount() {
		return savingAccount;
	}
	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}
}
