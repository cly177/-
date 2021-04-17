package com.wtu;

public class Main extends Function{
	public static void main(String[] args) {
		Course course = new Course();
		boolean flag = true;
		int choice = 0;
		while (flag){
			firstMenu();
			choice = scanner.nextInt();
			switch (choice){
			case 1:
				createCourse(course);
				break;
			case 2:
				selectionCourse(course);
				break;
			case 3:
				dropCourse(course);
				break;
			case 4:
				showCourse(course);
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("请输入1-5序号");
				break;
			}
		}
		System.out.println("bye");
	}

}
