package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Program3 {

	public static void main(String[] args) {
		// Seçao 3 aula 52
		Locale.setDefault(Locale.US);   
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.5f%n", Calculator.PI);
		
		
		sc.close();
	}

	
}
