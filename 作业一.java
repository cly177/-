package ��ҵ1;
import java.util.Scanner;
public class ��ҵһ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ����
		String songTitle;
		float songPrice;
		int number;
		
		float totalRevence;
		float siteTevence;
		float managerRevence;
		float siteRate;
		float managerRate;
		// ��ֵ
		siteRate = 0.03f;
		managerRate = 0.12f;
        //����
		System.out.println("������������ƣ�");
		songTitle = scan.nextLine();
		System.out.println("�����뵥�ۣ�");
		songPrice = scan.nextFloat();
		System.out.println("������������");
		number = scan.nextInt();
		// ����
		totalRevence = songPrice * number;
		siteTevence = totalRevence * siteRate;
		managerRevence = totalRevence * managerRate;

		// ���
		System.out.println("������" + totalRevence);
		System.out.println("��������" + managerRevence);
		System.out.println("վ������" + siteTevence);
	}
}
