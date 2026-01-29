/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int [] arr){
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i] + " ");
		}
	}
	
	public static int getArrayAverage(int [] arr){
		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}
	
	public static int getArrayMax(int [] arr){
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
		
	}
	
	public static int getArrayMin(int [] arr){
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String args[]) {
		int [] numbers = new int[(int)(Math.random() * 100) + 1];
		for(int i = 0; i<numbers.length; i++){
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.print("The elements of the array: ");
		toStringArray(numbers);
		System.out.println();
		System.out.print("The average of the array: ");
		getArrayAverage(numbers);
		System.out.println();
		System.out.print("The max of the array: ");
		getArrayMax(numbers);
		System.out.println();
		System.out.print("The average of the array: ");
		getArrayMin(numbers);
	
		
	}
	
	
}
