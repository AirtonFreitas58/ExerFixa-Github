package exercicios;

import java.util.Scanner;

public class p2Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			
			System.out.println("S�o Multiplos");
		}
		else {
			System.out.println("N�o S�o Multiplos");
			
		}
		
		sc.close();
		
		
		
	}

}
