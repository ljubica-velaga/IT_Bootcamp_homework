package primeri;

import java.util.Scanner;

public class Domaci2 {

	public static void main(String[] args) {
		/*
		 * While2: Napisati program koji ce na standardnom izlazu ispisati poruku “Laku
		 * noc!” onoliko puta koliko je korisnik zadao preko konzole. Primer: ako
		 * korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko puta zelite da Vam napisemo laku noc: ");
		int br = sc.nextInt();
		int i = 0;

		if (br > 0) {
			while (i < br) {
				System.out.println("Laku noc!");
				i++;
			}
		} else {
			System.out.println("Uneli ste negativan broj. Pokusajte ponovo.");
		}
		sc.close();
	}
}
