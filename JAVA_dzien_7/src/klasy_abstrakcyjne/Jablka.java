package klasy_abstrakcyjne;

public class Jablka extends Owoce {
	
	String odmiana = "nieznana";

	public Jablka() {
		super();
	}

	public void zmien(String odmiana){
		this.odmiana = odmiana;
	}

	@Override
	public void printInfo() {
		System.out.println(typ + " " + dojrzaly + " " + odmiana);		
	}
	
	@Override
	public void przyklad() {
		System.out.println("z interfejsu"); // implementacja z interfejsu PreOwoc przez klasê abstrakcyjn¹ Owoce. W klasie abstrakcyjnej Owoce nie trzeba by³o wstawiaæ metody wymuszanej przez interfejs bo jest to klasa abstrakcyjna!!!
	}
	
	public static void main(String[] args) {
		
		Jablka j1 = new Jablka();
		j1.printInfo();
		j1.zmien("Antonowka");
		j1.dojrzewanie();
		j1.printInfo();
		j1.przyklad();
	}





}
