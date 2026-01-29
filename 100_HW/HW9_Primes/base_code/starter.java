/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int number){
		if(number<=1){
			return false;
		}
		
		int divisor = 2;
		while(divisor * divisor <= number){
			if (number % divisor == 0){
				return false;
			}
			divisor = divisor + 1;
		}
		return true;
	}
	
	public static void printPrimes(int dividend){
		int num = 2;
		
		while(num < dividend){
			if(checkPrime(num)){
				System.out.println(num);
			}
			num = num + 1;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number(int only!): ");
		int input = sc.nextInt();
		System.out.println("------------------------------");
		printPrimes(input);
		
		
	}
}
