/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:");
		System.out.println("1. The player starts with $100");
		System.out.println("2. Input a wager less than your total amount of money");
		System.out.println("3. The slot machine will roll 3 numbers from 1-10");
		System.out.println("   a. Two numbers match, you double your money");
		System.out.println("   b. Three numbers match, you triple your money");
		System.out.println("   c. If none of them match, you lose your money");
		System.out.println("------------------------------------------------");
		System.out.println();
		int money = 100;
		while(money>0)
		{
			System.out.println("Would you like to play slots? (Yes/yes/Y/y)");
			String choice = sc.nextLine();
			if(choice.equals("Yes") || choice.equals("yes") || choice.equals("Y") || choice.equals("y"))
			{
				System.out.println("You have $100. How much would you like to wager?");
				int wagernumber = sc.nextInt();
				while(wagernumber<=0 && wagernumber>money)
				{
					System.out.println("Sneaky! No negatives, 0, or values greater than your wallet!");
					System.out.println("Enter a different number");
					wagernumber = sc.nextInt();
				}
				System.out.println();
				int num1 = (int)(Math.random() * 10) + 1;
				int num2 = (int)(Math.random() * 10) + 1;
				int num3 = (int)(Math.random() * 10) + 1;
				System.out.println("Great! Let's play!!!");
				System.out.println("Your rolls are: ");
				System.out.println("________________________");
				System.out.println(" | " + num1 + " | " + num2 + " | " + num3 + " |");
				System.out.println("________________________");
				if(num1 != num2 && num1 != num3 && num2 != num3)
				{
					System.out.println("Didn't win this time, better luck next time!");
					System.out.println("You now have $" + money + ".");
				}
				else if(num1 == num2 || num1 == num3 || num2 == num3)
				{
					System.out.println("You won your money has been doubled.");
					money = (money-wagernumber)+money*2;
					System.out.println("You now have $" + money);
				}
				else if(num1 == num2 && num1 == num3 && num2 == num3)
				{
					System.out.println("You won your money has been tripled");
					money = (money-wagernumber)+money*3;
					System.out.println("You now have $" + money);
				}
			}
			else if(choice.equals("No") || choice.equals("no") || choice.equals("N") || choice.equals("n"))
			{
				System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
				break;
			}
		}
	}
}
