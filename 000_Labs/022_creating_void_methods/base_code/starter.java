/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	
	public static void toString(String text){
		System.out.println(text);
	}
	
	public static void toStringCombined(String text, String text2){
		System.out.println(text + " " + text2);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String phrase1 = sc.nextLine();
		toString(phrase1);
		System.out.println("Enter a sentence");
		String phrase2 = sc.nextLine();
		toStringCombined(phrase1, phrase2);
		



		
	}
}
