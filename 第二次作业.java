package 作业;
import java.util.Scanner;

public class 第二次作业 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int number,n,i,t;
	int sum=0;
	System.out.println("请输入一个正整数n(3<=n<=7):");
	n=scan.nextInt();
	for (i = (int)Math.pow(10, n-1); i < Math.pow(10, n); i++) {
		number = i;
		sum=0;
		while (number > 0) {
			
			t = number % 10;
			number = number / 10;
			sum = (int)(sum +  Math.pow(t, n));
		}
		if (i == ((int)sum))
			System.out.println(i);
	}
	}
}

