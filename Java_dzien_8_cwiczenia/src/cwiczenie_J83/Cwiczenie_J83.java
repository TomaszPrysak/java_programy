package cwiczenie_J83;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cwiczenie_J83 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File plik = new File("user.txt");
		PrintWriter zapis = new PrintWriter(plik);
		
		Scanner odczyt_z_klawiatury = new Scanner(System.in); // odczyt z klawiatury
		
		String wiersz = "";
		
		System.out.println("Wpisz kolejne linie do pliku: ");
		
		// zapisywanie do pliku
		
		while(!wiersz.equals("koniec")){
			wiersz = odczyt_z_klawiatury.nextLine();
			if(!wiersz.equals("koniec")){
				zapis.println(wiersz);
			}
		}
		
		zapis.close();
		
		// odczytywanie z pliku
		
		Scanner odczyt_z_pliku = new Scanner(plik); // odczyt z pliku
		
		while(odczyt_z_pliku.hasNextLine()){
			String wiersz_pliku = odczyt_z_pliku.nextLine();
			System.out.println(wiersz_pliku);
		}
		
		odczyt_z_pliku.close();
		odczyt_z_klawiatury.close();
		
	}

}
