package week8;

import java.util.Scanner;

public class StringSplit {
	public static void main(String[] args) {
	
		Scanner scan =new Scanner(System.in);
		String express = scan.nextLine();
		
		int pos1=express.indexOf('(');
		
		String op1 = express.substring(0,pos1);
		
		int pos2,pos3;
		double num1,num2;
		pos3=express.indexOf(')');
		
		String op2=express.substring(pos1+1,pos3);
		
		double date1,date2,result=0;
		
		if(op1.equals("doubleMe")) {
			date1 = Double.parseDouble(op2.trim());
			date2=0;
		}
		else{
			String array[]=op2.split(",|£¬");		
			date1 = Double.parseDouble(array[0].trim());
			date2 = Double.parseDouble(array[1].trim());
		}
		
		
		switch(op1){
		case "add": 		result=date1+date2;		break;
		case "sub": 		result=date1-date2; 	break;
		case "max": if(date1>=date2) result=date1;
					else  			 result=date2;	break;
		case "min": if(date1<=date2) result=date1;
					else  			 result=date2;	break;
		case "doubleMe":	result=date1*date1;		break;
		default: System.out.println("error"); 		break;
		}
		System.out.print(express);
		System.out.print('=');
		System.out.print(result);
		
		
	}

}
