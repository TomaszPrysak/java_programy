package cwiczenie_J72;

public class Roslina extends Organizm {

	int dlLodygi;
	
	public String przypiszDNA(String dna){
		super.przypiszDNA(dna);
		return DNA;
	}
	
	public void zmienLodyge(int dllodygi){
		this.dlLodygi = dllodygi;
	}
	
	@Override
	public void info() {
		System.out.println("Kod DNA: " + DNA + "\nD�ugo�� �odygi: " + dlLodygi);
	}

}
