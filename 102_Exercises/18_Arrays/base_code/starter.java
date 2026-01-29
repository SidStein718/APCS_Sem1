/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr1 = new int[1001];
		int [] arr2 = new int[1001];
		
		int num = 0;
		int v1 = 3;
		while(num <= 1000){
			arr1[num] = v1;
			v1 = v1 + 3;
			num++;
		}
		
		num = 0;
		int v2 = 1000;
		while(num <= 1000){
			arr2[num] = v2;
			v2 = v2-1;
			num++;
		}
		
		num = 0;
		while(num <= 1000){
			System.out.println(arr1[num]);
			num++;
		}
		
		num = 0;
		while(num <= 1000){
			System.out.println(arr2[num]);
			num++;
		}
		
	}
}
