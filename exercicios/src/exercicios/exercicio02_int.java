package exercicios;

import java.util.Scanner;

public class exercicio02_int {
	

	public static void main(String[] args) {
		// t
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); 
		int in = 0;
		int out = 0;
		
		for(int i=0;i<N; i++) {
			int x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " In");
		System.out.println(out + " Out");
		
		sc.close();
	}

}
