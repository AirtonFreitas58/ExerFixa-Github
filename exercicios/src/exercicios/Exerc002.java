package exercicios;				// modelo de barra

import java.util.Locale;
import java.util.Scanner;

public class Exerc002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		// String line01 = "Enter your full name: "; 
		// String line02 = "How many bedrooms are there in your house? ";
		String line03 = "Enter product price: ";
		String line04 = "Enter your last name, age and height (same line): ";
		
		// System.out.println(line01);
		System.out.println("Enter your full name: ");
		String nome = sc.nextLine();
		System.out.println("How many bedrooms are there in your house? ");
		int qtPessoas = sc.nextInt();
		
		System.out.println(line03);
		double price = sc.nextDouble();
		
		System.out.println(line04);
		String nome2 = sc.next(); 
		char age = sc.next().charAt(0); 
		double height = sc.nextDouble();

		
		System.out.println(nome);
		System.out.println(qtPessoas);
		System.out.printf("%.2f%n", price); 
		
		System.out.println(nome2);
		System.out.println(age);
		System.out.printf("%.2f%n", height);
		
		
		sc.close(); 
	}

}
