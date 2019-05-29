package exercicios;

import java.util.Scanner;

public class exercicio06_Div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			// resto da divisão: N % 1	
			if (N % i == 0) {
			
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
