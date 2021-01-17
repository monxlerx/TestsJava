package tema3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3_GuessStarter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random randomNumber = new Random();
		
		int secretNumber = randomNumber.nextInt(100) + 1;
		int guessNumber = 0;
		
		while (secretNumber != guessNumber) {
			System.out.println("----------------------------------------------");
			System.out.println("I´m thinking of a number between 1 and 100");
			System.out.println("Type a number");
			guessNumber = sc.nextInt();
			System.out.println("Your guess is " + guessNumber);
			System.out.println("The number I was thinking of is " + secretNumber);
			System.out.println("You were off " + Math.abs(secretNumber - guessNumber));
			System.out.println("----------------------------------------------");
			secretNumber = randomNumber.nextInt(100) + 1;
			
		}
		
	}

}
