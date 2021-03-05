package 作业1;
import java.util.Scanner;

public class 作业三 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//定义
		int cents100=100;
		int cents50=50;
		int cents20=20;
		int cents10=10;
		int cents5=5;
		int cents2=2;
		int cents1=1;
		
		int numberofcents;
		int remainingcents;
		int numberof100;
		int numberof50;
		int numberof20;
		int numberof10;
		int numberof5;
		int numberof2;
		int numberof1;
		//输入
		System.out.println("请输入美元数（单位：美分）");
		numberofcents = scan.nextInt();
		//计算
		numberof100=numberofcents/cents100;
		remainingcents=numberofcents%cents100;
		numberof50=remainingcents/cents50;
		remainingcents=remainingcents%cents50;
		numberof20=remainingcents/cents20;
		remainingcents=remainingcents%cents20;
		numberof10=remainingcents/cents10;
		remainingcents=remainingcents%cents10;
		numberof5=remainingcents/cents5;
		remainingcents=remainingcents%cents5;
		numberof2=remainingcents/cents2;
		remainingcents=remainingcents%cents2;
		numberof1=remainingcents/cents1;
		remainingcents=remainingcents%cents1;
		//输出
		System.out.println("可换" + numberof100 + "美元");
		System.out.println(numberof50 + "张50美分");
		System.out.println(numberof20 + "张20美分");
		System.out.println(numberof10 + "张10美分");
		System.out.println(numberof5 + "张5美分");
		System.out.println(numberof2 + "张2美分");
		System.out.println(numberof1 + "张1美分");
	}

}
