package java_dzien_pierwszy;

public class PierwszyProgram {
	
	public float pole1;
	
	public static void main(String[] args){
	
		System.out.println("Siemano na kursie"); // println - wy�wietla z dodaniem nowej lini i ka�de nast�pne dzia�anie b�dzi� od nowej linii
		
		System.out.print("Siemano na kursie \n"); // dodanie w stringu "\n" powoduje r�wnie� dodanie nowej lini i ka�de nast�pne dzia�anei b�dzie od nowej linii
		
		System.out.print("pisane z nowej lini"); 
		
		System.out.print(System.getProperty("java.runtime.version")); // pisane jest razem z wierszem powy�ej, poniewa� ten wiersz powy�ej nie jest poleceniem z przej�ciem do nowej linii
		
	}

}
