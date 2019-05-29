package exercicios;

import java.util.Scanner;

public class Exercicio01A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
	// ou assim
		//int valor1, valor2, soma;
		//	valor1 = sc.nextInt();
		//	valor2 = sc.nextInt();
				
		int soma = valor1 + valor2;
		
	// ou assim
		//soma = valor1 + valor2;
		
		System.out.printf("SOMA: "+ soma);
		
		
		sc.close();
			

	}

}
