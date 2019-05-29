package exercicios;
// exercicio 01
import java.util.Scanner;

public class exSenha01 {

	public static void main(String[] args) {
		// des
		Scanner sc = new Scanner(System.in);
		
		int conte = 0;
		int cupSenha = 2002;
		int mySenha = sc.nextInt();
		
		while (mySenha != cupSenha) {
			System.out.println("Senha Invalida, Acesso Negado");
			mySenha = sc.nextInt();
			conte++;
			if (conte > 3) {
				cupSenha = mySenha;
			}
		}
		if (conte > 3) {
			System.out.println("Acesso cancelado");
		} else 	System.out.println("Acesso Permitido");
			
		sc.close();	
	}
	
}
