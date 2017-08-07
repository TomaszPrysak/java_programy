package java_dzien_drugi_cwiczenia;

import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Cwiczenie_J27 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {
			};
		});

		input.useLocale(Locale.US);
		
		System.out.println("Podaj pocz¹tek przedzia³u:");
		
		int start = input.nextInt();
		
		System.out.println("Podaj koniec przedzia³u:");
		
		int stop = input.nextInt();
		
		if (start > stop){
			System.out.println("Pocz¹tek jest wiêkszy od koñca");
		}
		
		System.out.println("Wprowadz liczbê:");			
		float x = input.nextFloat();

		if (x > start) {
			if (x < stop) {
				System.out.println("Liczba " + x + " zawiera siê w przedziale <" + start + "," + stop +">");
			} else {
				System.out.println("Liczba " + x + " jest wieksza od 0 i wieksza od 1");
			}
		}

	}

}
