package ZooloskiVrt;

public class GlavnaKlasa {

	public static void main(String[] args) {
		Ribe pastrmka = new Ribe("kicmenjaci", "pastrmka", "sitnije ribe", "reka", 6, "ledjna i bocna");
		Sisari veverica = new Sisari("kicmenjaci", "vevrica", "orasasti plodovi", "braon", "biljojed", true);
		Sisari zec = new Sisari("kicmenjaci", "zec", "sargarepa", "siva", "biljojed", true);
		Sisari vuk = new Sisari("kicmenjaci", "vuk", "manje zivotinje", "crna", "mesojed", true);
		
		System.out.println(pastrmka.getNaziv() + " pripada vrsti: " + pastrmka.getVrsta());
		System.out.println(zec.getNaziv() + " pripada vrsti: " + zec.getVrsta());
		
		Staniste suma = new Staniste();
		suma.dodavanjeZivotinja(veverica);
		suma.dodavanjeZivotinja(vuk);
		suma.dodavanjeZivotinja(zec);
		suma.stampa();
	}

}
