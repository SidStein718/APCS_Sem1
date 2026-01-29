/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		int age = (int)(Math.random() * 100) + 25;
		PooleDwarf test = new PooleDwarf();
		PooleDwarf a = new PooleDwarf(randName(), age);
		age = (int)(Math.random() * 100) + 25;
		PooleDwarf b = new PooleDwarf(randName(), age);
		age = (int)(Math.random() * 100) + 25;
		PooleDwarf c = new PooleDwarf(randName(), age);
		age = (int)(Math.random() * 100) + 25;
		PooleDwarf d = new PooleDwarf(randName(), age);
		age = (int)(Math.random() * 100) + 25;
		PooleDwarf e = new PooleDwarf(randName(), age);
		age = (int)(Math.random() * 100) + 25;
		PooleDwarf f = new PooleDwarf(randName(), age);
		age = (int)(Math.random() * 100) + 25;
		PooleDwarf g = new PooleDwarf(randName(), age);
		if(a.randName().equals(b.randName())){
			System.out.println("One of the name prints out.");
		}
		else if(a.randName().equals(c.randName())){
			System.out.println("One of the name prints out.");
		}
		else if(a.randName().equals(d.randName())){
			System.out.println("One of the name prints out.");	
		}
		else if(a.randName().equals(e.randName())){
			System.out.println("One of the name prints out.");
		}
		else if(a.randName().equals(e.randName())){
			System.out.println("One of the name prints out.");
		}
		else if(a.randName().equals(f.randName())){
			System.out.println("One of the name prints out.");
		}
		else if(a.randName().equals(g.randName())){
			System.out.println("One of the name prints out.");
		}
		else{
			System.out.println("None of the names print out.");
		}
		
	}
}
