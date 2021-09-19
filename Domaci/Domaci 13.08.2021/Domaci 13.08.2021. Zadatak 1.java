package primeri;

import java.util.Scanner;

public class Domaci13a {
/* Napisati program gde preko skenera unesete broj, ako je broj manji od 10 onda ga pomnoziti sa 100,
 * ako je broj veci od 100 onda ga podeliti sa 10. Na kraju zakomentarisite koje brojeve ste koristili za proveru programa.
*/		
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite neki ceo broj: ");
		int br = sc.nextInt();
		double kolicnik = br / 10.0;
		
		if (br < 10) {
			br = br * 100;
			System.out.println("Broj je manji od 10 i pomnozen sa 100. Rezultat je: " + br);
		} else if (br > 100) {
			System.out.println("Broj je veci od 100 i podeljen sa 10. Rezultat je: " + kolicnik);
		} else {
			System.out.println("Broj je izmedju 10 i 100.");
		}
		sc.close();
	}
}
// Za proveru sam koristila brojeve: 9, 10, 11, 99, 100, 101.