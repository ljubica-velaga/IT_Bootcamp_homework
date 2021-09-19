package DomaciPutnici;

public class Putnik extends Covek {
	private int novac;

	public Putnik(String ime, String prezime, int novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public int getNovac() {
		return novac;
	}

	public void setNovac(int novac) {
		this.novac = novac;
	}

	public boolean dodajNovac(int a) {
		this.novac = this.novac + a;
		return true;
	}

	public boolean oduzmiNovac(int a) {
		if (this.novac >= a) {
			this.novac = this.novac - a;
			System.out.println("Uspesno oduzet novac");
			return true;
		} else {
			System.out.println("Nemoguce oduzeti novac");
			return false;
		}
	}

	@Override
	public String toString() {
		return "Putnik [novac=" + novac + "]";
	}

}
