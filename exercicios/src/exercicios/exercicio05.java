package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) { 	
		// uuu
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// primeira linha de produto: cod.produto, qt peças, valor unitario
		double aPagar;
		String codPro = sc.next(); 			// 13 2 15.30 - 1 1 15.10 
		int qtdP = sc.nextInt(); 			  
		double vluntP = sc.nextDouble();
		
		// segunda linha de produto: cod.produto, qt peças, valor unitario
		String codPro2 = sc.next(); 
		int qtdP2 = sc.nextInt(); 			// 161 4 5.20 - 2 1 15.10
		double vluntP2 = sc.nextDouble();
		
		// calcula preço total 
		aPagar = qtdP * vluntP + qtdP2 * vluntP2;
		
		System.out.printf("VALOR A PAGAR: = R$ %.2f%n ", aPagar);
		
		sc.close();	
		

	}

}
