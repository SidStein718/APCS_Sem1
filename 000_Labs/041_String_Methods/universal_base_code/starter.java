/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a first and last name with a space in the middle");
		String name = input.nextLine();
		System.out.println("The last name is: " + name.substring(name.indexOf(" "), name.length()));
		


		
	}
}
