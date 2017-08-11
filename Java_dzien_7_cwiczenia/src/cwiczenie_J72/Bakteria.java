package cwiczenie_J72;

public class Bakteria extends Organizm {

	String szkodliwosc;
	
	public String przypiszDNA(String dna){
		super.przypiszDNA(dna);
		return DNA;
	}
	
	public void zmienSzkodliwosc(String szkodliwosc){
		this.szkodliwosc = szkodliwosc;
	}
	
	@Override
	public void info() {
		System.out.println("Kod DNA: " + DNA + "\nSzkodliwosc: " + szkodliwosc);
	}

}
