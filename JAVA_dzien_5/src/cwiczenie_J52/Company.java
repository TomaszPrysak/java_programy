package cwiczenie_J52;

import java.util.ArrayList;

public class Company {
	
	// Pola klasy
	ArrayList<String> lista = new ArrayList<String>();
	
	// Konstruktor
	Company(ArrayList<String> lista){
		this.lista = lista;
	}
	
	//Metoda
	public void szefInfo(){
		for (String v: lista){
			System.out.println(v);
		}
	}
	
	// Metoda g³ówna
	public static void main(String[] args) {
		
		ArrayList<String> pracownicy = new ArrayList<String>();
		
		Employee ferdek = new Employee("Ferdynand", "Kiepski", "1965", 0);
		//System.out.println(ferdek.info());
		pracownicy.add(ferdek.info());
		Employee pazdzioch = new Employee("Marian", "Pazdzioch", "1920", 0);
		//System.out.println(pazdzioch.info());
		pracownicy.add(pazdzioch.info());
		Employee boczek = new Employee("Arnold", "Boczek", "1970", 0);
		//System.out.println(boczek.info());
		pracownicy.add(boczek.info());
		Employee helenka = new Employee("Helena", "Kiepska", "1975", 5400);
		//System.out.println(boczek.info());
		pracownicy.add(helenka.info());
		
		Company szef = new Company (pracownicy);
		
		szef.szefInfo();
		
	}

}
