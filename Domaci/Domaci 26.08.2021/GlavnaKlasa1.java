package automobil;

public class GlavnaKlasa1 {
	public static void main(String[] args) {
		Automobil auto1 = new Automobil();
		auto1.marka = "Volkswagen";
		auto1.model = "Golf";
		auto1.pogon = "Ne znam";
		auto1.brojVrata = 5;
		auto1.godiste = 2008;
		
		auto1.stampa();
	}
}
