package cwiczenie_67;

public class Tyre extends Part {
	
	int rozmiar;
	int szerokosc;
	int wysokosc;
	
	public Tyre(String producent, String model, String seria, int rozmiar, int szerokosc, int wysokosc) {
		super(producent, model, seria); // super oznacza, �e dziedziczymy pola z klasy nadrz�dnej Part i podajemy w nim jakie pola z klasy nadrz�dnej Part dziedziczymy
		this.rozmiar = rozmiar;
		this.szerokosc = szerokosc;
		this.wysokosc = wysokosc;
	}
	
}
