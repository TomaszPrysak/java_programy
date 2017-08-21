package cwiczenie_J82;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Book> ksiazki = new ArrayList<>();
		
		File plik = new File("ksiazki.txt");
		
		Scanner odczyt_z_pliku = new Scanner(plik);
		
		odczyt_z_pliku.useDelimiter(",|\r?\n");
		
		while(odczyt_z_pliku.hasNextLine()){
			
			String odczytNazwa = odczyt_z_pliku.next();
			String odczytAutor = odczyt_z_pliku.next();
			String odczytRok = odczyt_z_pliku.next();
			
			Book nextBook = new Book(odczytNazwa, odczytAutor, odczytRok);
			
			ksiazki.add(nextBook);
			
		}
		
		System.out.println("Moje ksi��ki: ");
		System.out.println();
		
		for(Book b : ksiazki){
			System.out.println("Nazwa: " + b.getNazwa() + "\nAutor: " + b.getAutor() + "\nRok wydania: " + b.getRok());
			System.out.println();
		}
		
		odczyt_z_pliku.close();

	}

}
