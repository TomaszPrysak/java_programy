package cwiczenie_67;

public class Part {
	
	static int licznik;
	final int NR;
	String producent, model, seria;
	
	public Part(String producent, String model, String seria) {
		super();
		this.NR = ++licznik;
		this.producent = producent;
		this.model = model;
		this.seria = seria;
	}
	
}
