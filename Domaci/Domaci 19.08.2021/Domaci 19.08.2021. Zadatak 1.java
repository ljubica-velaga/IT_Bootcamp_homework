package Primeri;

import java.util.Scanner;

/*
 *  Napisati program gde korisnik unosi pozitivne brojeve, kad unese negativan broj prikaze mu se suma svih prethodno
 *  unetih brojeva i na kraju zakomentarisati koje ste brojeve sve unosili po testu, na primer:
 *		test 1 x, y, z
 *		test 2 x, y, z
 *		test 3 x, y, z
 *	(Koristiti do while petlju)
 */
public class Domaci1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int zbir = 0;
		int broj = 0;

		do {
			zbir += broj;
			System.out.println("Unesite neki broj:");
			broj = sc.nextInt();
			System.out.println("Zbir je:" + zbir);
		} while (broj >= 0);
		sc.close();
	}
}
