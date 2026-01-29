/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    public static String getObject(){
        int random = (int)(Math.random() * 3) + 1;
        if(random == 1){
            return "rock";
        }
        else if(random == 2){
            return "paper";
        }
        else{
            return "scissors";
        }
    }
    
    public static int compare2(String player1, String player2){
        if(player1.equals(player2)){
            return 0;
        }
        else if(player1.equals("rock") && player2.equals("scissors") || player1.equals("paper") && player2.equals("rock") || player1.equals("scissors") && player2.equals("paper")){
            return 1;
        }
        else{
            return 2;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Do you want to play against the computer?(yes/no/done)");
            String choice = input.nextLine();
            if(choice.equals("done")){
                System.out.println("Thanks for playing");
                break;
            }
            else if(choice.equals("yes")){
                while(true){
                    System.out.println("Enter rock, paper, or scissors");
                    String choose = input.nextLine();
                    if(choose.equals("rock")){
                        break;
                    }
                    else if(choose.equals("paper")){
                        break;
                    }
                    else if(choose.equals("scissors")){
                        break;
                    }
                    else{
                        System.out.println("Invalid input. Please try again");
                    }
                    
                    
                }
                String choose = input.nextLine();
                String computerchoose = getObject();
                System.out.println("Computer chose " + computerchoose);
                if(choose.equals(computerchoose)){
                    System.out.println("You tied");
                }
                else if((choose.equals("rock")) && computerchoose.equals("scissors") || choose.equals("paper") && computerchoose.equals("rock") || choose.equals("scissors") && computerchoose.equals("paper")){
                    System.out.println("You won");
                }
                else {
                    System.out.println("You lost");
                }
            }
            else if(choice.equals("no")){
                System.out.println("How many games do you want the computer to play against itself?");
                int p1wins = 0;
                int p2wins = 0;
                int ties = 0;
                int gamecount = 0;
                int num = input.nextInt();
                while(gamecount <= num){
                    String p1 = getObject();
                    String p2 = getObject();
                    int result = compare2(p1, p2);
                    
                    if(result == 0){
                        ties = ties + 1;
                    }
                    else if(result == 1){
                        p1wins = p1wins + 1;
                    }
                    else{
                        p2wins = p2wins + 1;
                    }
                    
                    gamecount = gamecount + 1;
                }
                
                System.out.println("Summary: ");
                System.out.println("Player 1 wins: " + p1wins);
                System.out.println("Player 2 wins " + p2wins);
                System.out.println("Ties: " + ties);
            }
            else{
                System.out.println("Invalid option try again");
            }
        }
    }
    
}
