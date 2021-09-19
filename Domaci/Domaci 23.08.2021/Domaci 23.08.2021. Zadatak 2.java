package primeri;

import java.util.Scanner;

public class Domaci2 {
	/*
	 * Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog
	 * ulaza i taj program treba da pozove i vrati (u mainu) proizvod unetih
	 * brojeva.
	 * 
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int trenutniProizvod = 1;
		int rezultat = 1;

		for (int i = 0; i < 3; i++) {
			System.out.println("Unesite neki ceo broj");
			int br = s.nextInt();
			rezultat = proizvod(br, trenutniProizvod);
			trenutniProizvod = rezultat;
		}
		System.out.println(rezultat);
		s.close();
	}

	public static int proizvod(int x1, int x2) {
		int proizvod = x1 * x2;
		return proizvod;
	}

}
