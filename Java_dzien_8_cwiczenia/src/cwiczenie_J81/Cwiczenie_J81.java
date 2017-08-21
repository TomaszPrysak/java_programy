package cwiczenie_J81;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cwiczenie_J81 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File plik = new File("Cwiczenie_J81.txt");
		
		// File plik = new File("C:\\Users\\Tomek\\Desktop\\Cwiczenie_J81.txt");
		
		Scanner odczyt_z_pliku = new Scanner(plik);
		
		while(odczyt_z_pliku.hasNextLine()){
			
			String wiersz_pliku = odczyt_z_pliku.nextLine();
			String LC = wiersz_pliku.toLowerCase();
			int licznikA = 0;
			int licznikO = 0;
			
			for(int i = 0; i < LC.length(); i++){
				if(LC.charAt(i) == 'a'){
					licznikA++;
				}
				if(LC.charAt(i) == 'o'){
					licznikO++;
				}
			}
			
			if ((licznikA >= 3 && licznikO >= 2) || LC.contains("allow")){
				System.out.println(wiersz_pliku);
			}
			
		}

		odczyt_z_pliku.close();
		
	}

}
