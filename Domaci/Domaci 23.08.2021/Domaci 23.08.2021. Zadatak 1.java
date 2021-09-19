package primeri;

import java.util.Scanner;

public class Domaci1 {
	/*
	 * Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza (znaci da korisnik unosi tri broja) 
	 * i taj program treba da pozove i ispise (u mainu) najmanji od ta tri unesena broja.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int najmanji = 0;
		int trenutniMin = 999999999;

		for (int i = 0; i < 3; i++) {
			System.out.println("Unesite neki ceo broj");
			int br = s.nextInt();
			najmanji = min(br, trenutniMin);
			trenutniMin = najmanji;
		}
		System.out.println("Najmanji broj je: " + najmanji);
		s.close();
	}

	public static int min(int x1, int x2) {
		int min = 0;
		if (x1 < x2) {
			min = x1;
		} else {
			min = x2;
		}
		return min;
	}
}
