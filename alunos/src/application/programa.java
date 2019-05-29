package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Studant;

public class programa {

	public static void main(String[] args) {
		// h
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Studant student = new Studant();
		
		System.out.println("Nome do Aluno: "); 
		student.nome = sc.nextLine();
		System.out.println("Nota Primeira trimestre: "); 
		student.notaT1 = sc.nextDouble();
		System.out.println("Nota segundo trimestre: "); 
		student.notaT2 = sc.nextDouble();
		System.out.println("Nota Terceiro trimestre: "); 
		student.notaT3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade()); 
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");    
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoint()); 
		}	else {
			System.out.println("PASS"); 
		}
		sc.close();
	}

}
