/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number");
		int num1 = sc.nextInt();
		System.out.println("Give me a second number");
		int num2 = sc.nextInt();
		System.out.println("Give me a third number");
		int num3 = sc.nextInt();
		if((num1>2) && (num1>num3))
		{
			System.out.println("Your first number was the largest");
			System.out.println("The number was " + num1);
		}
		else if((num2>num1) && (num2>num3))
		{
			System.out.println("Your second number was the largest");
			System.out.println("The number was " + num2);
		}
		else if((num3>num1) && (num3>num2))
		{
			System.out.println("Your third number was the largest");
			System.out.println("The number was " + num3);
		}
		
		if((num1<num2) && (num1<num3))
		{
			System.out.println("Your first number was the smallest");
			System.out.println("The number was " + num1);
		}
		else if((num2<num1) && (num2<num3))
		{
			System.out.println("Your second number was the smallest");
			System.out.println("The number was " + num2);
		}
		else if((num3<num1) && (num3<num2))
		{
			System.out.println("YOur third number was the smallest");
			System.out.println("The number was " + num3);
		}
		
	}
}
