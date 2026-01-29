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
		System.out.println("What symbol would you like to use?");
		String symbol = input.nextLine();
		System.out.println("What do you want the width of the box to be?");
		int width = input.nextInt();
		System.out.println("How high do you want the box?");
		int height = input.nextInt();
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				System.out.println(symbol + " ");
			}
			System.out.println();
		}


		
	}
}
