/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior[] army = new Warrior[100];
		for(int i = 0; i<army.length; i++){
			army[i] = new Warrior();
		}
		
		Wizard[] group = new Wizard[100];
		for(int i = 0; i<army.length; i++){
			group[i] = new Wizard();
		}
		
		int num = 0;
		int nums = 0;
		while(army.length>0 && group.length>0){
			group[num].attack(army[nums]);
			if(army[nums].isDead()){
				nums++;
				if(nums == 100){
					break;
				}
			}
			
			
			army[nums].attack(group[num]);
			if(group[num].isDead()){
				num++;
				if(num == 100){
					break;
				}
			}
			
		}
		
		int warriorsLeft = army.length - nums;
		int wizardsLeft = group.length - num;
		
		if(num>nums){
			System.out.println("The Wizards win with " + wizardsLeft + "!");
		}
		else{
			System.out.println("The Warrior's win with " + warriorsLeft + "!");
		}
		
		

	}
}
