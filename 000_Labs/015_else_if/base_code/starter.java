/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = (int)(Math.random() * 1001) + 1;
		System.out.println("Guess a random number between 1 and 1000");
		int guess = sc.nextInt();
		if(guess == number)
		{
			System.out.println("Congratulations you guessed the number correctly");
		}
		else if(guess > number)
		{
			System.out.println("Sorry your number was bigger than the random number. The number was " + number);
		}
		else if(guess < number)
		{
			System.out.println("Sorry your number was smaller than the random number. The number was " + number);
		}
	}
}
