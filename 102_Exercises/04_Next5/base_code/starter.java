/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :");
		int number = sc.nextInt();
		System.out.println("Here are the next 5 numbers!");
		System.out.println(number + ", " + (number+1) + ", " + (number+2) + ", " + (number+3) + ", " + (number+4) + ", " + (number+5));
		System.out.println("Here are the next multiples of " + number);
		System.out.println(number + ", " + (number*2) + ", " + (number*3) + ", " + (number*4) + ", " + (number*5));
		System.out.println("Here is " + number + " divided by 100");
		double number2 = number;
		System.out.println(number2/100);
		System.out.println("Here is " + number + " divided by 10");
		double number3 = number;
		System.out.println(number3/10);
		

	}
}
