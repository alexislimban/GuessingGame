import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

         Random rand = new Random();
         int randguess = rand.nextInt(101);

        System.out.println("Enter an integer: ");
        Scanner kb = new Scanner(System.in);
        int userguess = kb.nextInt();

        while (userguess != -1) {
            System.out.println("Wrong number, please enter another one");
            userguess = kb.nextInt();
            if (userguess == randguess) {
                System.out.println("You guessed right, you won!");
                break;
            }
        }
    }
}