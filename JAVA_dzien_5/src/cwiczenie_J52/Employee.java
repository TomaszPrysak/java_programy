package cwiczenie_J52;

public class Employee {
	
	// Pola klasy
	String imie, nazwisko, rok_urodzenia;
	int staz_pracy;
	
	// Konstruktor
	Employee(String imie, String nazwisko, String rok_urodzenia, int staz_pracy){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rok_urodzenia = rok_urodzenia;
		this.staz_pracy = staz_pracy;
	}
	
	// Metoda
	public String info(){
		return "Pracownik " + imie + " " + nazwisko + " (rok urodzenia: " + rok_urodzenia + ", sta¿: " + staz_pracy + ")";
	}

}
