package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConvert;

public class Programa {

	public static void main(String[] args) {
		// Cota��o do dollar  exercicio de fixa��o aula 53
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConvert.dollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		sc.close();
	}

}
