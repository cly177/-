package 作业1;
import java.util.Scanner;

public class 作业二 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 定义
		int box=24;
		int container=75;
		
		int numberofcookies;
		int numberofbox;
		int numberofcontainer;
		int remainingcookies;
		int remainingbox;
		//输入
		System.out.println("请输入饼干数量");
		numberofcookies = scan.nextInt();
		//计算
		numberofbox=numberofcookies/box;
		numberofcontainer=numberofbox/container;
		remainingcookies=numberofcookies%box;
		remainingbox=numberofbox%container;
		//输出
		System.out.println("能装"+numberofbox+"盒");
		System.out.println("能装"+numberofcontainer+"容器");
		System.out.println("剩"+remainingcookies+"饼干");
        System.out.println("剩"+remainingbox+"盒");
	}
}
