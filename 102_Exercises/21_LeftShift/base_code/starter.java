/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		String[] tvChars = {
			"Walter White", "Jesse Pinkman", "Saul Goodman", "Rick Grimes",
			"Eleven", "Michael Scott", "Dwight Schrute", "Jim Halpert",
			"Leslie Knope", "Ron Swanson", "Ted Lasso", "BoJack Horseman",
			"Homer Simpson", "Bart Simpson", "Peter Griffin", "Stewie Griffin",
			"Sheldon Cooper", "Geralt (Netflix)", "Wednesday Addams", "Joe Goldberg"
		};

		System.out.println("---------------------------------------------");
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars);
		printArray(tvChars);
		System.out.println("---------------------------------------------");


		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars, 5);
		printArray(tvChars);
		System.out.println("---------------------------------------------");
	}

	public static void printArray(String[] arr){
		for(int a = 0; a<arr.length-1; a++){
			System.out.print(arr[a] + ", ");
		}
		System.out.println(arr[arr.length-1]);
	}

	public static void leftShift(String [] arr){
		String Char = arr[0];
		for(int i = 0; i<arr.length-1; i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = Char;
	}

	public static void leftShift(String [] arr, int num){
		for(int i = 0; i<5; i++){
			leftShift(arr);
		}
	}
}
