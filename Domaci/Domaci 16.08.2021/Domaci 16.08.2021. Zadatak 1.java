package primeri;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		/*
		 * While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen
		 * negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako
		 * korisnik unese 1 2 5 3 -1, program treba da ispise 11
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite neki broj: ");
		int br = sc.nextInt();
		int zbir = br;

		while (br >= 0) {
			System.out.println("Unesite sledeci broj: ");
			br = sc.nextInt();
			if (br >= 0) {
				zbir = zbir + br;
				System.out.println("Zbir do sada unetih brojeva je: " + zbir);
			}
		}
		System.out.println("Zbir do sada unetih brojeva je: " + zbir);
		System.out.println("Uneli ste negativan broj. Kraj programa.");

		sc.close();
	}
}
