package ����ϵͳ;

public class SavingAccount extends BankAccount{
	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void payInterest() {
		this.balance = this.balance*(1+interestRate);
	}

	@Override
	public String toString() {
		return "���\t[������:" + interestRate + ", ����:" + accountNum + ", ���:" + balance
				+ "]";
	}
}