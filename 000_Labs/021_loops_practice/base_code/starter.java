/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java .util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = (int)(Math.random() * 1000) + 1;
		System.out.println("Please enter a number between 1 and 1000");
		int guess = sc.nextInt();
		while(guess != number)
		{
			if(guess>number)
			{
				System.out.println("Your guess was too high try again");
				guess = sc.nextInt();
			}
			else if(guess<number)
			{
				System.out.println("Your guess was too low try again");
				guess = sc.nextInt();
			}
			else if(guess == number)
			{
				System.out.println("Great job you got the number");
				break;
			}
		}



		
	}
}
