package java_dzien_trzeci_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_J33 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){ // deklarujemy obekt typu scanner o nazwie odczyt i inicjalizujemy go 
			@Override
			public void close(){};
		});
		
		System.out.println("Podaj napis:");
		
		String napis = input.nextLine();
		
		System.out.println("Podaj liczb�:");
		
		int liczba = input.nextInt();
		
		napis.length();
		
		for (int i = 0; i <= napis.length() - 1; i = i + liczba){
			System.out.print(napis.charAt(i));
		}
		
		input.close();
		
	}

}
