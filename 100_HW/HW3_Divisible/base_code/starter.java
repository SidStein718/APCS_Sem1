/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me an integer");
		int num1 = input.nextInt();
		System.out.println("Give me another integer");
		int num2 = input.nextInt();
		System.out.println();
		if(num1%2 == 0)
		{
			System.out.println(num1 + " is a even number");
		}
		else
		{
			System.out.println(num1 + " is an odd number");
		}
		
		if(num1%3 == 0)
		{
			System.out.println(num1 + " is divisible by 3");
		}
		if(num1%4 == 0)
		{
			System.out.println(num1 + " is divisible by 4");
		}
		if(num1%5 == 0)
		{
			System.out.println(num1 + " is divisible by 5");
		}
		
		if(num1%3 != 0 && num1%4 != 0 && num1%5 != 0)
		{
			System.out.println(num1 + " is not divisible by 3, 4, or, 5");
		}
		
		if(num2%2 == 0)
		{
			System.out.println(num2 + " is a even number");
		}
		else
		{
			System.out.println(num2 + " is an odd number");
		}
		
		if(num2%3 == 0)
		{
			System.out.println(num2 + " is divisible by 3");
		}
		if(num2%4 == 0)
		{
			System.out.println(num2 + " is divisible by 4");
		}
		if(num2%5 == 0)
		{
			System.out.println(num2 + " is divisible by 5");
		}
		
		if(num2%3 != 0 && num2%4 != 0 && num2%5 != 0)
		{
			System.out.println(num2 + " is not divisible by 3, 4, or, 5");
		}
		
	}
}
