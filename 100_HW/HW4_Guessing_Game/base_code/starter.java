/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int rand = (int)(Math.random() * 3) + 1;
		Scanner sc = new Scanner(System.in);
		if(rand == 1)
		{
			System.out.println("The goal of the game is to guess a word with two hints.");
			System.out.println();
			System.out.println("It's a fruit. ");
			System.out.println("What is your guess?");
			String guess = sc.nextLine();
			if(guess.equals("Apple") || guess.equals("apple"))
			{
				System.out.println("You got it! Woo!");
			}
			else if(!guess.equals("Apple") || !guess.equals("apple"))
			{
				System.out.println("You sadly didn't guess the word. Here is another hint:");
				System.out.println("It is a red fruit");
				guess = sc.nextLine();
				if(guess.equals("Apple") || guess.equals("apple"))
				{
					System.out.println("Woo hoo. You got it!");
				}
				else
				{
					System.out.println("Sadly you didn't get it. The answer was an apple.");
				}
			}
		}
		
		if(rand == 2)
		{
			System.out.println("The goal of the game is to guess a word with two hints.");
			System.out.println();
			System.out.println("It's a planet in our solar system.");
			System.out.println("What is your guess?");
			String guess = sc.nextLine();
			if(guess.equals("Earth") || guess.equals("earth"))
			{
				System.out.println("You got it! Woo!");
			}
			else if(!guess.equals("Earth") || !guess.equals("earth"))
			{
				System.out.println("You sadly didn't guess the word. Here is another hint:");
				System.out.println("It is the only one with humans on it");
				guess = sc.nextLine();
				if(guess.equals("Earth") || guess.equals("earth"))
				{
					System.out.println("Woo hoo. You got it!");
				}
				else
				{
					System.out.println("Sadly you didn't get it. The answer was earth.");
				}
			}
		}
		
		if(rand == 3)
		{
			System.out.println("The goal of the game is to guess a word with two hints.");
			System.out.println();
			System.out.println("It's a furry animal");
			System.out.println("What is your guess?");
			String guess = sc.nextLine();
			if(guess.equals("Cat") || guess.equals("cat"))
			{
				System.out.println("You got it! Woo!");
			}
			else if(!guess.equals("Cat") || !guess.equals("cat"))
			{
				System.out.println("You sadly didn't guess the word. Here is another hint:");
				System.out.println("It is a feline friend");
				guess = sc.nextLine();
				if(guess.equals("Cat") || guess.equals("cat"))
				{
					System.out.println("Woo hoo. You got it!");
				}
				else
				{
					System.out.println("Sadly you didn't get it. The answer was a cat.");
				}
			}
		}
	}
}
