package 银行系统;

public class CheckingAccount extends BankAccount{
	private double serviceCharge;

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	
	
	public void assessServiceCharge() {
		this.balance = this.balance - serviceCharge;
	}

	@Override
	public String toString() {
		return "信用卡\t[服务费:" + serviceCharge + ", 卡号:" + accountNum + ", 余额=" + balance
				+ "]";
	}
	
	
}