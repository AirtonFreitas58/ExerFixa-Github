package application;

import java.util.Locale;
import java.util.Scanner;
import entities.employee;

public class program {

	public static void main(String[] args) {
		// TODO
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee emp = new employee();	
		
		System.out.println("Name: ");
		emp.name = sc.nextLine(); 
		System.out.println("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();   
		System.out.println("Employee: " + emp); 
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();   
		System.out.println("Updated data: " + emp); 
		
		
		sc.close();
	}

}
