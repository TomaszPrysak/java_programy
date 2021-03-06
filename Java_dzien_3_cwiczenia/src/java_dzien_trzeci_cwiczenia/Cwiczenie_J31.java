package java_dzien_trzeci_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_J31 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){ // deklarujemy obekt typu scanner o nazwie odczyt i inicjalizujemy go 
			@Override
			public void close(){};
		});
		
		System.out.println("Podaj pierwszy wyraz:");
		
		String wyraz1 = input.nextLine();
		
		System.out.println("Podaj drugi wyraz:");
		
		String wyraz2 = input.nextLine();
		
		char A = wyraz2.charAt(wyraz2.length() - 3); // zdeklarowanie zmiennej A typu chart (znak) i inicjalizowanie do niej 3 litery od ko�ca z wyrazu 2
		
		String separator = String.valueOf(A); // poniewa� ka�da zaminna (i nie tylko zmienna, tablica te� itd) w javie jest innym typem to musimy przekszta�ca� z jednego typu zmiennej 
		
		for (String res: wyraz1.split(separator)){
			System.out.println(res);
		}
		
		input.close();
		
	}

}
