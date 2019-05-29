package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// eu
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nFun, nHor;
		double vlHor, salary;
		
		nFun = sc.nextInt();
		nHor = sc.nextInt();
		vlHor = sc.nextDouble();
		
		salary = vlHor * nHor;
		
		System.out.println("Numero Func:" + nFun);
		System.out.printf("SALARY = U$ %.2f%n ", salary);

	}

}
