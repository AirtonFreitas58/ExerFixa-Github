package exercicios;

import java.util.Scanner;

public class exercicio05_Fat {

	public static void main(String[] args) {
		//  fatorial de: N = N * (N-1) * (N-2) * (N-3) * ... * 1. 
		
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		int x = N - 1;
		int y = x;
		
		if(x <= 0) {
			N = 1;	
			x = 1;
		} 
		
		for(int i = 0; i < y; i++) {
			N = N * x;
			x--;
		}
		System.out.println(N);
		
		sc.close();
	}

}
