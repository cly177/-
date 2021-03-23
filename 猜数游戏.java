package java作业;
import java.util.Scanner;
public class 猜数游戏 {
        public static void main(String[] args) {
		
		int randomNum;
		randomNum=1+(int)(Math.random()*1000);
		
		System.out.println("I have a number between 1 and 1000.");
		System.out.println("can you guess the number?");
		System.out.println("Please type your first guess.");
	
		Scanner scan=new Scanner(System.in);
		int times;
		for(times=1;times<=10;times++) {
		int mg=scan.nextInt();
		if(mg==randomNum) {
			System.out.println("Excellt!You guessed the number");
			break;
		}
		else {
			if(mg>randomNum) {
				System.out.println("Too High,Try again.");
			}
			else {System.out.println("Too Low,Try again.");}
			}
		System.out.println("left "+(10-times));
		}
		}
}
