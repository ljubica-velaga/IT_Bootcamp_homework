package primeri;

public class Domaci {
	/*
	 * 1. Napisati program gde u nizu napisete 5 gradova, a program vam odstampa sve osim prvog i poslednjeg unosa.
	 * 2. Napisati program gde u nizu napisete ovih 5 gradova (Lisabon, London, Helsinki, Prag i Madrid), a program 
	 * stampa gradove sve dok ne dodje do "Prag"-a.
	 * Dva zadatka koje mozete pisati u istoj klasi ako zelite, kratki su zadaci, ali bitno je samo da se napise preko niza.
	 * 
	 */
	public static void main(String[] args) {
		String[] gradovi = { "Lisabon", "London", "Helsinki", "Prag", "Madrid" };

		// for (int i = 0; i < gradovi.length; i++) {
		// if (i != 0 && i != gradovi.length) {
		// System.out.println(gradovi[i]);
		// }
		// }
		//

		for (String e : gradovi) {
			if (e.equals("Prag")) {
				break;
			}
			System.out.println(e);
		}

	}

}
