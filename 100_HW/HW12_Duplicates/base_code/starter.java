/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[20];
		System.out.println("These are the 20 numbers:");
		System.out.println();
		for(int i = 0; i<arr.length; i++){
			arr[i] = (int)(Math.random() * 10) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int targetNum = (int)(Math.random() * 10) + 1;
		System.out.println("The random number to look for is " + targetNum);
		System.out.println();
		int duplicate = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == targetNum){
				duplicate = duplicate + 1;
			}	
		}
		System.out.println("Total number of duplicates for " + targetNum + " is " + duplicate);
		System.out.println();
		boolean consecutive = false;
		for(int i = 0; i<arr.length - 1; i++){
			if(arr[i] == arr[i+1]){
				consecutive = true;
				System.out.println("Consecutive duplicates found at: " + arr[i] + " at indexes " + i + " and " + (i+1));
			}
			
		}
		
		if(!consecutive){
			System.out.println("There are no consecutive duplicates.");
		}
		
	}
}
