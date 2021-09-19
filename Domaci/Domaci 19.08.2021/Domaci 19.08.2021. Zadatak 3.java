package Primeri;

import java.util.Scanner;

public class Domaci3 {
	/*
	 * Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik
	 * preko skenera. (Koristiti for petlju) Na primer N: 5
	 	*
	 	**
	 	***
	 	****
	 	*****
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite neki broj:");
		int broj = sc.nextInt();

		for (int i = 0; i <= broj; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
