package com.wtu;
import java.util.Scanner;

public abstract class Function {
	public static Scanner scanner = new Scanner(System.in);
	private static final int DEFAULT_CAPACITY = 3;
	
	/**
	 * 选课系统主菜单
	 */
	public static void firstMenu(){
		System.out.println("***********WTU选课系统***********");
		System.out.println("1.创建课程");
		System.out.println("2.选课");
		System.out.println("3.退选");
		System.out.println("4.打印名单");
		System.out.println("5.退出");	
		System.out.println("请选择(1-5)");
	}
	
	public static void createCourse(Course course) {
		scanner.nextLine();//读取上面留下来的回车
		System.out.println("请输入课程id: ");
		course.setcId(scanner.nextLine());
		
		System.out.println("请输入课程名称: ");
		course.setcName(scanner.nextLine());
		
		System.out.println("请输入课程容量: ");
		int capacity = scanner.nextInt();
		capacity = capacity < DEFAULT_CAPACITY? DEFAULT_CAPACITY : capacity;
		course.setCapacity(capacity);
		System.out.println();
	}
	
	public static void selectionCourse(Course course) {
		if (course.getCapacity() == 0) {
			System.out.println("还未创建课程，请先创建课程!");
			return;
		}
		
		if (course.getSize() == course.getCapacity()) {
			System.out.println("当前课程已满。");
			return;
		}
		
		Student stu = new Student();
		
		scanner.nextLine();//读取上面留下来的回车
		System.out.println("请输入学生id: ");
		stu.setsId(scanner.nextLine());
		
		System.out.println("请输入学生姓名: ");
		stu.setsName(scanner.nextLine());
		
		course.list.add(stu);
		course.setSize(course.getSize() + 1);
		System.out.println("恭喜你，选课成功!");
		System.out.println("当前课程情况: ");
		showCourse(course);
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println();
	}
	
	public static void dropCourse(Course course) {
		scanner.nextLine();//读取上面留下来的回车
		System.out.println("请输入学生id: ");
		String id = scanner.nextLine();
		
		for (int i = 0; i < course.list.size(); i++) {
			Student student = course.list.get(i);
			if (student.getsId().equals(id)) {
				course.list.remove(i);
				System.out.println("退课成功！");
				course.setSize(course.getSize() - 1);
				System.out.println("当前课程情况: ");
				showCourse(course);
				return;
			}
		}
		
		System.out.println("当前学生:"+id+"未选课！");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println();
	}
	
	public static void showCourse(Course course) {
		System.out.println(course.toString());
	}
	
	
}
