package DomaciPutnici;

import java.util.ArrayList;

public class Autobus {
	private String naziv;
	private Vozac vozac;
	private int cenaKarte;
	private ArrayList<Putnik> listaPutnika;
	
	public Autobus(String naziv, int cenaKarte) {
		super();
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		this.listaPutnika = new ArrayList<Putnik>();
	}
	public Vozac getVozac() {
		return vozac;
	}
	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}
	public String getNaziv() {
		return naziv;
	}
	public int getCenaKarte() {
		return cenaKarte;
	}
	
	public void dodajPutnika (Putnik p) {
		if (p.getNovac() >= this.cenaKarte && vozac != null) {
			p.setNovac(p.getNovac()-this.cenaKarte);
			listaPutnika.add(p);
		}
	}
	
	public void ukloniPutnika (Putnik p) {
		if (listaPutnika.size() > 0 ) {
			listaPutnika.remove(p);
		}
	}
	
	@Override
	public String toString() {
		return "Autobus [naziv=" + naziv + ", vozac=" + vozac + ", cenaKarte=" + cenaKarte + ", listaPutnika="
				+ listaPutnika + "]";
	}
	
	
}
