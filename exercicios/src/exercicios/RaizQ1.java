package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class RaizQ1 {

	public static void main(String[] args) {
		// TODO 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
							
		while (numero > 0.0) {
			double raiz = Math.sqrt(numero);
			System.out.printf("A raiz quadrada é = %.5f%n ", raiz);
			System.out.print("Digite um novo numero: ");
			numero = sc.nextDouble();
		} 
		System.out.println("Este número não tem raiz");
		
		sc.close();
	}

}
