package primeri;

import java.util.Scanner;

public class Domaci {
	/*
	 * Napisati program koji oponasa kviz za pogadjanje glavnog grada. Program treba
	 * da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz iz programa. 1.
	 * Francuska 2. Italija 3. Srbija 4. Izlaz- Nakon odabira drzave, potrebno je
	 * postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?' - Ako korisnik
	 * odgovori tacno, ispisuje se poruka 'Odgovor je tacan' - Ako korisnik odgovori
	 * netacno, ispisuje se poruka 'Odgovor nije tacan' - Nakon davanja odgovora
	 * (bilo da je tacan ili netacan), ponovo treba da se postave sve pocetne opcije
	 * i ponudi korisniku da odabere neku od njih. - Program se zavrsava kad korisni
	 * odabere 4. opciju 'Izlaz' - Program uraditi koriscenjem dosad naucenog +
	 * do-while petlje
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String drzava;
		String grad;

		do {
			System.out.println(
					"Odaberite drzavu za koju zelite da pogadjate glavni grad, ili izlaz ukoliko zelite da napustite program: ");
			System.out.println("1. Francuska\r\n" + "2. Italija\r\n" + "3. Srbija\r\n" + "4. Izlaz");
			drzava = sc.nextLine();
			drzava = drzava.toLowerCase();

			if (drzava.equals("francuska")) {

				System.out.println("Koji je glavni grad Francuske: ");
				grad = sc.nextLine();
				grad = grad.toLowerCase();
				if (grad.equals("pariz")) {
					System.out.println("Tacan odgovor!");
				} else {
					System.out.println("Pogresan odgovor, pokusajte ponovo.");
				}

			} else if (drzava.equals("italija")) {

				System.out.println("Koji je glavni grad Italije: ");
				grad = sc.nextLine();
				grad = grad.toLowerCase();
				if (grad.equals("rim")) {
					System.out.println("Tacan odgovor!");
				} else {
					System.out.println("Pogresan odgovor, pokusajte ponovo.");
				}

			} else if (drzava.equals("srbija")) {

				System.out.println("Koji je glavni grad Srbije: ");
				grad = sc.nextLine();
				grad = grad.toLowerCase();
				if (grad.equals("beograd")) {
					System.out.println("Tacan odgovor!");
				} else {
					System.out.println("Pogresan odgovor, pokusajte ponovo.");
				}

			} else if (drzava.equals("izlaz")) {
				System.out.println("Kraj programa.");
			} else {
				System.out.println("Pogresan unos, pokusajte ponovo.");
			}
		} while (!drzava.equals("izlaz"));

		sc.close();
	}

}
