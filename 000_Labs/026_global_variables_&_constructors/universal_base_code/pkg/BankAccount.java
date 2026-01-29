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
		nextAccountNumber = 0;
		balance = 0;
		isActive = true;
		accountNumber = accountNumber + 1;
	}
	
	public BankAccount(String o){
		o = owner;
		isActive = true;
		balance = 0.0;
	}
	
	public BankAccount(String ow, double b){
		ow = owner;
		isActive = true;
		b = balance;
	}

	// -------METHODS-------

}