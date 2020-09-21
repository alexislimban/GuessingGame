import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[]args) {
		
		Random rand = new Random();
		int upperbound = 100;
		
		int guessNum = rand.nextInt(upperbound);
		
		Scanner sc = new Scanner(System.in);
		
		//how many
		System.out.println("Enter how many trials you want:");
		int k = sc.nextInt();
		
		int i;
		int selectNum = 0;
		int specialNum = -1;
		
		for( i = 0; i < k; i++) {
			
		System.out.println("Choose an integer between 1-100:");
		selectNum = sc.nextInt();
	
			
			if ( guessNum == selectNum) {
				System.out.println("Congratulations, you guess the number");
				System.exit(0);
				break;
			}
	
			else if ( guessNum > selectNum && i != k -1) {
				System.out.println("The Answer is Greater than "+ selectNum);
			}
			
			else if ( guessNum < selectNum && i != k-1) {
				System.out.println("The Answer is Less than "+ selectNum);
			}
			
			}
		System.out.println("The correct answer is "+ guessNum+ " :(");
		
	}
}
