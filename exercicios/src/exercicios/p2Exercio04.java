package exercicios;

import java.util.Scanner;

public class p2Exercio04 {

	public static void main(String[] args) {
		// TODO 
		Scanner sc = new Scanner(System.in);
		
		int hrI = sc.nextInt();
		int hrF = sc.nextInt();
		
		if (hrI > hrF) {
			int dura = (24 - hrI) + (0 + 2);
			System.out.println("O JOGO DUROU " + dura + " HORA(S)");
		}
		else {
				if (hrF == hrI) {
					int dura = 24;
					System.out.println("O JOGO DUROU " + dura + " HORA(S)");
			}
			else {
					int dura = (hrF - hrI);
					System.out.println("O JOGO DUROU " + dura + " HORA(S)");
				 }
				
			}
		
		sc.close();
		}
	}	


