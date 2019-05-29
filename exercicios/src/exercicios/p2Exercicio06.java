package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class p2Exercicio06 {

	public static void main(String[] args) {
		// TODO 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if (valor >= 0 && valor <= 25) {
			System.out.println(valor + " INTERVALO " + "0,25");
		}
		else if (valor > 25 && valor <= 50) {
				System.out.println(valor + " INTERVALO " + "25,50");
		} 
		else if (valor > 50 && valor <= 75) {
				System.out.println(valor + " INTERVALO " + "50,75");
			 }
		else if (valor > 75 && valor <= 100) {
				System.out.println(valor + " INTERVALO " + "75,100");
		}
		else if(valor < 0 || valor > 100) {
			System.out.println(valor + " Fora de Intervalos");	
		}
			
		sc.close();
	}

}
