package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class programRent {

	public static void main(String[] args) {
		//  
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		Rent[] vect = new Rent[10];
		for (int i=1; i<=rooms; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i + ":"); 
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("E-Mail: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			vect[roomNumber] = new Rent(name, email, roomNumber);
		}
		System.out.println("Busy rooms: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		} 
		
		sc.close();
	}
	

}
