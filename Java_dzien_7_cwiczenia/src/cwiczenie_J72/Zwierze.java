package cwiczenie_J72;

public class Zwierze extends Organizm {

	int liczbaNog;
	
	public String przypiszDNA(String dna){
		super.przypiszDNA(dna);
		return DNA;
	}
	
	public void zmienNogi(int liczbaNog){
		this.liczbaNog = liczbaNog;
	}
	
	@Override
	public void info() {
		System.out.println("Kod DNA: " + DNA + "\nLiczba n�g: " + liczbaNog);
	}
	
	public void eat(Organizm o){
		System.out.println("Zwierzak zjada ro�lin�");
	}

}
