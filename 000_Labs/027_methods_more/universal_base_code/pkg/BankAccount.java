/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String owner;
	private int accountNumber;
	private double balance;
	private boolean isActive;
	private static int nextAccountNumber = (int)(Math.random() * 1000) + 50;


	// -------CONSTRUCTORS-------
	public BankAccount(){
		owner = "unknown";
		balance = 0;
		isActive = true;
		accountNumber = nextAccountNumber;
		nextAccountNumber = nextAccountNumber + 1;
	}
	
	public BankAccount(String o){
		owner = o;
		isActive = true;
		balance = 0.0;
	}
	
	public BankAccount(String ow, double b){
		owner = ow;
		isActive = true;
		balance = b;
	}

	// -------METHODS-------
	public void checkBalance(){
		System.out.println(balance);	
	}
	
	public void displayAccountInfo(){
		System.out.println(owner);
		System.out.println(balance);
		System.out.println(accountNumber);
	}
	
}