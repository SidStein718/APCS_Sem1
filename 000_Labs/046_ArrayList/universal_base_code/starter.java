/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> cookies = new ArrayList<String>();
		System.out.println("How many cookies do you want?");
		int num = input.nextLine();
		System.out.println("What kind of cookies do you want?");
		String kind = input.nextLine();
		for(int i = 0; i<num; i++){
			cookies.add(kind);
		}
		
		System.out.println(cookies);
		



	}
}
