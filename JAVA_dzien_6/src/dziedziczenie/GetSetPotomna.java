package dziedziczenie;

public class GetSetPotomna extends GetSetBazowa {
	
	int rok = 1900; // zmienna bêdzie domyœlnie 1900 ale pod warunkiem, ¿e obiekt tworzymy z konstruktorem domyœlnym
	int miesiac;
	
	public GetSetPotomna(){}
	
	public GetSetPotomna(String imie, int pesel, int rok) { // kostruktory przeci¹zone
		super(imie, pesel);
		this.rok = rok;
		this.miesiac = 8;
	}
	
	public GetSetPotomna(int pesel, int rok) { // konstruktory przeciazone
		super(pesel);
		this.imie = "Anonim";
		this.rok = rok;	
	}

	public static void main(String[] args) {
		
		GetSetPotomna gs1 = new GetSetPotomna("Tomasz", 958726242, 2000);
		
		System.out.println(gs1.getImie());
		
		System.out.println(gs1.getPesel());
		
		// gs1.imie = "Ala"; zmienna niewidoczna ze wzglêdnu na private w Bazowej
		
		gs1.setImie("Ala");
		
		gs1.setPesel(846921336);
		
		System.out.println(gs1.getImie());
		
		System.out.println(gs1.getPesel());
		
		gs1.rok = 1987;
		
		System.out.println(gs1.getImie() + " " + gs1.getPesel() + " " + gs1.rok);
		
		// gs1.infoBaza(); metoda niewidoczna ze wzglêdu na private w Bazowej
		

	}

}
