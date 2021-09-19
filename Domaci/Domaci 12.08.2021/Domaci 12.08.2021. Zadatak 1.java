package primeri;

import java.util.Scanner;

public class Domaci12 {
/*	Napisati program gde deklarisete vase ime, prezime kao string, pol kao char i odstampajte adekvatno sva tri unosa.
	Nakon toga preko skenera treba da unesete ukupan broj medalja koliko je Srbija osvojila na olimpijskim igrama
	i ukupan broj zlatnih medalja koliko je Srbija osvojila na olimpijskim igrama,
	na kraju treba odstampati procenat zlatnih medalja u odnosu na ukupan broj medalja.
*/

	public static void main(String[] args) {
		String ime = "Ljubica";
		String prezime = "Velaga";
		char pol = 'Z';
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("Pol: " + pol);
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite ukupan broj medalja koje je Srbija osvojila na poslednjim OI: ");
		int brMed = sc.nextInt();
		
		System.out.println("Unesite broj zlatnih medalja na poslednjim OI: ");
		int brZlMed = sc.nextInt();
		double procenat = (brZlMed * 1.0 / brMed) * 100;
		System.out.println("Procenat zlatnih medalja je: " + procenat + "%.");
				
		sc.close();
	}

}
