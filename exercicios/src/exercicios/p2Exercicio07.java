package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class p2Exercicio07 {

	public static void main(String[] args) {
		// TODO 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
					System.out.println("Eixo y");
		}
			 else if (y == 0.0) {
				 		System.out.println("Eixo x");
			 	  }
			 else if (x > 0.0 && y > 0.0) {
				 		System.out.println("Q1");
			 }
			 else if (x > 0.0 && y < 0.0) {
				 		System.out.println("Q4");
			 }
			 else if (x < 0.0 && y > 0.0) {
				 		System.out.println("Q2");
			 }
			 else if (x < 0.0 && y < 0.0) {
				 		System.out.println("Q3");
			 }
		
		sc.close();
	}

}
