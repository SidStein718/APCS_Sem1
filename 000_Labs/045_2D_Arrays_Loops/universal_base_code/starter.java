/*
 *	Author:
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows you want");
		int rows = input.nextInt();
		System.out.println("Enter the number of columns you want");
		int columns = input.nextInt();
		
		int [][] arrNumber = new int[rows][columns];
		
		for(int i = 0; i<arrNumber.length; i++){
			for(int j = 0; j<arrNumber[i].length; j++){
				arrNumber[i][j] = (int)(Math.random() * 10) + 1;
			}
		}
		
		printArray(arrNumber);
		System.out.println("---------------------------------------------------");
		printRowAverage(arrNumber);
		System.out.println("---------------------------------------------------");
		printArrayAverage(arrNumber);
		System.out.println("---------------------------------------------------");
		
		public static void printArray(int[][] arr){
			for(i = 0; i<arr.length; i++){
				for(j = 0; j<arr[i].length; j++){
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		public static void printRowAverage(int[][] arr){
			input = new Scanner(System.in);
			System.out.println("What row do you want to get the average of?");
			int row = input.nextLine();
			while(row<0 || row >= arr.length){
				System.out.println("Invalid row number");
			}
			int sum = 0;
			for(j = 0; j<arr[row].length; j++){
				sum += arr[row][j];	
			}
			double average = (double)sum/arr[row].length;
			System.out.println("Row" + row + " average: " + average);
		}
		
		public static void printArrayAverage(int[][] arr){
			sum = 0;
			int count = 0;
			
			for(i = 0; i<arr.length; i++){
				for(j = 0; j<arr.length; j++){
					sum += arr[i][j];
					count++;
				}
			}
			double average = (double)sum/count;
			System.out.println("The average of the 2d array is " + average);
		}
		
		


		
	}
}
