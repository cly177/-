package 作业;

import java.util.Scanner;

public class 成绩系统 {
	public static int score[];
	public static void main(String[] args) {
		
		int choose=menu();
		while(choose!=6) {
			switch(choose) {
			case 1:  
				enterResults()  ;break;
			case 2:  
				if(score==null) {
					System.out.println("没有输入成绩，请选择1");
					break;
				}
				else
				classAverage(score)  ;break;
			case 3: 
				if(score==null) {
					System.out.println("没有输入成绩，请选择1");
					break;
				}
				else
				highestGrade(score)  ;break;
			case 4:
				
				lowestGrade (score)  ;break;
			case 5:
				if(score==null) {
					System.out.println("没有输入成绩，请选择1");
					break;
				}
				else
				paixu(score);break;
			default:   System.out.println("输入错误，重新输入");		
			}
			choose=menu();
		}
		System.out.println("再见");
	}

	public static int menu() {
		int choice = 0;
		System.out.println("**********************");
		System.out.println("1.enter results");
		System.out.println("2.class average");
		System.out.println("3.highest grade");
		System.out.println("4.lowest grade");
		System.out.println("5.排序");
		System.out.println("6.exit");
		System.out.println("请输入（1~6）");		
		Scanner scan=new Scanner(System.in);		
		choice=scan.nextInt();
		return choice;
	}

	public static void enterResults(){	
		score=new int [5];
		int flag=1;
		for(int i=0; i<score.length;i++) {
			System.out.println("请输入第"+(i+1)+"个同学成绩");
			flag=1;
			while(flag==1) {
				Scanner scan=new Scanner(System.in);
				score[i]=scan.nextInt();
				if(score[i]<=0||score[i]>100)  System.out.println("输入错误");
				else flag=0;
			}
		}
		
	}

	public static void classAverage(int score[]) {
		
		double sum=0,avg;
		for(int i=0; i<score.length;i++) {
			sum=sum+score[i];
		}
		avg=sum/score.length;
		System.out.println("平均成绩为"+avg);
		
	}

	public static void highestGrade(int score[]) {
		int num;
		num=score[0];
		for(int i=0; i<score.length;i++) {
			if(score[i]>num) num=score[i];
		}
		System.out.println("最大值为"+num);
	}

	public static void lowestGrade(int score[]) {
		int num;
		num=score[0];
		for(int i=0; i<score.length;i++) {
			if(score[i]<num) num=score[i];
		}
		System.out.println("最小值为"+num);
		
	}
	public static void paixu(int score[]) {
		int t;
		for (int i = 0; i < score.length-1; i++) {
			for (int j = 0; j < score.length-1-i; j++) {
				if(score[j]>score[j+1]) {
					t=score[j];
					score[j]=score[j+1];
					score[j+1]=t;
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
			
		}
		
	}

}
