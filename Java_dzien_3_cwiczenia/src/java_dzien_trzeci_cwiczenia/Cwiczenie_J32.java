package java_dzien_trzeci_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_J32 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){ // deklarujemy obekt typu scanner o nazwie odczyt i inicjalizujemy go 
			@Override
			public void close(){};
		});
		
		System.out.println("Podaj sw�j wiek:");
		
		int wiek = input.nextInt();
		
		if (wiek >= 18){
			System.out.println("Mo�esz g�osowa�");
		}else{
			System.out.println("Nie mo�esz g�osowa�");
		}
			
		input.close();
	}

}
