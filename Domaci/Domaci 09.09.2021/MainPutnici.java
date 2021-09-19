package DomaciPutnici;

public class MainPutnici {

	public static void main(String[] args) {
		Putnik p1 = new Putnik("Pera", "Peric", 100);
		Putnik p2 = new Putnik("Mica", "Matic", 20);
		
//		p1.oduzmiNovac(200);
//		System.out.println(p1);
	
		Vozac v1 = new Vozac("Marko", "Markovic", "Sofer");
		
		Autobus lasta = new Autobus("Beograd-Barajevo", 70);
		lasta.setVozac(v1);
		
		lasta.dodajPutnika(p1);
		lasta.dodajPutnika(p2);
		
		System.out.println(lasta);
		
	}

}
