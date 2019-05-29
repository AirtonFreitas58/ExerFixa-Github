package exercicios;

import java.util.Scanner;

public class exCombustivel {

	public static void main(String[] args) {
		// Exercicio 04
		Scanner sc = new Scanner(System.in);
		
		String a = "Alcool:";
		String g = "Gasolina:";
		String d = "Diesel:";
		int alcool = 0;
		int gasolina =0;
		int diesel = 0;
			
		int combustivel = sc.nextInt();
		
		while (combustivel >= 1 && combustivel != 4 )  {
				if(combustivel == 1) {
					alcool++;
				//	combustivel = sc.nextInt();
				} else if(combustivel == 2) {
						gasolina++;
				//		combustivel = sc.nextInt();
					} else if(combustivel == 3) {
							diesel++;
						//	combustivel = sc.nextInt();
					}						
						combustivel = sc.nextInt();
			}
		System.out.println("MUITO OBRIGADO");
		System.out.println(a + alcool);
		System.out.println(g + gasolina);
		System.out.println(d + diesel);
		
		sc.close();
	}

}
