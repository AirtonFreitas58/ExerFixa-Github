package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class raizQuadrada {

	public static void main(String[] args) {
		// TODO 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = b * b - 4.0 * a * c;
		
		if (a == 0 || delta < 0.0) {
			System.out.println("Impossivel Calcular");
		} else {
			double R1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double R2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
		}
		
		sc.close();

	}

}
