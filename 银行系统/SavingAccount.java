package 银行系统;

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
		return "储蓄卡\t[年利率:" + interestRate + ", 卡号:" + accountNum + ", 余额:" + balance
				+ "]";
	}
}