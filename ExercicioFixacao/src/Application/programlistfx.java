package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class programlistfx {

	public static void main(String[] args) {
	// exercicio de fixação sobre "LIST()"
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
	
		// PART 1 - READING DATA:
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
		System.out.println();
		System.out.println("Employee #" + i + ": ");
		System.out.print("id: ");
		int id = sc.nextInt();
		
		System.out.print("name: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Salary: ");
		double salary = sc.nextDouble();
					
		list.add(new Employee(id, name, salary));	
		}
		
		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:  

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("\"This id does not exist!");
		}
		else {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:

		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
