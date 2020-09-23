/*
Alexander Mikhalkov, Alexis Limban, Derek Lucas, Grigory Mironovich, Oluwayelemi Olorunleke

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class GuessingGame {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		int randguess = rand.nextInt(((100 - 1) + 1) + 1);

		System.out.println("Enter an integer: ");
		int userguess = sc.nextInt();

		int guesses = 0;
		List<Integer> guessedNumbers = new ArrayList<>();
		List<String> pastRecord = new ArrayList<>();

		while (userguess != -1) {
			if (userguess == randguess) {
				guesses++;
				guessedNumbers.add(userguess);
				System.out.println("All guessed numbers: " + guessedNumbers);
				System.out.println("You guessed right, you won! It took you " + guesses + " tries!");
				pastRecord.add("Amount of guesses: " + guesses + ". The list of guessed numbers: " + guessedNumbers + ". Winning number: " + randguess + ". User won!");
				writeFile(pastRecord.toString());
				break;
			} else {
				if(guessedNumbers.contains(userguess)) {
					System.out.println("All guessed numbers: " + guessedNumbers);
					System.out.println("Already guessed that number, please enter another one");
					userguess = sc.nextInt();
				} else if(userguess < 1 || userguess > 100) {
					System.out.println("All guessed numbers: " + guessedNumbers);
					System.out.println("Number should be between 1 and 100, please enter another one");
					userguess = sc.nextInt();
				} else {
					guesses++;
					guessedNumbers.add(userguess);
					System.out.println("All guessed numbers: " + guessedNumbers);
					System.out.println("Wrong number, please enter another one");
					userguess = sc.nextInt();
				}
			}
		}
		if(userguess == -1) {
			System.out.println("All guessed numbers: " + guessedNumbers);
			System.out.println("Looks like you gave up. You have tried " + guesses + " times!");
			pastRecord.add("Amount of guesses: " + guesses + ". The list of guessed numbers: " + guessedNumbers + ". Winning number: " + randguess + ". User lost/gave up!");
			writeFile(pastRecord.toString());
		}
	}

	public static void writeFile(String string) {
		try {
			FileWriter fileWrite = new FileWriter("pastRecord.txt", true);
			fileWrite.append(string + "\n");
			fileWrite.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
