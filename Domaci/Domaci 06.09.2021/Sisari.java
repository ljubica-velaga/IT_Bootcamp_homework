package ZooloskiVrt;

public class Sisari extends Zivotinje {
	private String bojaDlake;
	private String nacinIshrane;
	private boolean divlji;
	
	public Sisari(String vrsta, String naziv, String hrana, String bojaDlake, String nacinIshrane, boolean divlji) {
		super(vrsta, naziv, hrana);
		this.bojaDlake = bojaDlake;
		this.nacinIshrane = nacinIshrane;
		this.divlji = divlji;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public String getNacinIshrane() {
		return nacinIshrane;
	}

	public void setNacinIshrane(String nacinIshrane) {
		this.nacinIshrane = nacinIshrane;
	}

	public boolean isDivlji() {
		return divlji;
	}

	public void setDivlji(boolean divlji) {
		this.divlji = divlji;
	}
	public void stampa () {
		System.out.println("Sisar " + super.getNaziv() + " pripada vrsti: " + super.getVrsta() + " i hrana ovog sisara su: " + super.getHrana() + "." +
				"\nBoja dlake ovog sisara je " + this.bojaDlake + " i po tipu ishrane je " + this.nacinIshrane + ".");
		if (divlji) {
			System.out.println("Ovaj sisar je divlja zivotinja.");
		} else {
			System.out.println("Ovaj sisar je domaca zivotinja.");
		}
	}

	
}
