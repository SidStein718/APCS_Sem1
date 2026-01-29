/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an animal, object, or face.");
		String answer = sc.nextLine();
		if(answer.equals("Animal") || answer.equals("animal"))
		{
			System.out.println("""
			/~\
		   C oo
		   _( ^)
		   /   ~\\	
			""");
		}
		else if(answer.equals("Object") || answer.equals("object"))
		{
			System.out.println("""
			.----.
			|C>_ |
		  __|____|__
		 |  ______--|
         `-/.::::.\\-'
           `--------'
			""");
		}
		else if(answer.equals("Face") || answer.equals("face"))
		{
			System.out.println("""
			///-\\\\\\\
			 |-    -|
			 |o    o|
			 |   ^  |
			 \\  _  /
			   |   |
			""");
		}
		else
		{
			System.out.println("Thats is not an answer");
		}
		
	}
}
