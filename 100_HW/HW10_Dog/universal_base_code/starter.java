/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner input = new Scanner(System.in);
		System.out.println("What do you want your dog's name to be?");
		String name = input.nextLine();
		System.out.println("What age do you want " + name + " to be?");
		int age = input.nextInt();
		Dog a = new Dog(name);
		a.setAge(age);
		Dog b = new Dog("Buddy", "German Shepard");
		System.out.println(a);
		System.out.println(b);
		if(a.isSleeping() == true){
			a.bark();
		}
		else{
			System.out.println(a.getName() + " is asleep! Dont wake him up!");
		}
		if(b.isSleeping() == false || a.isSleeping() == true){
			b.bark();
		}
		
		



	}
}
