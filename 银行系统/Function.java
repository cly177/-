package 银行系统;

import java.util.Scanner;

public abstract class Function {
	public static Scanner scanner = new Scanner(System.in);
	
	/**
	 * 银行系统主菜单
	 */
	public static void firstMenu(){
		System.out.println("************* 银行系统 *************");
		System.out.println("\t1.开户");
		System.out.println("\t2.存款");
		System.out.println("\t3.取款");
		System.out.println("\t4.消费");
		System.out.println("\t5.还款");
		System.out.println("\t6.银行结算");
		System.out.println("\t7.查询余额");
		System.out.println("\t8.退出");	
		System.out.println("\t请选择(1-8)");
	}
	
	
	/**
	 * 二级菜单（开卡选择）
	 */
	public static void creatMenu(){
		System.out.println("请选择开卡类型");
		System.out.println("\t1.信用卡");
		System.out.println("\t2.储蓄卡");
		System.out.println("\t3.退出");
		System.out.println("\t请选择(1-3)");
	}
	
	
	/**
	 * 开卡操作
	 * @param customer
	 */
	public static void Create(Customer customer){
		int choice = 0;
		boolean flag = true;
		while (flag){
			creatMenu();
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				CheckingAccount checkingAccount = new CheckingAccount();
				scanner.nextLine();//读取上面留下来的回车
				System.out.println("请输入个人社保账号: ");
				customer.ssn = scanner.nextLine();
				
				System.out.println("请输入姓名: ");
				customer.name = scanner.nextLine();
				
				System.out.println("请输入卡号: ");
				checkingAccount.accountNum = scanner.nextLine();
				
				System.out.println("请设置信用卡年收费金额: ");
				checkingAccount.setServiceCharge(scanner.nextDouble());
				
				//将参数传入到客户类中
				customer.setCheckAccount(checkingAccount);
				
				System.out.println("恭喜您！信用卡开办成功^-^~~~");
				System.out.println();
				break;
			case 2:
				SavingAccount savingAccount = new SavingAccount();
				scanner.nextLine(); //读取上面留下来的回车
				System.out.println("请输入个人社保账号: ");
				customer.ssn = scanner.nextLine();
				
				System.out.println("请输入姓名: ");
				customer.name = scanner.nextLine();
				
				System.out.println("请输入卡号: ");
				savingAccount.accountNum = scanner.nextLine();
				
				System.out.println("请输入年利息: ");
				savingAccount.setInterestRate(scanner.nextDouble());
				
				//将参数传入到客户类中
				customer.setSavingAccount(savingAccount);
				
				System.out.println("恭喜您！储蓄卡开办成功^-^~~~");
				System.out.println();
				break;
			case 3: 
				flag = false;
				break;
			default:
				System.out.println("请输入1-3序号");
				continue;
			}
		}
		System.out.println();
		System.out.println();
	}
	
	/**
	 * 储蓄账户存钱
	 * @param customer
	 */
	public static void save(Customer customer){
		System.out.println("请输入存款金额:");
		double money = scanner.nextDouble();
		customer.savingAccount.setBalance(money+customer.savingAccount.getBalance());
		System.out.println("存款成功");
		System.out.println();
		System.out.println();
	}
	
	/**
	 * 储蓄账户取钱
	 * @param customer
	 */
	public static void withDraw(Customer customer){
		System.out.println("请输入取款金额:");
		double money = scanner.nextDouble();
		if (money > customer.savingAccount.getBalance()){
			System.out.println("账户余额不足");
		}else{
			customer.savingAccount.setBalance(customer.savingAccount.getBalance()-money);
			System.out.println("取款成功\n账户余额: "+customer.savingAccount.getBalance());
		}
		System.out.println();
		System.out.println();
	}
	
	/**
	 * 信用卡消费
	 * @param customer
	 */
	public static void consume(Customer customer){
		System.out.println("请输入消费金额: ");
		double money = scanner.nextDouble();
		customer.checkAccount.setBalance(customer.checkAccount.getBalance() - money);
		System.out.println("消费成功");
		System.out.println();
		System.out.println();
	}
	
	/**
	 * 信用卡还款
	 * @param customer
	 */
	public static void repay(Customer customer){
		System.out.println("您当前欠款余额: "+customer.checkAccount.getBalance());
		System.out.println("请输入还款金额:");
		double money = scanner.nextDouble();
		customer.checkAccount.setBalance(customer.checkAccount.getBalance() + money);
		System.out.println("还款成功");
		System.out.println();
		System.out.println();
	}
	
	/**
	 * 信用卡（扣年费）和储蓄卡（派发红利）的年费处理函数
	 * @param customer
	 */
	public static void settle(Customer customer){
		System.out.println(customer.checkAccount.toString());
		System.out.println(customer.savingAccount.toString());
		customer.checkAccount.assessServiceCharge();
		customer.savingAccount.payInterest();
		System.out.println("正在处理中...");
		System.out.println(customer.checkAccount.toString());
		System.out.println(customer.savingAccount.toString());
		System.out.println("处理成功");
		System.out.println();
		System.out.println();
	}
	
	/**
	 * 查询当前账户余额
	 * @param customer
	 */
	public static void requireBalance(Customer customer){
		System.out.println("当前储户卡余额: "+customer.savingAccount.getBalance());
		System.out.println("当前信用卡余额: "+customer.checkAccount.getBalance());
		System.out.println();
		System.out.println();
	}
}