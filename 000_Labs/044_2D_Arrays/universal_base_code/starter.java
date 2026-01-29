/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [][] arr = new int [2][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		System.out.println("The 2d array has 2 rows and 3 columns");
		System.out.println("The 2d array is the following:");
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
		}
		
		int sumNumbers = 0;
		int count = 0;
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				sumNumbers += arr[i][j];
				count++;
			}
		}
		
		double average = (double)sumNumbers/count;
		System.out.println("Average of the 2d array: " + average);


		
	}
}
