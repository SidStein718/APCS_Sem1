/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	
	public static int pow(int base, int exponent)
	{
		int result = 1;
		int count = 0;
		if(exponent == 0)
		{
			return 1;
		}
		else if(exponent < 0)
		{
			return 0;
		}
		else
		{
			while(count < exponent)
			{
				result = result * base;
				count = count + 1;
			}
			
			return result;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your base number");
		int x = sc.nextInt();
		System.out.println("Enter the exponent number");
		int y = sc.nextInt();
		int answer = pow(x, y);
		System.out.println("Your answer is: " + answer);
	
	}	
}
