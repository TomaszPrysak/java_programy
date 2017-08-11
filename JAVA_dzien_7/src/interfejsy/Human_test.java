package interfejsy;

public class Human_test implements Human, Animal {

	String imie, nazwisko;
	
	public Human_test(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	@Override
	public void printInfo() {
		System.out.println(rodzaj + " " + gatunek + " " + imie + " " + nazwisko);
	}
	
	@Override
	public void info() {
		System.out.println(rodzina);	
	}
	
	public static void main(String[] args) {
		
		Human_test marian = new Human_test("Marian", "Pazdzioch");
		
		marian.info();
		marian.printInfo();

	}





}
