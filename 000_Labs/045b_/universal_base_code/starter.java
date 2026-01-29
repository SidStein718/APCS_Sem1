/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
        
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a word");
        
        String word = input.nextLine();
        String [][] crossWord = new String[word.length() + 5][word.length() + 5];
        
        int direction = (int)(Math.random() * 3) + 1;
        int row = (int)(Math.random() * word.length() + 5);
        int column = (int)(Math.random() * word.length() + 5);
        for(int i = 0; i < word.length(); i++){
            if(direction == 1 && column + word.length() < word.length() + 5){
                crossWord[row][column + i] = word.substring(i, i+1);
            }
            else if(direction == 2 && row + word.length() < word.length() + 5){
                crossWord[row + i][column] = word.substring(i, i+1);
            }
            else if(direction == 3 && row + word.length() < word.length() + 5 && column + word.length() < word.length() + 5){
                crossWord[row + i][column + i] = word.substring(i, i+1);
            }
            
        }
        
        for(int i = 0; i < crossWord.length; i++){
            for(int j = 0; j < crossWord[i].length; j++){
                if(crossWord[i][j] == null){
                    crossWord[i][j] = letters[(int)(Math.random() * letters.length)];
                }
            }
        }
        
        for(String [] rows : crossWord){
            for(String letter : rows){
                System.out.print(letter + " ");
            }
            System.out.println();
        }
		
	}
}
