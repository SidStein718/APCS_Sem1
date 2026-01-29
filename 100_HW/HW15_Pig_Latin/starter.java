/*
   * Author:
   * Date:
   * Collaborator(s):
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence in English");
		String str = input.nextLine();
		System.out.println("Here is your sentence in Pig Latin");
		String ans = " ";
		while(str.indexOf(" ") != -1){
			int space = str.indexOf(" ");
			String word = str.substring(0, space);
			str = str.substring(space+1);
			ans = ans + word;
		}
		
	}
}
