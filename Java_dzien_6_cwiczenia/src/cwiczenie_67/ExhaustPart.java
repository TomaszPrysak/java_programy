package cwiczenie_67;

public class ExhaustPart extends Part {
	
	boolean standardEmisji;

	public ExhaustPart(String producent, String model, String seria, boolean standardEmisji) {
		super(producent, model, seria); // super oznacza, �e dziedziczymy pola z klasy nadrz�dnej Part i podajemy w nim jakie pola z klasy nadrz�dnej Part dziedziczymy
		this.standardEmisji = standardEmisji;
	}
	
	
}
