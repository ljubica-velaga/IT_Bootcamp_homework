package automobil;

public class GlavnaKlasa2 {
	
	public static void main(String[] args) {
		
	Automobil auto2 = new Automobil ("Volkswagen", "Passat", null, 5, 2017, 10000, 800);
	auto2.setPredjeniKm(20000);
	System.out.println(auto2.getPredjeniKm());
	auto2.setKubikaza(1200);
	System.out.println(auto2.getKubikaza());
	System.out.println(auto2.getPotrosnjaGoriva());
	auto2.stampa();
	
	
	}
}
