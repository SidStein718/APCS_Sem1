/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("How many times do you want your name printed?");
		int number = sc.nextInt();
		int x = 0;
		while(x<number)
		{
			if(x<number){
				System.out.println(x + ". " + name);
			}
			x = x+1;
		}



		
	}
}
