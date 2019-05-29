package exercicios;

import java.util.Scanner;

public class exercicioX_n {

	public static void main(String[] args) {
		// TODO 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter N: "); 
		int n = sc.nextInt();
		
		while (n <= 0) {
			System.out.println("N must be positive! Try again: " + n);
			n = sc.nextInt();
		}
		int higher = Integer.MIN_VALUE;
		for (int i=1; i<=n; i++) {
			System.out.print("Value #" + i + ": "); 
			int v = sc.nextInt();
			if (v > higher) {
				higher = v;
			}
		}
		System.out.println("Higher = " + higher); 
		sc.close();
	}

}
