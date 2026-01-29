/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int random1 = (int)(Math.random() * 10);
		System.out.println("A number between 0-9: " + random1);
		int random2 = (int)(Math.random() * 100) + 1;
		System.out.println("A number between 1-10: " + random2);
		double random3 = (int)(Math.random() * 3.5) + 2.5;
		System.out.println("A number between 2.5-3.5: " + random3);
		double random4 = (int)(Math.random() * 589) + 14;
		System.out.println("A number between 14-589: " + random4);
	}
}
