package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class tiraRaiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
							
		double raiz = Math.sqrt(numero);
		System.out.printf("A raiz quadrada é = %.5f%n ", raiz);

		sc.close();
	
	}

}
