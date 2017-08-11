package cwiczenie_67;

public class Wheel extends Part {

	int cale;

	public Wheel(String producent, String model, String seria, int cale) {
		super(producent, model, seria); // super oznacza, ¿e dziedziczymy pola z klasy nadrzêdnej Part i podajemy w nim jakie pola z klasy nadrzêdnej Part dziedziczymy
		this.cale = cale;
	}
	
	
}
