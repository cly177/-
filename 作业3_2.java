package 作业;

import java.util.Scanner;

public class 作业3_2 {
	public static int a,b;
	public static void main(String[] args) {
		
		int choose=menu();
		while(choose!=6) {
			switch(choose) {
			case 1: input() ;break;
			case 2: function1(a,b) ;break;
			case 3: function2(a,b) ;break;
			case 4: function3(a,b) ;break;
			case 5: function4(a,b) ;break;
			default:   System.out.println("输入错误，重新输入");			
			}
			choose=menu();
		}
		System.out.println("再见");
	}

	public static int menu() {
		int choice = 0;
		System.out.println("**********************");
		System.out.println("1.输入");
		System.out.println("2.显示两整数之间的所有奇数");
		System.out.println("3.输出两整数之间的所有偶数的和");
		System.out.println("4.输出1~10之间所有数字以及他们的平方");
		System.out.println("5.输出两个整数之间所有奇数的平方和");
		System.out.println("6.退出");
		System.out.println("请输入（1~6）");		
		Scanner scan=new Scanner(System.in);		
		choice=scan.nextInt();
		return choice;
	}
	public static void input() {
		int flag=1;
		while(flag==1) {
			System.out.println("请输入两个整数，且第一个整数小于第二个");
			Scanner scan=new Scanner(System.in);
			a=scan.nextInt();
			b=scan.nextInt();
			if(a<b)  flag=0;
			else   System.out.println("输入错误，重新输入");		
		}		
	}
	public static void function1(int m,int n) {   //显示两整数之间的所有奇数
		for (int i=a ;  i<= b; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			if(i%10==0) System.out.println(",");
		}
	}
	public static void function2(int m,int n) {   //输出两整数之间的所有偶数的和
		int sum=0;
		for (int i=a ;  i<= b; i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("偶数和为："+sum);
	}
	public static void function3(int m,int n) {   //输出1~10之间所有数字以及他们的平方
		double x;
		for (int i = 1; i <= 10; i++) {
			x=Math.pow(i, 2);
			System.out.println(i+"的平方为"+ x );
		}
	}
	public static void function4(int m,int n) {   //输出两个整数之间所有奇数的平方和
		double x,sum=0;
		for (int i = a; i <= b; i++) {
			if(i%2!=0) {
				x=Math.pow(i, 2);
				sum=sum+x;
			}
		}
		System.out.println("的平方和为"+ sum );
	}
	

}
