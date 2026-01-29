/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1 = 13;
		int num2 = 6;
		int num3 = 11;
		int num4 = 30;
		int num5 = 7;
		int num6 = -2;
		double num7 = 3;
		double num8 = 8;
		double num9 = 31;
		double num10 = 37;
		double num11 = 35;
		double num12 = 21;
		double num13 = 14;
		double num14 = 2;
		int Maximum1 = Math.max(num1-num2*num3, num4%num5*(num6));
		System.out.println("Maximum = " + Maximum1);
		double squareRoot = Math.sqrt(num7*num8+num9%num5);
		System.out.println("Square Root = " + squareRoot);
		double Power = Math.pow(num10/num7, num11%num12);
		System.out.println("Power = " + Power);
		double Maximum2 = Math.max(Math.pow(num14, num13%num7), Math.sqrt(num14*num2));
		System.out.println("Maximum = " + Maximum2);
		System.out.println();
		System.out.println("Give me a double");
		double num20 = sc.nextDouble();
		System.out.println("Give me another double");
		double num21 = sc.nextDouble();
		
		
		double Maximum3 = Math.max(num20, num21);
		System.out.println("Maximum number of x and y is " + Maximum3);
		double squareRoot2 = Math.sqrt(num21);
		System.out.println("Square root of y is " + squareRoot2);
		double Power2 = Math.pow(num20,num21);
		System.out.println("Power of x and y is " + Power2);
		
		
	}
}
