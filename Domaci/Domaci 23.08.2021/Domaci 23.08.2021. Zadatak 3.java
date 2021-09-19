package primeri;

import java.util.Scanner;

public class Domaci3 {
	/*
	 * Funkcije3: -> spojena prva dva zadatka sa malo izmenjenim zahtevima ->
	 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva
	 * i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, a druga vraca
	 * najveci od unetih brojeva
	 * 
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int trenutniMax = 0;
		int najveci = 0;
		int trenutniZbir = 0;
		int ukupniZbir = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("Unesite neki ceo broj: ");
			int br = s.nextInt();
			najveci = max(br, trenutniMax);
			trenutniMax = najveci;

			ukupniZbir = zbir(br, trenutniZbir);
			trenutniZbir = ukupniZbir;

		}
		System.out.println("Najveci od unetih brojeva je: " + najveci + " a zbir unetih brojeva je: " + ukupniZbir);
		s.close();
	}

	public static int max(int x1, int x2) {
		int max = 0;
		if (x1 > x2) {
			max = x1;
		} else {
			max = x2;
		}
		return max;
	}

	public static int zbir(int x1, int x2) {
		int zbir = x1 + x2;
		return zbir;
	}

}
