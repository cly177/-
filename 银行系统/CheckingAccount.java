package ����ϵͳ;

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
		return "���ÿ�\t[�����:" + serviceCharge + ", ����:" + accountNum + ", ���=" + balance
				+ "]";
	}
	
	
}