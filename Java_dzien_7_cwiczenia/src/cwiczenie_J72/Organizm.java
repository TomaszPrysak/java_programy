package cwiczenie_J72;

public abstract class Organizm {
	
	String DNA;
	
	public String przypiszDNA(String dna){
		this.DNA = dna;
		return DNA;
	}
	
	public abstract void info();
	
}
