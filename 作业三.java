package ��ҵ1;
import java.util.Scanner;

public class ��ҵ�� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//����
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
		//����
		System.out.println("��������Ԫ������λ�����֣�");
		numberofcents = scan.nextInt();
		//����
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
		//���
		System.out.println("�ɻ�" + numberof100 + "��Ԫ");
		System.out.println(numberof50 + "��50����");
		System.out.println(numberof20 + "��20����");
		System.out.println(numberof10 + "��10����");
		System.out.println(numberof5 + "��5����");
		System.out.println(numberof2 + "��2����");
		System.out.println(numberof1 + "��1����");
	}

}
