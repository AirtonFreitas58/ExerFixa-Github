package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
		// Em seguida, calcule e mostre: 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		double A, B, C, area, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		// calculo da area do triangulo area = (a * b)/2
		area = (A * C)/ 2.0;
		// calculo do circulo ==> A = π . r2
		circulo = pi * (C * C);
		//calculo da áre do trapézio ==> 
		trapezio = (A + B) / 2.0 * C;
		// calculo da área do quadrado que tem lado B. ==> A = L2( L ao quadrado)
		quadrado = B * B;
		// calculo da área do retângulo que tem lados A e B.  A=base * altura
		retangulo = A * B;
		
		// exemplo 1 : 3.0 4.0 5.2
		// exemplo 2 : 12.7 10.4 15.2
		
		System.out.printf("%.2f%n ", A);
		System.out.printf("%.2f%n ", B);
		System.out.printf("%.2f%n ", C);
		System.out.printf("Triangulo: %.3f%n ", area);
		System.out.printf("circulo: %.3f%n ", circulo);
		System.out.printf("Trapezio: %.3f%n ", trapezio);
		System.out.printf("quadrado: %.3f%n ", quadrado);
		System.out.printf("Retangulo: %.3f%n ", retangulo);
	
		sc.close();
		
	}

}
