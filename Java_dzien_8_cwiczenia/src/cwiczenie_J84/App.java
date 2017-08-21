package cwiczenie_J84;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		
		Scanner odczyt_z_klawiatury = new Scanner(System.in);
		
		Company c1 = new Company();
		
		File plik = new File("firma.txt");
		
		
		
		Scanner odczyt = new Scanner(plik);
		
		String klawiatura = "";
		
		String historia_pliku = "";
		
		int i = 0;
		
		while(true){
			System.out.println("(1) - zapis, (2) - oczyt, (3) - koniec");
			klawiatura = odczyt_z_klawiatury.nextLine();
			
			if(klawiatura.equals("1")){ // zapis do pliku
				
				// Dopisanie do pliku z zostawieniem zawarto�ci -> (true)
				FileWriter zapis_do_pliku = new FileWriter(plik, true);
				
				while(i < c1.getPracownicy().length){
					
					Employee e1 = new Employee();
					
					System.out.println("Podaj imi� pracownika:");
					klawiatura = odczyt_z_klawiatury.nextLine();
					e1.setImie(klawiatura);
					zapis_do_pliku.write(klawiatura + ", ");
					
					System.out.println("Podaj nazwisko pracownika:");
					klawiatura = odczyt_z_klawiatury.nextLine();
					e1.setNazwisko(klawiatura);
					zapis_do_pliku.write(klawiatura + ", ");
					
					System.out.println("Podaj pensj� pracownika:");
					klawiatura = odczyt_z_klawiatury.nextLine();
					e1.setPensja(klawiatura);
					zapis_do_pliku.write(klawiatura);
					
					i++;
				}
				
				zapis_do_pliku.close();
				
			}else if(klawiatura.equals("2")){ // odczyt z pliku
				
				Scanner odczyt_z_pliku = new Scanner(plik);
				
				System.out.println(historia_pliku);
				
				while(odczyt_z_pliku.hasNextLine()){
					
					String wiersz_pliku = odczyt_z_pliku.nextLine();
					System.out.println(wiersz_pliku);
					
				}
				
				odczyt_z_pliku.close();
				
			}else if(klawiatura.equals("3")){ // wyjscie z p�tli
				
				break;
				
			}
			
		}
		
		odczyt_z_klawiatury.close();
		
		odczyt.close();
		
	}

}
