package ��ҵ1;
import java.util.Scanner;
public class ��ҵ�� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ����
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
		//����
		System.out.println("�����볤");
		length = scan.nextFloat();
		System.out.println("�������");
		wide = scan.nextFloat();
		System.out.println("��ѡ��1.��ͨ���  2.��ʽ���");
		frame = scan.nextInt();
		System.out.println("���������ڵ�����");
		numberofcrowns = scan.nextInt();
		//����
		if(frame==1) costofframe=costofregular;
		else costofframe=costoffancy;
		cost=length*wide*(glass+paperbehind)+numberofcrowns*crowns+Wide*costofcolouring+costofframe;
		//���
		System.out.println("�ɱ���"+cost+"��Ԫ");
	}
}
