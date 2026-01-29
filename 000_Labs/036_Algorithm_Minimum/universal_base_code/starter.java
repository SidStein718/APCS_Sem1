/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [] numbers = new int[(int)(Math.random() * 149) + 51];
		for(int i = 0; i<numbers.length; i++){
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<numbers.length; i++){
			if(numbers[i]<min){
				min = numbers[i];
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<numbers.length; i++){
			if(numbers[i]>max){
				max = numbers[i];
			}
		}
		
		int sum = 0;
		for(int i = 0; i<numbers.length; i++){
			sum = sum+numbers[i];
		}
		int average = sum/numbers.length;
		System.out.println("There are " + numbers.length + " elements in the array.");
		System.out.println("The minimum of the array is " + min + ".");
		System.out.println("The maximum of the array is " + max + ".");
		System.out.println("The average of the array is " + average + ".");
		
		


		
	}
}
