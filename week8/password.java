package week8;

import java.util.Scanner;

public class password {
	public static void main(String[] args) {
		boolean flag=false;
		while(flag==false){
			boolean flaglength=false;
			boolean flagkg=false;
			boolean flagupper=false;
			boolean flaglower=false;
			boolean flagnumber=false;
			
			System.out.println("请设置密码，要求如下");
			System.out.println("1.长度5~10");
			System.out.println("2.不能有空格");
			System.out.println("3.有大写和小写");
			System.out.println("4.有数字");
			Scanner scan =new Scanner(System.in);
			String password;
			password = scan.next();
			int len=password.length();
			if(len>10||len<5){				
				flaglength=true;
			}
			for(int i=0;i<password.length();i++){
				char c=password.charAt(i);				
				if(c==' '){
					flagkg=true;
					break;
				}
				if(c>='A'&&c<='Z'){
					flagupper=true;
				}
				if(c>='a'&&c<='z'){
					flaglower=true;
		
				}
				if(c>='0'&&c<='9'){
					flagnumber=true;
				}
			}
			if(!flagkg && flagupper && flaglower && flagnumber && !flaglength ){
				System.out.println("密码正确");
				flag=true;
			}
			else{
				System.out.println("密码错误原因如下：");
				if(flaglength) System.out.println("长度不正确");
				if(flagkg) System.out.println("有空格");
				if(!flagupper) System.out.println("没有空大写字母");
				if(!flaglower) System.out.println("没有空格小写字母");
				if(!flagnumber) System.out.println("没有数字");
			}
		}
		
			
	}
}
