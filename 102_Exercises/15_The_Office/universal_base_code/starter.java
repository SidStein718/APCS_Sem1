/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.0);
		Employee andrew = new Employee(4167, "Andrew", "Ghassemian", 4.41);
		michael.raiseSalary(67);
		dwight.raiseSalary(41);
		jim.raiseSalary(67);
		pam.raiseSalary(41);
		andrew.raiseSalary(-67);
		michael.employeeToString();
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		andrew.employeeToString();
	}
}
