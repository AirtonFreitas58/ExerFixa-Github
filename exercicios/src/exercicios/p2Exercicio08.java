package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class p2Exercicio08 {

	public static void main(String[] args) {
		// TODO  
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double imposto = 0;
		
		double salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			System.out.println("ISENTO");
		}
		else if (salario <= 3000.00) {
				imposto = (salario - 2000.00) * 0.08; 
				System.out.printf("R$ %.2f%n", imposto);
			 }
		else if (salario <= 4500.00) {
				imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
				System.out.printf("R$ %.2f%n", imposto);
			 }
		else { imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08 ;
			  System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();		
		} 

	}


