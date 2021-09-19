package ZooloskiVrt;

import java.util.ArrayList;

public class Staniste {
	private String naziv;
	public ArrayList<Zivotinje> zivotinjeUStanistu;

	public Staniste(String naziv) {
		super();
		this.naziv = naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public Staniste() {
		zivotinjeUStanistu = new ArrayList<Zivotinje>();
	}

	public void dodavanjeZivotinja(Zivotinje a) {
		this.zivotinjeUStanistu.add(a);
	}
	
	public void stampa () {
	    	System.out.println("U stanistu " + getNaziv() + " zive sledece zivotinje: ");
			for (int i = 0; i < zivotinjeUStanistu.size(); i++) {
	    		System.out.println(zivotinjeUStanistu.get(i).getNaziv());
	    	}
	}
}
