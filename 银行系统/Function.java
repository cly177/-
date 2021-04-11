package ����ϵͳ;

import java.util.Scanner;

public abstract class Function {
	public static Scanner scanner = new Scanner(System.in);
	
	/**
	 * ����ϵͳ���˵�
	 */
	public static void firstMenu(){
		System.out.println("************* ����ϵͳ *************");
		System.out.println("\t1.����");
		System.out.println("\t2.���");
		System.out.println("\t3.ȡ��");
		System.out.println("\t4.����");
		System.out.println("\t5.����");
		System.out.println("\t6.���н���");
		System.out.println("\t7.��ѯ���");
		System.out.println("\t8.�˳�");	
		System.out.println("\t��ѡ��(1-8)");
	}
	
	
	/**
	 * �����˵�������ѡ��
	 */
	public static void creatMenu(){
		System.out.println("��ѡ�񿪿�����");
		System.out.println("\t1.���ÿ�");
		System.out.println("\t2.���");
		System.out.println("\t3.�˳�");
		System.out.println("\t��ѡ��(1-3)");
	}
	
	
	/**
	 * ��������
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
				scanner.nextLine();//��ȡ�����������Ļس�
				System.out.println("����������籣�˺�: ");
				customer.ssn = scanner.nextLine();
				
				System.out.println("����������: ");
				customer.name = scanner.nextLine();
				
				System.out.println("�����뿨��: ");
				checkingAccount.accountNum = scanner.nextLine();
				
				System.out.println("���������ÿ����շѽ��: ");
				checkingAccount.setServiceCharge(scanner.nextDouble());
				
				//���������뵽�ͻ�����
				customer.setCheckAccount(checkingAccount);
				
				System.out.println("��ϲ�������ÿ�����ɹ�^-^~~~");
				System.out.println();
				break;
			case 2:
				SavingAccount savingAccount = new SavingAccount();
				scanner.nextLine(); //��ȡ�����������Ļس�
				System.out.println("����������籣�˺�: ");
				customer.ssn = scanner.nextLine();
				
				System.out.println("����������: ");
				customer.name = scanner.nextLine();
				
				System.out.println("�����뿨��: ");
				savingAccount.accountNum = scanner.nextLine();
				
				System.out.println("����������Ϣ: ");
				savingAccount.setInterestRate(scanner.nextDouble());
				
				//���������뵽�ͻ�����
				customer.setSavingAccount(savingAccount);
				
				System.out.println("��ϲ�����������ɹ�^-^~~~");
				System.out.println();
				break;
			case 3: 
				flag = false;
				break;
			default:
				System.out.println("������1-3���");
				continue;
			}
		}
		System.out.println();
		System.out.println();
	}
	
	/**
	 * �����˻���Ǯ
	 * @param customer
	 */
	public static void save(Customer customer){
		System.out.println("����������:");
		double money = scanner.nextDouble();
		customer.savingAccount.setBalance(money+customer.savingAccount.getBalance());
		System.out.println("���ɹ�");
		System.out.println();
		System.out.println();
	}
	
	/**
	 * �����˻�ȡǮ
	 * @param customer
	 */
	public static void withDraw(Customer customer){
		System.out.println("������ȡ����:");
		double money = scanner.nextDouble();
		if (money > customer.savingAccount.getBalance()){
			System.out.println("�˻�����");
		}else{
			customer.savingAccount.setBalance(customer.savingAccount.getBalance()-money);
			System.out.println("ȡ��ɹ�\n�˻����: "+customer.savingAccount.getBalance());
		}
		System.out.println();
		System.out.println();
	}
	
	/**
	 * ���ÿ�����
	 * @param customer
	 */
	public static void consume(Customer customer){
		System.out.println("���������ѽ��: ");
		double money = scanner.nextDouble();
		customer.checkAccount.setBalance(customer.checkAccount.getBalance() - money);
		System.out.println("���ѳɹ�");
		System.out.println();
		System.out.println();
	}
	
	/**
	 * ���ÿ�����
	 * @param customer
	 */
	public static void repay(Customer customer){
		System.out.println("����ǰǷ�����: "+customer.checkAccount.getBalance());
		System.out.println("�����뻹����:");
		double money = scanner.nextDouble();
		customer.checkAccount.setBalance(customer.checkAccount.getBalance() + money);
		System.out.println("����ɹ�");
		System.out.println();
		System.out.println();
	}
	
	/**
	 * ���ÿ�������ѣ��ʹ�����ɷ�����������Ѵ�����
	 * @param customer
	 */
	public static void settle(Customer customer){
		System.out.println(customer.checkAccount.toString());
		System.out.println(customer.savingAccount.toString());
		customer.checkAccount.assessServiceCharge();
		customer.savingAccount.payInterest();
		System.out.println("���ڴ�����...");
		System.out.println(customer.checkAccount.toString());
		System.out.println(customer.savingAccount.toString());
		System.out.println("����ɹ�");
		System.out.println();
		System.out.println();
	}
	
	/**
	 * ��ѯ��ǰ�˻����
	 * @param customer
	 */
	public static void requireBalance(Customer customer){
		System.out.println("��ǰ���������: "+customer.savingAccount.getBalance());
		System.out.println("��ǰ���ÿ����: "+customer.checkAccount.getBalance());
		System.out.println();
		System.out.println();
	}
}