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
		int [] arr = new int[1001];
		int num = 0;
		while(num<arr.length){
			arr[num] = (int)(Math.random() * 101) + 1;
			System.out.println(arr[num]);
			num = num + 1;
		}


		
	}
}
