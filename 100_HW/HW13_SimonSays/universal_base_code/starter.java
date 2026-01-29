/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import pkg.*;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a difficulty level: 1, 2, or 3");
        int diff = sc.nextInt();
        sc.nextLine();

        /* 
            Basics of the game:
            - Given a set of words, the player must memorize the colors
            - After a 5 second delay, the player must type in each color one at a time on separate lines
            - At any point, if they type in an incorrect color, the game ends. The game will print out the correct colors.
            - If they get them all right, the game will continue and add one more word to the series.
            - The series changes every round.
        */

        //  Given the Colors class, use the following method calls to help this program.
        //Colors.print("Test 1");         // This prints out the value given without a new line   
        //Colors.println("Test 2");       // This prints out the value given then a new line
        //Colors.print("Test 3", "BRIGHT_Red");       // 2 String parameters: Value, Color of text
        //Colors.println("Test 4", "BRIGHT_Red");     // 2 String parameters: Value, Color of text WITH a new line after
        //Colors.print("Test 5", "BRIGHT_Red", "BG_Blue");         // 3 String parameters: Value, Color of text, Color of background
        //Colors.println("Test 6", "BRIGHT_Red", "BG_Blue");       // 3 String parameters: Value, Color of text, Color of background WITH a new line after
        // Notice: for the colors, you must concatenate "BRIGHT_" or "BG_" to the input parameter to get the bright or background versions of the colors.

        // Feel free to comment out the test code above when you start your assignment

        if(diff == 1){
            boolean losing = false;
            int i = 0;
            while(losing == false){
                String[] colors = new String[i+1];
                for(i = 0; i<colors.length; i++){
                    colors[i] = getColorWord();
                }
                printArray(colors);
                System.out.println("Memorize the phrase above!");
                System.out.println("You have : "); 
                delay(5);
                for(i = 0; i<23; i++){
                    System.out.println();
                }
                System.out.println("Please enter the words you saw on different lines");
                for(i = 0; i<colors.length; i++){
                    String answer = sc.nextLine();
                
                    if(answer !.equals(colors[i])){
                        System.out.println("You got it wrong!");
                        System.out.println("WORDS: " + printArray(colors));
                        losing = true;
                    }
                    else{
                        System.out.println("You got it! Onto the next level!");
                    }
                }
            }
        }
        else if(diff == 2){
            boolean lose = false;
            int j = 0;
            while(lose == false){
                String[] colorss = new String[j+1];
                for(j = 0; j<colorss.length; j++){
                    colorss[j] = ("Bright_"+getColor());
                }
                printArray(colorss);
                System.out.println("Memorize the phrase above!");
                System.out.println("You have : "); 
                delay(5);
                int number = (int)(Math.random() * 2) + 1;
                if(number == 1){
                    for(j = 0; j<23; j++){
                        System.out.println();
                    }
                    System.out.println("Please enter the words you saw on different lines");
                    for(j = 0; j<colors.length; j++){
                        String answer = sc.nextLine();
                        if(answer !.equals(colorss[j])){
                            System.out.println("You got it wrong!");
                            System.out.println("WORDS: " + printArray(colorss));
                            lose = true;
                        }
                        else{
                            System.out.println("You got it! Onto the next level!");
                        }
                    }    
                }
                else if(number == 2){
                    for(j = 0; j<23; J++){
                        System.out.println();
                    }
                    System.out.println("Please enter the colors you saw on different lines");
                    for(j = 0; j<colorss.length; j++){
                        answer = sc.nextLine();
                        if(answer !(.equals(colorss[j]))){
                            System.out.println("You got it wrong!");
                            System.out.println("WORDS: " + printArray(colorss));
                            lose = true;
                        }
                        else{
                            System.out.println("You got it! Onto the next level!");
                        }
                    } 
                }
                
            }
            
        }
        else if(diff == 3){
            boolean loss = false;
            int k = 0;
            while(loss == false){
                String[] colours = new String[k+1];
                for(k = 0; k<colours.length; k++){
                    colours[k] = ("Bright_BG_"+getColor());
                }
                printArray(colours);
                System.out.println("Memorize the phrase above!");
                System.out.println("You have : "); 
                delay(5);
                number = (int)(Math.random() * 3) + 1;
                if(number == 1){
                    for(k = 0; k<23; k++){
                        System.out.println();
                    }
                    System.out.println("Please enter the words you saw on different lines");
                    for(k = 0; k<colors.length; k++){
                        answer = sc.nextLine();
                        if(answer !.equals(colours[k])){
                            System.out.println("You got it wrong!");
                            System.out.println("WORDS: " + printArray(colours));
                            lose = true;
                        }
                        else{
                            System.out.println("You got it! Onto the next level!");
                        }
                    }    
                }
                else if(number == 2){
                    for(k = 0; k<23; k++){
                        System.out.println();
                    }
                    System.out.println("Please enter the colors you saw on different lines");
                    for(k = 0; k<colorss.length; k++){
                        answer = sc.nextLine();
                        if(answer !(.equals(colours[k]))){
                            System.out.println("You got it wrong!");
                            System.out.println("WORDS: " + printArray(colours));
                            lose = true;
                        }
                        else{
                            System.out.println("You got it! Onto the next level!");
                        }
                    } 
                }
                else if(number == 3){
                    for(k= 0; k<23; k++){
                        System.out.println();
                    }
                    System.out.println("Please enter the background colors you saw on different lines");
                    for(k = 0; k<colours.length; k++){
                        answer = sc.nextLine();
                        if(answer !(.eqauls(colours[k]))){
                            System.out.println("You got it wrong!");
                            System.out.println("WORDS: " + printArray(colours));
                            loss = true;
                        }
                        else{
                            System.out.println("You got it! Onto the next level!");
                        }
                    }
                }
                
            }
        

        }
        else {
            System.out.println("Wrong number, try again.");
        }
    }

    // This method should take in a String array as a parameter and print out each element in the array.
    public static void printArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}


    // This method can be called to return a random color. This syntax is the correct syntax for the Colors class. 
    public static String getColorWord(){
        int rand = (int)(Math.random()*5);
        switch (rand){
            case 0: return "Purple";
            case 1: return "Red";
            case 2: return "Green";
            case 3: return "Yellow";
            case 4: return "Blue";
            default: return "White";
        }
    }

    // This method can be called to delay for a certain number of seconds.
    // The parameter count represents the number of seconds to delay.
    public static void delay(int count){
        for (int i = 0; i < count; i++) {
			System.out.print(count-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
    }
}
