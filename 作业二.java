package ��ҵ1;
import java.util.Scanner;

public class ��ҵ�� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ����
		int box=24;
		int container=75;
		
		int numberofcookies;
		int numberofbox;
		int numberofcontainer;
		int remainingcookies;
		int remainingbox;
		//����
		System.out.println("�������������");
		numberofcookies = scan.nextInt();
		//����
		numberofbox=numberofcookies/box;
		numberofcontainer=numberofbox/container;
		remainingcookies=numberofcookies%box;
		remainingbox=numberofbox%container;
		//���
		System.out.println("��װ"+numberofbox+"��");
		System.out.println("��װ"+numberofcontainer+"����");
		System.out.println("ʣ"+remainingcookies+"����");
        System.out.println("ʣ"+remainingbox+"��");
	}
}
