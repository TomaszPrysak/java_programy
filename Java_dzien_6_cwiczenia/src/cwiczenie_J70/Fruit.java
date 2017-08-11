package cwiczenie_J70;

public class Fruit {
	
	String kategoria;

	public Fruit() {
		super();
		this.kategoria = "Owoc";
	}
	
	public void printInfo(){
		System.out.println("Kategoria: " + this.kategoria);
	}

}
