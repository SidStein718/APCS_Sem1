/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title?(ex: Slayer of Dragons)");
		String title = sc.nextLine();
		System.out.println("Do you want to be a Warrior, Wizard, or Rogue?");
		String answer = sc.nextLine();
		if(answer.equals("Warrior") || answer.equals("warrior"))
		{
			System.out.println("You've chosen the warrior! For Honor!");
			System.out.println();
		}
		else if(answer.equals("Wizard") || answer.equals("wizard"))
		{
			System.out.println("You've chosen the wizard! Excelsior!");
			System.out.println();
		}
		else if(answer.equals("Rogue") || answer.equals("rogue"))
		{
			System.out.println("You've chosen the Rogue! How Cunning!");
			System.out.println();
		}
		int points = 20;
		System.out.print("You have 20 skill points to spend in the following categories:");
		System.out.println(" Strength, Dexterity, Inteligence, and Charisma. Spend them wisely");
		System.out.println();
		System.out.println("Strength (1-10)");
		int spend = sc.nextInt();
		if(spend>10)
		{
			System.out.println("Please input a smaller value");
			System.out.println("Strength (1-10)");
			spend = sc.nextInt();
		}
		points = points-spend;
		System.out.println("You have " + points + " points left.");
		System.out.println();
		System.out.println("Dexterity (1-10)");
		int spendtwo = sc.nextInt();
		if(spendtwo>10)
		{
			System.out.println("Please input a smaller value");
			System.out.println("Dexterity (1-10)");
			spendtwo = sc.nextInt();	
		}
		points = points-spendtwo;
		System.out.println("You have " + points + " points left.");
		System.out.println();
		System.out.println("Inteligence (1-10)");
		int spendthree = sc.nextInt();
		if(spendthree>10)
		{
			System.out.println("Please input a smaller value");
			System.out.println("Inteligence (1-10)");
			spendthree = sc.nextInt();	
		}
		points = points-spendthree;
		System.out.println("You have " + points + " points left.");
		System.out.println();
		System.out.println("Charisma (1-10)");
		int spendfour = sc.nextInt();
		if(spendfour>10)
		{
			System.out.println("Please input a smaller value");
			System.out.println("Charisma (1-10)");
			spendfour = sc.nextInt();	
		}
		System.out.println();
		points = points-spendfour;
		System.out.println("You have " + points + " left to spend for next time.");
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + name + ", the " + title + " of CVHS");
		System.out.println("You are a " + answer + " with the following stats.");
		System.out.println("Strength - " + spend);
		System.out.println("Dexterity - " + spendtwo);
		System.out.println("Inteligence - " + spendthree);
		System.out.println("Charisma - " + spendfour);
		System.out.println();
		System.out.println("Good luck on your quest " + name + "!");
		
		
		
		
		
	}
}
