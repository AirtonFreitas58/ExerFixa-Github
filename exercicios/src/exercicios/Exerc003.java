package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);  // para usar "." e não "," sistema americano
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Largura: ");
		double largura = sc.nextDouble();
		System.out.println("Comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.println("Vl.Metro 2: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA: %.2f%n", area);
		System.out.printf("PREÇO: %.2f%n", preco);
		
		sc.close();

	}

}
