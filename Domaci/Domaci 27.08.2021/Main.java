package Domaci;

//Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina rodjenja, pol.
//Private atributi su: da li su ozenjeni ili udati (boolean), prosecna zarada po filmu, broj snimljenih filmova.
//Potrebno je izracunati i odstampati sve atribute, koliko su ukupno zaradili u svim filmovima,
//koliko godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena da se doda "Mr." ili "Mrs."
//ako su zenskog pola. Nakon toga napraviti Array listu gde ce se ubaciti poslednjih 5 snimljenih filmova
//(pored naslova napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore ocenjenog filma od tih pet
//(preko getera i setera).


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Glumci bradPitt = new Glumci("Brad Pitt", 1963, 'm');
		bradPitt.setBrojFilmova(5);
		bradPitt.setOzenjen(false);
		bradPitt.setProsecnaZarada(1000);
		bradPitt.print();
	
		Glumci nicoleKidman = new Glumci("Nicole Kidman", 1967, 'z');
		nicoleKidman.setBrojFilmova(7);
		nicoleKidman.setOzenjen(true);
		nicoleKidman.setProsecnaZarada(3000);
		nicoleKidman.print();
	
		HashMap<String, Double> filmovi = new HashMap<> ();
		filmovi.put("The Prom", 5.9);
		filmovi.put("Bombshell", 6.8);
		filmovi.put("The Goldfinch", 6.3);
		filmovi.put("Aquaman", 6.9);
		filmovi.put("Boy Erased", 6.9);
		
		ArrayList <Entry<String, Double>> listaFilmova = new ArrayList<>(filmovi.entrySet());
		listaFilmova.sort(Entry.comparingByValue());
		Collections.reverse(listaFilmova);
		System.out.println(listaFilmova);		
			}
			}

