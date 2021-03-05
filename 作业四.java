package 作业1;
import java.util.Scanner;
public class 作业四 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 定义
		double costofcolouring=0.10;
		float Wide=1;
		double costofregular=0.15;
		double costoffancy=0.25;
		double paperbehind=0.02;
		double glass=0.07;
		double crowns=0.35;
		
		double length;
		double wide;
		int frame;
		double costofframe;
		int numberofcrowns;
		double cost;
		//输入
		System.out.println("请输入长");
		length = scan.nextFloat();
		System.out.println("请输入宽");
		wide = scan.nextFloat();
		System.out.println("请选择：1.普通框架  2.花式框架");
		frame = scan.nextInt();
		System.out.println("请输入牙冠的数量");
		numberofcrowns = scan.nextInt();
		//计算
		if(frame==1) costofframe=costofregular;
		else costofframe=costoffancy;
		cost=length*wide*(glass+paperbehind)+numberofcrowns*crowns+Wide*costofcolouring+costofframe;
		//输出
		System.out.println("成本共"+cost+"美元");
	}
}
