package automobil;

/*
 * 1. Napraviti klasu automobil i dve main klase gde ce se u jednoj stampati podaci preko praznog konstruktora,
 *    a u drugom preko punog konstruktora. Atributi su marka, model, pogon, broj vrata i godiste.
 * 2. Dodati private atribut "predjeniKm", napraviti geter i seter i odstampati posebno ili zajedno sa prethodnom stampom.
 *    Raditi u klasi gde je pun konstruktor.
 * 3. Dodati atribute "potrosnjaGoriva" (int) i "kubikaza" (int). Ako kubikaza prelazi 1000 cm^3 onda stampati
 *    potrosnju da je 10 litara, ako je kubikaza ispod 1000 onda stampati da je potrosnja 8 litara.
 * 4. Domaci - Izracunati koliko je ukupno novca potrosno na gorivo ako je cena jednog litra 120 dinara.
 */
public class Automobil {
	public String marka;
	public String model;
	public String pogon;
	public int brojVrata;
	public int godiste;
	private int predjeniKm;
	private int potrosnjaGoriva;
	private int kubikaza;

	public Automobil(String marka, String model, String pogon, int brojVrata, int godiste, int predjeniKm,
			int kubikaza) {
		this.marka = marka;
		this.model = model;
		this.pogon = pogon;
		this.brojVrata = brojVrata;
		this.godiste = godiste;
		this.predjeniKm = predjeniKm;
		this.kubikaza = kubikaza;
		if (this.kubikaza >= 1000) {
			this.potrosnjaGoriva = 10;
		} else {
			this.potrosnjaGoriva = 8;
		}
	}

	public int getPotrosnjaGoriva() {
		return potrosnjaGoriva;
	}

	public void setPotrosnjaGoriva(int potrosnjaGoriva) {
		this.potrosnjaGoriva = potrosnjaGoriva;
	}

	public Automobil() {

	}

	public void setPredjeniKm(int km) {
		this.predjeniKm = km;
	}

	public int getPredjeniKm() {
		return this.predjeniKm;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}

	public int getKubikaza() {
		return this.kubikaza;
	}

	public void stampa() {
		System.out.println("Marka automobila je: " + marka + ", model je: " + model + ", pogon je: " + pogon
				+ ", broj vrata je: " + brojVrata + ", godiste je: " + godiste + " i presao je " + predjeniKm
				+ " km. \n" + "Kubikaza je: " + kubikaza + " i potrosnja je: " + this.potrosnjaGoriva);
		System.out.println("Ukupno potroseno novca je: " + ukupniNovac() + " dinara.");
	}

	public int ukupniNovac() {
		int novac = this.potrosnjaGoriva * this.predjeniKm * 120 / 100;
		return novac;
	}
}
