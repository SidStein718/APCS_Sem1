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
		System.out.println("Enter a sentence");
		String str = input.nextLine();
		String ans = " ";
		while(str.indexOf(" ") != -1){
			int space = str.indexOf(" ");
			String word = str.substring(0, space);
			str = str.substring(space+1);
			ans = word+ans;
		}
		System.out.println(str + " " + ans);
		


		
	}
}
