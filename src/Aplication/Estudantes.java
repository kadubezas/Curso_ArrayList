package Aplication;

import java.util.Scanner;

import Entities.Aluguel;

public class Estudantes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Aluguel[] vect = new Aluguel[10];
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Rent #"+i);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Aluguel(name, email);		
			System.out.println("");
		}
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i+": "+vect[i]);;
			}
		}
		
		sc.close();

	}

}
