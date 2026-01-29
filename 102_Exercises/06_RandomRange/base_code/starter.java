/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me an integer");
		int num1 = sc.nextInt();
		System.out.println("Give me another integer(bigger than the first)");
		int num2 = sc.nextInt();
		while(num2<num1)
		{
			System.out.println("Give me another integer(bigger than the first)");
			num2 = sc.nextInt();
		}
		int number = (int)(Math.random() * num2) + num1;
		System.out.println("Your range is " + num1 + " to " + num2);
		System.out.println("Here are 5 number generated within that range");
		System.out.print((int)(Math.random() * (num2-num1)) + num1);
		System.out.print(", ");
		System.out.print((int)(Math.random() * (num2-num1)) + num1);
		System.out.print(", ");
		System.out.print((int)(Math.random() * (num2-num1)) + num1);
		System.out.print(", ");
		System.out.print((int)(Math.random() * (num2-num1)) + num1);
		System.out.print(", ");
		System.out.print((int)(Math.random() * (num2-num1)) + num1);
	}
}
