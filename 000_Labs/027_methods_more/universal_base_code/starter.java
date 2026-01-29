/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Sid's Atm!");
		System.out.println("What kind of account do you want to make?");
		System.out.println("1. No info");
		System.out.println("2. Name");
		System.out.println("3. Name and initial Deposit");
		System.out.println("-------------------------------------------");
		int type = input.nextInt();
		input.nextLine();
		while(type > 3 || type < 0){
			System.out.println("Sorry we dont offer that kind of account");
			type = input.nextInt();
			input.nextLine();
		}
		if(type == 1){
			System.out.println();
			System.out.println("------------------------------------------");
			BankAccount a = new BankAccount();
			a.checkBalance();
			a.displayAccountInfo();
		}
		else if(type == 2){
			System.out.println("Enter your name");
			String name = input.nextLine();
			System.out.println();
			System.out.println("------------------------------------------");
			BankAccount b = new BankAccount(name);
			b.checkBalance();
			b.displayAccountInfo();
		}
		else if(type == 3){
			System.out.println("Enter your name");
			String nombre = input.nextLine();
			System.out.println("Give me your initial deposit");
			int deposit = input.nextInt();
			input.nextLine();
			System.out.println();
			System.out.println("------------------------------------------");
			BankAccount c = new BankAccount(nombre, deposit);
			c.checkBalance();
			c.displayAccountInfo();
		}
		
		
		

		
	}
}
