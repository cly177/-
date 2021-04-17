package week7;

import java.util.Scanner;

public abstract class Function {
	public static Scanner scanner = new Scanner(System.in);
	private static final int DEFAULT_CAPACITY = 3;
	
	/**
	 * ѡ��ϵͳ���˵�
	 */
	public static void firstMenu(){
		System.out.println("***********WTUѡ��ϵͳ***********");
		System.out.println("1.�����γ�");
		System.out.println("2.ѡ��");
		System.out.println("3.��ѡ");
		System.out.println("4.��ӡ����");
		System.out.println("5.�˳�");	
		System.out.println("��ѡ��(1-5)");
	}
	
	public static void createCourse(Course course) {
		scanner.nextLine();//��ȡ�����������Ļس�
		System.out.println("������γ�id: ");
		course.setcId(scanner.nextLine());
		
		System.out.println("������γ�����: ");
		course.setcName(scanner.nextLine());
		
		System.out.println("������γ�����: ");
		int capacity = scanner.nextInt();
		capacity = capacity < DEFAULT_CAPACITY? DEFAULT_CAPACITY : capacity;
		course.setCapacity(capacity);
		System.out.println();
	}
	
	public static void selectionCourse(Course course) {
		if (course.getCapacity() == 0) {
			System.out.println("��δ�����γ̣����ȴ����γ�!");
			return;
		}
		
		if (course.getSize() == course.getCapacity()) {
			System.out.println("��ǰ�γ�������");
			return;
		}
		
		Student stu = new Student();
		
		scanner.nextLine();//��ȡ�����������Ļس�
		System.out.println("������ѧ��id: ");
		stu.setsId(scanner.nextLine());
		
		System.out.println("������ѧ������: ");
		stu.setsName(scanner.nextLine());
		
		course.list.add(stu);
		course.setSize(course.getSize() + 1);
		System.out.println("��ϲ�㣬ѡ�γɹ�!");
		System.out.println("��ǰ�γ����: ");
		showCourse(course);
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println();
	}
	
	public static void dropCourse(Course course) {
		scanner.nextLine();//��ȡ�����������Ļس�
		System.out.println("������ѧ��id: ");
		String id = scanner.nextLine();
		
		for (int i = 0; i < course.list.size(); i++) {
			Student student = course.list.get(i);
			if (student.getsId().equals(id)) {
				course.list.remove(i);
				System.out.println("�˿γɹ���");
				course.setSize(course.getSize() - 1);
				System.out.println("��ǰ�γ����: ");
				showCourse(course);
				return;
			}
		}
		
		System.out.println("��ǰѧ��:"+id+"δѡ�Σ�");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println();
	}
	
	public static void showCourse(Course course) {
		System.out.println(course.toString());
	}
	
	
}