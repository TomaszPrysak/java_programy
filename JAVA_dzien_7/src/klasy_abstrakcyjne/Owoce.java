package klasy_abstrakcyjne;

public abstract class Owoce implements PreOwoc {
	
	// sta�a
	public static final String typ = "Owoc";
	// zmienna
	public boolean dojrzaly;
	// metoda abstrakcyjna
	public abstract void printInfo();
	// metoda
	public void dojrzewanie(){
		this.dojrzaly = true;
	}
	
	
}
