/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to be a Warrior, Wizard, or Rogue?");
		String answer = sc.nextLine();
		if(answer.equals("Warrior") || answer.equals("warrior"))
		{
			System.out.println("You've chosen the warrior! For Honor!");
		}
		else if(answer.equals("Wizard") || answer.equals("wizard"))
		{
			System.out.println("You've chosen the wizard! Excelsior!");
		}
		else if(answer.equals("Rogue") || answer.equals("rogue"))
		{
			System.out.println("You've chosen the Rogue! How Cunning!");
		}
	}
}
