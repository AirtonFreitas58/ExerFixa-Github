package exercicios;

import java.util.Scanner;

public class p2Exercicio05 {

	public static void main(String[] args) {
		// TODO 
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int qtde = sc.nextInt(); 
		
		double valPg = 0;
		if (codigo == 1) {
			 valPg = qtde * 4.0;
			 System.out.println(qtde + " Cachorro(s) Quente");
		}
		else if (codigo == 2) {
				valPg = qtde * 4.50;
				System.out.println(qtde + " XSalada(s)");
			 }
		else if (codigo == 3) {
				valPg = qtde * 5.0;
				System.out.println(qtde + " XBacon(s)");
			 }
		else if (codigo == 4) {
				valPg = qtde * 2.0;
				System.out.println(qtde + " Torrada(s) Simples");
			 }
		else if (codigo == 5) {
				valPg = qtde * 1.5;
				System.out.println(qtde + " Refrigerante(s)");
			 }
						
		System.out.printf("TOTAL: R$ %.2f%n", valPg);	
		
		sc.close();	
	}

}
