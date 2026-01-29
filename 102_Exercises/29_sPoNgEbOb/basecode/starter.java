/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word/phrase");
		String answer = input.nextLine();
		
		while(answer.indexOf(" ") != -1){
			String word = answer.substring(0, answer.indexOf(" "));
			System.out.println(spongeWord(answer) + " ");
			answer = answer.substring(answer.indexOf(" ")+1);
		}
		System.out.println(spongeWord(answer));
		
		
		public static String spongeWord(String word){
			String ans = "";
			for(int i = 0; i<answer.length(); i++){
				String letter = answer.substring(i, i+1);
				if(i%2 = 0){
					letter = letter.toLowerCase();
				}
				else{
					letter = letter.toUpperCase();
				}
				ans = ans + letter;
			}
		}
	}
}
