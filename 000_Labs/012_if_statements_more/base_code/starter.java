/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number");
		int number1 = sc.nextInt();
		System.out.println("\nGive me another number");
		int number2 = sc.nextInt();
		if(number1 == number2)
		{
			System.out.println("Your numbers are equal");
		}
		else
		{
			System.out.println("Your numbers are different");		}
		}
}
