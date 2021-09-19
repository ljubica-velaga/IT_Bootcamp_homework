package Domaci;
/*
 * Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina rodjenja, pol.
 * Private atributi su: da li su ozenjeni ili udati (boolean), prosecna zarada po filmu, broj snimljenih filmova.
 * Potrebno je izracunati i odstampati sve atribute, koliko su ukupno zaradili u svim filmovima,
 * koliko godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena da se
 * doda "Mr." ili "Mrs." ako su zenskog pola. Nakon toga napraviti Array listu gde ce se ubaciti
 * poslednjih 5 snimljenih filmova (pored naslova napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog
 * do najgore ocenjenog filma od tih pet (preko getera i setera).
 */

public class Glumci {
	public String imeIPrezime;
	public int godRodjenja;
	public char pol;
	private boolean ozenjen;
	private double prosecnaZarada;
	private int brojFilmova;

	public Glumci(String imeIPrezime, int godRodjenja, char pol) {
		this.imeIPrezime = imeIPrezime;
		this.godRodjenja = godRodjenja;
		this.pol = pol;
	}

	public void setOzenjen(boolean ozenjen) {
		this.ozenjen = ozenjen;
	}

	public boolean getOzenjen() {
		return ozenjen;
	}

	public void setProsecnaZarada(double zarada) {
		this.prosecnaZarada = zarada;
	}

	public double getProsecnaZarada() {
		return prosecnaZarada;
	}

	public void setBrojFilmova(int brojFilmova) {
		this.brojFilmova = brojFilmova;
	}

	public int getBrojFilmova() {
		return brojFilmova;
	}

	public double ukupnaZarada() {
		double ukupnaZarada = prosecnaZarada * brojFilmova;
		return ukupnaZarada;
	}

	public int godine() {
		int godine = 2022 - godRodjenja;
		return godine;
	}

	public String imeSaPrefiksom() {
		if (pol == 'm') {
			imeIPrezime = "Mr. " + imeIPrezime;
		} else if (pol == 'z') {
			imeIPrezime = "Mrs. " + imeIPrezime;
		}
		return imeIPrezime;
	}

	public void print() {
		System.out.println("Ime i prezime je: " + imeSaPrefiksom() + ", godina rojenja je: " + godRodjenja
				+ ", pol je: " + pol + "\nBracni status: " + ozenjen + ", prosecna zarada po filmu je: "
				+ prosecnaZarada + ", do sada je snimio " + brojFilmova + " filmova." + "\nUkupna zarada do sada je: "
				+ ukupnaZarada() + "." + "\nU 2022. godini napunice: " + godine() + " godina.");
	}

}