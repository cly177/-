package java作业;

import java.util.Scanner;

public class week3作业2 {
	public static int num1,num2;

	public static void main(String[] a) {
		int choose = menu();
		while (choose != 5) {
			switch (choose) {
			case 1:
				input();
				break;
			case 2:
				choose = output1();
				break;
			case 3:
				choose = output2();
				break;
			case 4:
				choose = output3();
				break;
			default:
				System.out.println("输入错误，请重新输入！");
			}
			choose = menu();
		}
		System.out.println("over!");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("========score========");
		System.out.println("1.input");
		System.out.println("2.output1");
		System.out.println("3.output2");
		System.out.println("4.output3");
		System.out.println("5.exit");
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入选项：");
		choose = scan.nextInt();
		return choose;

	}

	public static void input() {
		System.out.println("请输入两个整数（第一个数小于第二个数）：");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
	}

	public static int output1() {
		System.out.println("两数之间的奇数为：");
		int number;
		for(number=num1 ; number<=num2 ; number++){
			if(number%2!=0){
				System.out.println(number);
			}
		}
		return number;
	}

	public static int output2() {
		System.out.println("两数之间的偶数和为：");
		int number,sum=0;
		for(number=num1 ; number<=num2 ; number++){
			if(number%2==0){
				sum=sum+number;
			}
		}
		System.out.println(sum);
		return sum;
	}
	public static int output3() {
		System.out.println("两数之间的奇数平方和为：");
		int number,sum=0;
		for(number=num1 ; number<=num2 ; number++){
			if(number%2!=0){
				int number2;
				number2=number*number;
				sum=sum+number2;
			}
		}
		System.out.println(sum);
		return sum;
	}
}
