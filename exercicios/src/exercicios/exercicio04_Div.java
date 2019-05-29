package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04_Div {

	public static void main(String[] args) {
		// t
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			//	int a = sc.nextInt();
			//	int b = sc.nextInt();
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			if(b != 0 ) {
				double div = (double) a / b;
				System.out.printf("%.1f%n", div);
			}
			else {
				System.out.println("divisao impossivel");
			}
		}
		sc.close();		
	}
}
