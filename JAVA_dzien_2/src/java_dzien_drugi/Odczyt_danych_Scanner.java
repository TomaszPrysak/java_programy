package java_dzien_drugi;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Odczyt_danych_Scanner {

	public static void main(String[] args) {

		// Wprowadzanie danych przez u�ytkownika - klasyczny "input"
		
		String imie;
		
		String imie2;
		
		System.out.println("Wprowadz swoje imi�:");
		
		// Poni�sza konstrukcja jest wymagana poniwa� po kazdym uzyciu Scannera musimy zamkn�� obiekt i je�eli b�dziemy chcieli znowu u�y� polecenia Scanner to nam wy�wietli b��d 
		
		Scanner odczyt = new Scanner(new FilterInputStream(System.in){ // deklarujemy obekt typu scanner o nazwie odczyt i inicjalizujemy go 
			@Override
			public void close(){};
		});
		
		// Scanner odczyt = new Scanner(System.in);
		
		imie = odczyt.nextLine(); // a tutaj przypisujemy do zmiennej imie typu string to co wpisalismy do obiektu Scanner
		
		System.out.println("Witaj " + imie);

		odczyt.close();
		
		System.out.println("Wprowadz swoje imi�:");
		
		Scanner odczyt2 = new Scanner(System.in);
		
		imie2 = odczyt2.nextLine();
		
		System.out.println("Witaj " + imie2);
		
		odczyt2.close();
		
	}

}
