package exercicios;

import java.util.Scanner;

public class impExercicio01 {

	public static void main(String[] args) {
		// T
		Scanner sc = new Scanner(System.in);
	
		int flag = 0;
		while (flag == 0) {
		System.out.print("Digite o número: ");
		int x = sc.nextInt();
		
			for (int i = 1; i <= x; i++) {
				if(i % 2 != 0) {
					System.out.println(i);
				}
			}
		System.out.print("DIgite 1 para finalizar ou 0 continuar? ");
		flag = sc.nextInt();
		}		
		System.out.print("Obrigado, ate logo");
		sc.close();
	}

}
