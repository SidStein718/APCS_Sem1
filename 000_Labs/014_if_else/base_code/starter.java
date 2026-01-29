/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rand = (int)(Math.random() * 1001) + 1;
		System.out.println("Guess a random number between 1 and 1000");
		int guess = sc.nextInt();
		if (guess == rand)
		{
			System.out.println("Great job you guessed the number correctly");
		}
		else
		{
			System.out.println("Your number wasnt the random number. The number was " + rand);
		}
	}
}
